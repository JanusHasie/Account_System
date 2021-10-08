package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "USERDETAILS")
public class AccountType implements Serializable{

    private static final long serialVersionUID = 6481782169831339626L;

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_REQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")

    private AccountType TYPEOFACCOUNT;
    private float REWARDSKEY ;


    @Column(name = "TYPEOFACCOUNT")
    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "TYPEOFACCOUNT")
    public AccountType getTYPEOFACCOUNT() {
        return TYPEOFACCOUNT;
    }

    public void setTYPEOFACCOUNT(AccountType TYPEOFACCOUNT) {
        this.TYPEOFACCOUNT = TYPEOFACCOUNT;
    }

    @Column(name = "REWARDSKEY")
    public float getREWARDSKEY() {
        return REWARDSKEY;
    }

    public void setREWARDSKEY(float REWARDSKEY) {
        this.REWARDSKEY = REWARDSKEY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return TYPEOFACCOUNT == that.TYPEOFACCOUNT && Float.compare(that.REWARDSKEY, REWARDSKEY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(TYPEOFACCOUNT, REWARDSKEY);
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "TYPEOFACCOUNT=" + TYPEOFACCOUNT +
                ", REWARDSKEY=" + REWARDSKEY +
                '}';
    }
}
