package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "RewardStore")
public class RewardStore implements Serializable{

    private static final long serialVersionUID = 6481782169831339626L;

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_REQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name = "AMTGAINED")
    private float AMTGAINED;

    @Column(name = "MULTIPLIER")
    private int MULTIPLIER ;

    @Column(name = "POINTSPENT")
    private float POINTSPENT ;

    @Column(name = "CURRENTAMT")
    private String CURRENTAMT ;

}
