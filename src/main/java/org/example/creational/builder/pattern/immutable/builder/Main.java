package org.example.creational.builder.pattern.immutable.builder;

public class Main {

    public static void main(String[] args) {
       UserDTO.UserDTOBuilder2 userDTOBuilder2 =  UserDTO.getBuilder();

       UserDTO userDTO = userDTOBuilder2
               .withFirstName("Bhavin")
               .withLastName("gupta")
               .withAge(22)
               .build();

        System.out.println(userDTO.getfName());
    }
}
