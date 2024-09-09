package org.example.behavioral.strategy.design;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public static List<Person> list = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name;
    public int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
