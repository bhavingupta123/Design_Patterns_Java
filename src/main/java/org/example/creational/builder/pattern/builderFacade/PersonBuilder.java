package org.example.creational.builder.pattern.builderFacade;

public class PersonBuilder {

    protected Person person = new Person();

    public PersonAddressBuilder lives(){
        return new PersonAddressBuilder(person);
    }

    public PersonJobBuilder works(){
        return new PersonJobBuilder(person);
    }

    public Person build(){
        return person;
    }
}
