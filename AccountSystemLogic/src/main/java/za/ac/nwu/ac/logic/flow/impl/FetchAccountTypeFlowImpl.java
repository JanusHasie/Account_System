package za.ac.nwu.ac.logic.flow.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.logic.flow.FetchAccountTypeFlow;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;

    @Autowired
    public FetchAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator){
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public List<AccountTypeDto> getAllAccountTypes(){
        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();
        accountTypeDtos.add(new AccountTypeDto("Basic",0, "MILES"));
        return accountTypeDtos;
    }

    @Override
    public AccountTypeDto getAccountTypeByMnemonic(String mnemonic) {
        return null;
    }

    @Override
    public AccountTypeDto getAccountTypeByMnemonic(AccountTypeDto mnemonic) {
        return accountTypeTranslator.getAccountTypeByMnemonicNativeQuery(mnemonic);
    }

    public boolean methodToTest() {
        return true;
    }

}
