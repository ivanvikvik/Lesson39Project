package by.itstep.vikvik.javalessons.model.logic;

import by.itstep.vikvik.javalessons.model.entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentBinaryWorker {
    public static void write(String fileName, Student[] students) {
        DataOutputStream stream = null;
        try {
            stream = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(fileName)));

            stream.writeInt(students.length);

            for (Student student : students) {
                stream.writeUTF(student.getName());
                stream.writeInt(student.getAge());
                stream.writeDouble(student.getMark());
                stream.writeBoolean(student.isAlive());
            }

        } catch (IOException exception) {
            System.out.println(exception);
        } finally {
            try {
                if (stream != null) {
                    stream.flush();
                    stream.close();
                }
            } catch (IOException exception) {
                System.out.println(exception);
            }
        }
    }

    public static List<Student> read(String fileName) {
        DataInputStream stream = null;

        List<Student> list = new ArrayList<>();

        try {
            stream = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(fileName)));

            int size = stream.readInt();

            for (int i = 0; i < size; i++) {
                Student student = new Student();
                student.setName(stream.readUTF());
                student.setAge(stream.readInt());
                student.setMark(stream.readDouble());
                student.setAlive(stream.readBoolean());
                list.add(student);
            }
        } catch (IOException exception) {
            System.out.println(exception);
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException exception) {
                System.out.println(exception);
            }
        }
        return list;
    }
}
