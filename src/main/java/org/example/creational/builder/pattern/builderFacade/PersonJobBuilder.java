package org.example.creational.builder.pattern.builderFacade;

public class PersonJobBuilder extends PersonBuilder{

    public PersonJobBuilder(Person p) {
        this.person = p;
    }

    public PersonJobBuilder position(String position){
        person.position = position;
        return this;
    }

    public PersonJobBuilder companyName(String companyName){
        person.companyName = companyName;
        return this;
    }

    public PersonJobBuilder annualIncome(int annualIncome){
        person.annualIncome = annualIncome;
        return this;
    }
}
