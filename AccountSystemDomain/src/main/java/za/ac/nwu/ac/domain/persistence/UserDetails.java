package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "USERDETAILS")
public class UserDetails implements Serializable{


    private static final long serialVersionUID = 6481782169831339626L;

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_REQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name = "USERID")
    private long AccountTypeId;

    @Column(name = "USERIDNUMBER")
    private String USERIDNUMBER ;

    @Column(name = "USERNAME")
    private String USERNAME ;

    @Column(name = "USERLNAME")
    private String USERLNAME ;

    @Column(name = "USERCELLNUM")
    private String USERCELLNUM ;

    @Column(name = "USERAGE")
    private int USERAGE ;

    @Column(name = "USERGENDER")
    private String USERGENDER ;

}
