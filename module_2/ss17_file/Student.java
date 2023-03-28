package ss17_file;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String address;
    private transient String note;

    public Student(){}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public Student(String name, int age, String address) {
//        this();
        this(name, age);
//        this(name, address);
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
