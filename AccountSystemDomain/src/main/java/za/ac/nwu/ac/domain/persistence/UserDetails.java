package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "USERDETAILS")
public class UserDetails implements Serializable{


    private static final long serialVersionUID = 6481782169831339626L;

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_REQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name = "USERID")
    private long AccountTypeId;


    private String USERIDNUMBER ;
    private String USERNAME ;
    private String USERLNAME ;
    private String USERCELLNUM ;
    private int USERAGE ;
    private String USERGENDER ;

    public long getAccountTypeId() {
        return AccountTypeId;
    }

    public void setAccountTypeId(long accountTypeId) {
        AccountTypeId = accountTypeId;
    }

    @Column(name = "USERIDNUMBER")
    public String getUSERIDNUMBER() {
        return USERIDNUMBER;
    }

    public void setUSERIDNUMBER(String USERIDNUMBER) {
        this.USERIDNUMBER = USERIDNUMBER;
    }

    @Column(name = "USERNAME")
    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    @Column(name = "USERLNAME")
    public String getUSERLNAME() {
        return USERLNAME;
    }

    public void setUSERLNAME(String USERLNAME) {
        this.USERLNAME = USERLNAME;
    }

    @Column(name = "USERCELLNUM")
    public String getUSERCELLNUM() {
        return USERCELLNUM;
    }

    public void setUSERCELLNUM(String USERCELLNUM) {
        this.USERCELLNUM = USERCELLNUM;
    }

    @Column(name = "USERAGE")
    public int getUSERAGE() {
        return USERAGE;
    }

    public void setUSERAGE(int USERAGE) {
        this.USERAGE = USERAGE;
    }

    @Column(name = "USERGENDER")
    public String getUSERGENDER() {
        return USERGENDER;
    }

    public void setUSERGENDER(String USERGENDER) {
        this.USERGENDER = USERGENDER;
    }

    public UserDetails(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetails that = (UserDetails) o;
        return AccountTypeId == that.AccountTypeId && USERAGE == that.USERAGE && Objects.equals(USERIDNUMBER, that.USERIDNUMBER) && Objects.equals(USERNAME, that.USERNAME) && Objects.equals(USERLNAME, that.USERLNAME) && Objects.equals(USERCELLNUM, that.USERCELLNUM) && Objects.equals(USERGENDER, that.USERGENDER);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AccountTypeId, USERIDNUMBER, USERNAME, USERLNAME, USERCELLNUM, USERAGE, USERGENDER);
    }

    @Override
    public String  toString() {
        return "UserDetails{" +
                "AccountTypeId=" + AccountTypeId +
                ", USERIDNUMBER='" + USERIDNUMBER + '\'' +
                ", USERNAME='" + USERNAME + '\'' +
                ", USERLNAME='" + USERLNAME + '\'' +
                ", USERCELLNUM='" + USERCELLNUM + '\'' +
                ", USERAGE=" + USERAGE +
                ", USERGENDER='" + USERGENDER + '\'' +
                '}';
    }
}
