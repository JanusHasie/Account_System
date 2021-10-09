package za.ac.nwu.ac.logic.flow;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.domain.persistence.UserDetails;

public interface CreateAccountTypeFlow {
    AccountType create(AccountType accountType);

    UserDetails create(UserDetails userIDnum);

    AccountTypeDto create(AccountTypeDto accountType);
}
