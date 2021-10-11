package za.ac.nwu.ac.translator;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.domain.persistence.RewardStore;
import za.ac.nwu.ac.domain.persistence.UserDetails;

public interface AccountTypeTranslator {
    AccountTypeDto getAccountTypeDtoByMnemonic(String mnemonic);

    AccountTypeDto create(AccountTypeDto accountType);

    AccountTypeDto getAccountTypeByMnemonicNativeQuery(AccountTypeDto mnemonic);
    AccountTypeDto getAccountTypeByMnemonic(String mnemonic);

    AccountType create(AccountType accountType);

    RewardStore create(RewardStore multiplier);

    UserDetails create(UserDetails userIDnum);
}
