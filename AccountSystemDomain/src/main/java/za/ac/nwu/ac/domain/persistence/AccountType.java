package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "AccountType")
public class AccountType implements Serializable{

    private static final long serialVersionUID = 6481782169831339626L;

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_REQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")

    private Long AccountTypeID;
    private String TypeOfAccount;
    private float RewardsKey ;
    private String mnemonic;

    public AccountType(Long AccountTypeID, String TypeOfAccount, float RewardsKey, String mnemonic) {
        this.AccountTypeID = AccountTypeID;
        this.TypeOfAccount = TypeOfAccount;
        this.RewardsKey = RewardsKey;
        this.mnemonic = mnemonic;
    }

    public AccountType(String typeOfAccount, float rewardsKey, String mnemonic) {
    }

    @Column(name = "AccountTypeID")
    public Long getAccountTypeID() {
        return AccountTypeID;
    }

    public void setAccountTypeID(Long accountTypeID) {
        AccountTypeID = accountTypeID;
    }

    @Column(name = "TypeOfAccount")
    public String getTypeOfAccount() {
        return TypeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        TypeOfAccount = typeOfAccount;
    }

    @Column(name = "RewardsKey")
    public float getRewardsKey() {
        return RewardsKey;
    }

    public void setRewardsKey(float rewardsKey) {
        RewardsKey = rewardsKey;
    }

    @Column(name = "mnemonic")
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
        AccountType that = (AccountType) o;
        return Float.compare(that.RewardsKey, RewardsKey) == 0 && Objects.equals(AccountTypeID, that.AccountTypeID) && Objects.equals(TypeOfAccount, that.TypeOfAccount) && Objects.equals(mnemonic, that.mnemonic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AccountTypeID, TypeOfAccount, RewardsKey, mnemonic);
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "AccountTypeID=" + AccountTypeID +
                ", TypeOfAccount='" + TypeOfAccount + '\'' +
                ", RewardsKey=" + RewardsKey +
                ", mnemonic='" + mnemonic + '\'' +
                '}';
    }
}
