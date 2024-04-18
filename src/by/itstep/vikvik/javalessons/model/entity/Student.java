package by.itstep.vikvik.javalessons.model.entity;

import java.io.IOException;
import java.io.Serializable;

class Note {

}

// Java Bean
public class Student extends Human implements Serializable {
    private static final long serialVersionUID = 1L;
    private double mark;
    private boolean alive;
    private int id;
//    private Note note;

    public Student() {
        super();
//        note = new Note();
        System.out.println("default constructor");
    }

    public Student(String name, int age, double mark, boolean alive, int id) {
        super(name, age);
//        note = new Note();
        System.out.println("canonical constructor");
//        this.name = name;
//        this.age = age;
        this.mark = mark;
        this.alive = alive;
        this.id = id;
    }

    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.defaultWriteObject();
        out.writeUTF(name);
        out.writeInt(age);
    }

    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        name = in.readUTF();
        age = in.readInt();
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                ", alive=" + alive +
                ", id=" + id +
                '}';
    }
}
