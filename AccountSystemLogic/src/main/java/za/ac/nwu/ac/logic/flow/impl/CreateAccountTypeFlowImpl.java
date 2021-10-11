package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.domain.persistence.UserDetails;
import za.ac.nwu.ac.logic.flow.CreateAccountTypeFlow;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import javax.transaction.Transactional;

@Transactional
@Component("createAccountTypeFlowName")
public class CreateAccountTypeFlowImpl implements CreateAccountTypeFlow {

    private final AccountTypeTranslator accountTypeTranslator;
    public CreateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public AccountType create(AccountType accountType) {
//        float rewardsKey = accountType.getRewardsKey();
        if(0 == accountType.getRewardsKey()) {
            accountType.setRewardsKey(0);
        }
        return accountTypeTranslator.create(accountType);
    }

    @Override
    public UserDetails create(UserDetails userIDnum) {
        return null;
    }

    @Override
    public AccountTypeDto create(AccountTypeDto accountType) {
        return null;
    }
}
