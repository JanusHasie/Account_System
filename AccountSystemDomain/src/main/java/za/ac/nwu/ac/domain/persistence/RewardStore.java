package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "RewardStore")
public class RewardStore implements Serializable{

    private static final long serialVersionUID = 6481782169831339626L;

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_REQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")

    private float AMTGAINED;
    private int MULTIPLIER ;
    private float POINTSPENT ;
    private String CURRENTAMT ;


    @Column(name = "AMTGAINED")
    public float getAMTGAINED() {
        return AMTGAINED;
    }

    public void setAMTGAINED(float AMTGAINED) {
        this.AMTGAINED = AMTGAINED;
    }

    @Column(name = "MULTIPLIER")
    public int getMULTIPLIER() {
        return MULTIPLIER;
    }

    public void setMULTIPLIER(int MULTIPLIER) {
        this.MULTIPLIER = MULTIPLIER;
    }

    @Column(name = "POINTSPENT")
    public float getPOINTSPENT() {
        return POINTSPENT;
    }

    public void setPOINTSPENT(float POINTSPENT) {
        this.POINTSPENT = POINTSPENT;
    }

    @Column(name = "CURRENTAMT")
    public String getCURRENTAMT() {
        return CURRENTAMT;
    }

    public void setCURRENTAMT(String CURRENTAMT) {
        this.CURRENTAMT = CURRENTAMT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RewardStore that = (RewardStore) o;
        return Float.compare(that.AMTGAINED, AMTGAINED) == 0 && MULTIPLIER == that.MULTIPLIER && Float.compare(that.POINTSPENT, POINTSPENT) == 0 && Objects.equals(CURRENTAMT, that.CURRENTAMT);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AMTGAINED, MULTIPLIER, POINTSPENT, CURRENTAMT);
    }

    @Override
    public String toString() {
        return "RewardStore{" +
                "AMTGAINED=" + AMTGAINED +
                ", MULTIPLIER=" + MULTIPLIER +
                ", POINTSPENT=" + POINTSPENT +
                ", CURRENTAMT='" + CURRENTAMT + '\'' +
                '}';
    }
}
