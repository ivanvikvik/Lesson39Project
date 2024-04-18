package by.itstep.vikvik.javalessons.model.logic;

import by.itstep.vikvik.javalessons.model.entity.Student;

import java.io.*;

public class StudentSerializer {
    public static void serialize(String fileName, Student student) {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(fileName)))) {

            stream.writeObject(student);
            stream.flush();

        } catch (IOException exception) {
            System.out.println(exception);
        }
    }

    public static Student deserialize(String fileName) {
        Student student = null;
        try (ObjectInputStream stream = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(fileName)))) {

            student = (Student)stream.readObject();

        } catch (IOException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return student;
    }
}
