package org.example.creational.builder.pattern;

// interface for the builder
public interface UserDTOBuilder {

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withFirstName(String fname);

    UserDTOBuilder withAge(String age);

    UserDTO build();

    UserDTO getUserDTO();
}
