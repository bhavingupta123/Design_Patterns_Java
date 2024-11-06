package org.example.creational.builder.pattern.builderFacade;

public class Main {

    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        Person person = personBuilder
                .lives()
                    .city("Bangalore")
                    .postcode("560061")
                    .street("street 1")
                .works()
                    .companyName("Amazon")
                    .annualIncome(25)
                    .position("SDE 1")
                .build();



        System.out.println(person);

        System.out.println("--------------------------------------------------------------------------------------------");

        Person person2 = personBuilder
                .lives()
                .city("Mysore")
                .postcode("550061")
                .street("street 2")
                .works()
                .companyName("Si")
                .annualIncome(20)
                .position("SDE 2")
                .build();

        System.out.println(person2);

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println(person==person2);
    }
}