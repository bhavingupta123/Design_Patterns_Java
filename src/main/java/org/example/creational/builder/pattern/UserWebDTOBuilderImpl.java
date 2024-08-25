package org.example.creational.builder.pattern;

// Concrete WebDTO builder
public class UserWebDTOBuilderImpl implements UserDTOBuilder {

    private String lname;
    private String fname;
    private String age;

    private UserDTO userDTO;
    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lname = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.fname = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withAge(String age) {
        this.age = age;
        return this;
    }

    @Override
    public UserDTO build() {
        userDTO = new UserWebDTO(fname + " " + lname, age);
        return userDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return userDTO;
    }
}
