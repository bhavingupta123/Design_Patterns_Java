package org.example.creational.builder.pattern;

//Product
public class UserWebDTO implements UserDTO{

    private String name;
    private String age;

    public UserWebDTO(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

}
