package za.ac.nwu.ac.logic.flow.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CreateAccountTypeFlowImplTest {

    private CreateAccountTypeFlowImpl flow;
    private AccountTypeTranslator translator;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void create() {
        when(translator.create(any(AccountTypeDto.class))).then(returnFirstArg());
        AccountTypeDto result = flow.create(any(AccountTypeDto.class));
        assertNotNull(result);
        verify(translator, times(2)).create(any(AccountTypeDto.class));
    }

    @Test
    public void Contains() {
        when(translator.getAccountTypeByMnemonic(anyString())).thenThrow(new RuntimeException());
        try{
            flow.create(new AccountTypeDto());
            fail("Throw Exception");
        }
        catch (Exception e) {

        }
        verify(translator, times(1)).getAccountTypeDtoByMnemonic(anyString());
        verify(translator, never()).create(any(AccountTypeDto.class));
    }

    private Answer<?> returnFirstArg() {
        return null;
    }
}