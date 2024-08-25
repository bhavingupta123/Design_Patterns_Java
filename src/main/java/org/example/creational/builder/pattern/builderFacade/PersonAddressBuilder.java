package org.example.creational.builder.pattern.builderFacade;

public class PersonAddressBuilder extends PersonBuilder{
    public PersonAddressBuilder(Person p) {
        this.person = p;
    }

    public PersonAddressBuilder street(String streetAddress){
        person.streetAddress = streetAddress;
        return this;
    }

    public PersonAddressBuilder city(String city){
        person.city = city;
        return this;
    }

    public PersonAddressBuilder postcode(String postcode){
        person.postcode = postcode;
        return this;
    }
}
