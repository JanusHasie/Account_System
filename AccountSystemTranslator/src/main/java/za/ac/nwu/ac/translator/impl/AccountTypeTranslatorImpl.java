package za.ac.nwu.ac.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.domain.persistence.RewardStore;
import za.ac.nwu.ac.domain.persistence.UserDetails;
import za.ac.nwu.ac.repo.persistence.AccountTypeRepository;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

@Component
public class AccountTypeTranslatorImpl implements AccountTypeTranslator {
    private final AccountTypeRepository accountTypeRepository;
    @Autowired
    public AccountTypeTranslatorImpl(AccountTypeRepository accountTypeRepository){
        this.accountTypeRepository = accountTypeRepository;
    }

    @Override
    public AccountTypeDto getAccountTypeDtoByMnemonic(String mnemonic) {
        try{
            AccountType accountType = accountTypeRepository.getAccountTypeDtoByMnemonic(mnemonic);
            return new AccountTypeDto(accountType);
        }catch (Exception e){
            throw new RuntimeException("Unable to read from the DB", e);
        }
    }

    @Override
    public AccountTypeDto create(AccountTypeDto accountTypeDto) {
        try{
            AccountType accountType = accountTypeRepository.save(accountTypeDto.getAccountType());
            return new AccountTypeDto(accountType);
        }catch (Exception e){
            throw new RuntimeException("Unable to save to the DB", e);
        }
    }

    @Override
    public AccountTypeDto getAccountTypeByMnemonicNativeQuery(AccountTypeDto mnemonic) {
        return null;
    }

    @Override
    public AccountTypeDto getAccountTypeByMnemonic(String mnemonic) {
        return null;
    }

    @Override
    public AccountType create(AccountType accountType) {
        return null;
    }

    @Override
    public RewardStore create(RewardStore multiplier) {
        return null;
    }

    @Override
    public UserDetails create(UserDetails userIDnum) {
        return null;
    }
}
