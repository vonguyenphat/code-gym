package codegym.vn.managerstudent.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStudent;
    @NotBlank(message = "{notempty}")
    @Size(message = "name.size")
    private String nameStudent;
    @ManyToOne()
    @JoinColumn(name = "classID", referencedColumnName = "classID")
    private ClassName className;

    private String email;
    private boolean sex;
    @NotBlank(message = "Vui lòng nhập số điện thoại")
    private String phoneNumber;
    private Date birthdate;

    public Student() {
    }
    public Student(Integer idStudent, String nameStudent, ClassName className, String email, boolean sex, String
        phoneNumber, Date birthdate){
            this.idStudent = idStudent;
            this.nameStudent = nameStudent;
            this.className = className;
            this.email = email;
            this.sex = sex;
            this.phoneNumber = phoneNumber;
            this.birthdate = birthdate;
        }

        public Integer getIdStudent () {
            return idStudent;
        }

        public void setIdStudent (Integer idStudent){
            this.idStudent = idStudent;
        }

        public String getNameStudent () {
            return nameStudent;
        }

        public void setNameStudent (String nameStudent){
            this.nameStudent = nameStudent;
        }

        public ClassName getClassName () {
            return className;
        }

        public void setClassName (ClassName className){
            this.className = className;
        }

        public String getEmail () {
            return email;
        }

        public void setEmail (String email){
            this.email = email;
        }

        public boolean isSex () {
            return sex;
        }

        public void setSex ( boolean sex){
            this.sex = sex;
        }

        public String getPhoneNumber () {
            return phoneNumber;
        }

        public void setPhoneNumber (String phoneNumber){
            this.phoneNumber = phoneNumber;
        }

        public Date getBirthdate () {
            return birthdate;
        }

        public void setBirthdate (Date birthdate){
            this.birthdate = birthdate;
        }
    }
