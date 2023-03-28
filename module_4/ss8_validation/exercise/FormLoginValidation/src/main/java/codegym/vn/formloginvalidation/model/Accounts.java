package codegym.vn.formloginvalidation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
@Entity
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAccounts;
    @NotBlank(message = "{noteEmpty}")
    @Size(min = 8, message = "{nameAccounts.size}")
    private String nameAccounts;
    @Email(message = "{emailAccounts.illegal}")
    private String emailAccounts;
    @Size(min = 8, max = 15,message = "{passWordAccounts.size}")
    private String passWordAccounts;

    public Accounts() {
    }

    public Accounts(Integer idAccounts, String nameAccounts, String emailAccounts, String passWordAccounts) {
        this.idAccounts = idAccounts;
        this.nameAccounts = nameAccounts;
        this.emailAccounts = emailAccounts;
        this.passWordAccounts = passWordAccounts;
    }

    public String getEmailAccounts() {
        return emailAccounts;
    }

    public void setEmailAccounts(String emailAccounts) {
        this.emailAccounts = emailAccounts;
    }

    public Integer getIdAccounts() {
        return idAccounts;
    }

    public void setIdAccounts(Integer idAccounts) {
        this.idAccounts = idAccounts;
    }

    public String getNameAccounts() {
        return nameAccounts;
    }

    public void setNameAccounts(String nameAccounts) {
        this.nameAccounts = nameAccounts;
    }

    public String getPassWordAccounts() {
        return passWordAccounts;
    }

    public void setPassWordAccounts(String passWordAccounts) {
        this.passWordAccounts = passWordAccounts;
    }
}
