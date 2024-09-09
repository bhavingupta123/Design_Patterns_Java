package org.example.behavioral.strategy.design;

import org.example.behavioral.strategy.design.sort.strategy.SortByAge;
import org.example.behavioral.strategy.design.sort.strategy.SortByName;
import org.example.behavioral.strategy.design.sort.strategy.SortByStrategy;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("a", 22);
        Person p3 = new Person("f", 40);
        Person p2 = new Person("d", 20);


        Person.list.add(p1);
        Person.list.add(p3);
        Person.list.add(p2);

        SortByStrategy strategy = new SortByAge();
        strategy.sortBy(Person.list);

        for (Person e: Person.list) {
            System.out.println(e);
        }

        System.out.println("********************");

        SortByStrategy strategy2 = new SortByName();
        strategy2.sortBy(Person.list);

        for (Person e: Person.list) {
            System.out.println(e);
        }
    }
}
