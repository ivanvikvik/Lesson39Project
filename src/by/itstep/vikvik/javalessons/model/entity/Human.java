package by.itstep.vikvik.javalessons.model.entity;

import java.io.Serializable;

public class Human implements Serializable {
    private static final long serialVersionUID = 1L;

    protected transient String name;
    protected transient int age;

    public Human() {
        System.out.println("Human default constructor");
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
