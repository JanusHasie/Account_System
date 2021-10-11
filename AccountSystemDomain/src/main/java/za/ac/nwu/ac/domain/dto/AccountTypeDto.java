package za.ac.nwu.ac.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.util.Objects;

@ApiModel(value = "AccountType", description = "A DTO that represents the AccountType")

public class AccountTypeDto {

    private String TypeOfAccount;
    private float RewardsKey ;
    private String mnemonic;

    public AccountTypeDto() {
    }

    public AccountTypeDto(String TypeOfAccount, float RewardsKey, String mnemonic) {
        this.TypeOfAccount = TypeOfAccount;
        this.RewardsKey = RewardsKey;
        this.mnemonic = mnemonic;
    }

    public AccountTypeDto(AccountType accountType) {

        this.setTypeOfAccount(accountType.getTypeOfAccount());
        this.setRewardsKey(accountType.getRewardsKey());
        this.setMnemonic(accountType.getMnemonic());
    }

    public String getTypeOfAccount() {
        return TypeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        TypeOfAccount = typeOfAccount;
    }

    public float getRewardsKey() {
        return RewardsKey;
    }

    public void setRewardsKey(float rewardsKey) {
        RewardsKey = rewardsKey;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTypeDto that = (AccountTypeDto) o;
        return Float.compare(that.RewardsKey, RewardsKey) == 0 && Objects.equals(TypeOfAccount, that.TypeOfAccount) && Objects.equals(mnemonic, that.mnemonic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TypeOfAccount, RewardsKey, mnemonic);
    }

    @JsonIgnore
    public AccountType getAccountType(){
        return new AccountType(getTypeOfAccount(), getRewardsKey(), getMnemonic());
    }
    @Override
    public String toString() {
        return "AccountTypeDto{" +
                "TYPEOFACCOUNT='" + TypeOfAccount + '\'' +
                ", REWARDSKEY=" + RewardsKey +
                ", mnemonic='" + mnemonic + '\'' +
                '}';
    }
}
