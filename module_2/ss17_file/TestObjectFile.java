package ss17_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestObjectFile {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nam", 18, "Da Nang"));
        students.add(new Student("Thanh", 19, "Da Nang"));
        students.add(new Student("Bao", 20, "Quang Nam"));

//         writeFile("src\\ss17_file\\sampleObject.csv", students);
        List<Student> list = (List<Student>)readFile("D:\\codegym\\src\\ss17_file\\sampleObject.csv");
        if (list == null){
            System.out.println("a");

        }        list.forEach(System.out::println);
    }

    public static void writeFile(String path, Object o) {
        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(
                             new FileOutputStream(path))) {
            outputStream.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readFile(String path) {
        try (ObjectInputStream input =
                     new ObjectInputStream(
                             new FileInputStream(path)
                     )) {
            return input.readObject();
        } catch (IOException|ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
