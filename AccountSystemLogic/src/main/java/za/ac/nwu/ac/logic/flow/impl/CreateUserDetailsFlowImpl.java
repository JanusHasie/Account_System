package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.persistence.UserDetails;
import za.ac.nwu.ac.logic.flow.CreateUserDetailsFlow;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import javax.transaction.Transactional;

@Transactional
@Component("createAccountTypeFlowName")
public class CreateUserDetailsFlowImpl implements CreateUserDetailsFlow {

    private final AccountTypeTranslator accountTypeTranslator;
    public CreateUserDetailsFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public UserDetails create(UserDetails userIDnum) {
        String userID = userIDnum.getUSERIDNUMBER();
        if("" == userIDnum.getUSERIDNUMBER()) {
            userIDnum.setUSERIDNUMBER(userID);
        }
        return accountTypeTranslator.create(userIDnum);
    }

}
