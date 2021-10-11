package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.persistence.RewardStore;
import za.ac.nwu.ac.logic.flow.CreateRewardStoreFlow;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import javax.transaction.Transactional;

@Transactional
@Component("createAccountTypeFlowName")
public class CreateRewardStoreFlowImpl implements CreateRewardStoreFlow {

    private final AccountTypeTranslator accountTypeTranslator;
    public CreateRewardStoreFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public RewardStore create(RewardStore multiplier) {
        int mult = multiplier.getMULTIPLIER();
        if(1 == multiplier.getMULTIPLIER()) {
            multiplier.setMULTIPLIER(mult);
        }
        return accountTypeTranslator.create(multiplier);
    }
}
