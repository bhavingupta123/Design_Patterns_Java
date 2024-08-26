package org.example.creational.prototype.design;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        SwordsMan s1 = new SwordsMan();
        s1.attack();

        System.out.println("s1");
        System.out.println(s1);

        System.out.println("-----------------------");

        SwordsMan s2 = (SwordsMan) s1.clone();

        System.out.println("s2");
        System.out.println(s2);

    }
}
