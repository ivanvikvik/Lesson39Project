package by.itstep.vikvik.javalessons.model.logic;

import by.itstep.vikvik.javalessons.model.entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentWorker {
    public static void write(String fileName, Student[] students) {
        Writer stream = null;
        try {
            stream = new BufferedWriter(new FileWriter(fileName));

            for (Student student : students) {
                stream.write(student.getName() + "\n");
                stream.write(student.getAge() + "\n");
                stream.write(student.getMark() + "\n");
                stream.write(student.isAlive() + "\n");
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
//        BufferedReader stream = null;
        LineNumberReader stream = null;

        List<Student> list = new ArrayList<>();
        try {
            stream = new LineNumberReader(
                        new BufferedReader(
                            new FileReader(fileName)));

            while (true) {
                String name = stream.readLine();

                if (name == null) {
                    break;
                }

                Student student = new Student();
                student.setName(name);
                student.setAge(Integer.parseInt(stream.readLine()));
                student.setMark(Double.parseDouble(stream.readLine()));
                student.setAlive(Boolean.parseBoolean(stream.readLine()));
                list.add(student);
            }

            System.out.println(stream.getLineNumber());

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
