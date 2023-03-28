package codegym.vn.managerstudent.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class ClassName {
    @Id
    private Integer classID;
    private String className;
    @OneToMany(mappedBy = "className", fetch = FetchType.LAZY)
    private Set<Student> students;

    public ClassName() {
    }

    public ClassName(Integer classID, String className) {
        this.classID = classID;
        this.className = className;
    }

    public Integer getClassID() {
        return classID;
    }

    public void setClassID(Integer classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
