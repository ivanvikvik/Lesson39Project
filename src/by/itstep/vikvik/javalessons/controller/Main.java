package by.itstep.vikvik.javalessons.controller;

import by.itstep.vikvik.javalessons.model.entity.Student;
import by.itstep.vikvik.javalessons.model.logic.StudentBinaryWorker;
import by.itstep.vikvik.javalessons.model.logic.StudentSerializer;
import by.itstep.vikvik.javalessons.model.logic.StudentWorker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String filename = "d:/vikvik/students.bin";
        Student student = new Student("Alex", 20, 9, true, 10);

        StudentSerializer.serialize(filename, student);
        System.out.println(StudentSerializer.deserialize(filename));

//        String filename = "d:/vikvik/example.txt";
//
//        try (Scanner scanner = new Scanner(
//                new BufferedReader(
//                        new FileReader(filename)))) {
//
//            while (scanner.hasNext()) {
//                if (scanner.hasNextInt()) {
//                    System.out.println("Integer - " + scanner.nextInt());
//                } else {
//                    System.out.println("Line - " + scanner.next());
//                }
//            }
//
//        } catch (IOException exception) {
//            System.out.println(exception);
//        }


//        Scanner scanner = new Scanner("kfsbdgbdh 10 1,9 fbdhjgd kfsbdgbdh 10 1,9");
//
//        while (scanner.hasNext()) {
//            if (scanner.hasNextInt()) {
//                System.out.println("Integer - " + scanner.nextInt());
//            } else if (scanner.hasNextDouble()) {
//                System.out.println("Double - " + scanner.nextDouble());
//            } else {
//                System.out.println("Line - " + scanner.next());
//            }
//        }


//        Student[] students = {
//                new Student("Alex", 20, 9, true),
//                new Student("Alice", 18, 8, true),
//                new Student("Potter", 16, 10, true)
//        };
////
//        String fileName = "D:/vikvik/example.bin";
//        StudentBinaryWorker.write(fileName, students);
//
//        List<Student> list = StudentBinaryWorker.read(fileName);
//
//        System.out.println(list);

//        StudentWorker.write(fileName, students);
//
//        List<Student> list = StudentWorker.read(fileName);
//
//        for (Student  student:list) {
//            System.out.println(student);
//        }
//
//        String bynaryFileName = "D:\\vikvik\\test.byn";
        //String bynaryFileName = "D:/vikvik/test.byn";

        //BinaryWorker.write(bynaryFileName);
//        String text = BinaryWorker.read(bynaryFileName);
//        System.out.println(text);

//        String charFileName = "D:/vikvik/test.txt";
//        //CharWorker.write(charFileName);
//        String buf = CharWorker.read(charFileName);
//        System.out.println(buf);
    }
}
