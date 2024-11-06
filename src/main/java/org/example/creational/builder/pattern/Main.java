package org.example.creational.builder.pattern;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        UserDTOBuilder userDTOBuilder = new UserWebDTOBuilderImpl();

        UserDTO userDTO = userDTOBuilder
                .withFirstName("Bhavin")
                .withLastName("Gupta")
                .withAge("20")
                .build();

        System.out.println(userDTO.getName());
        System.out.println(userDTO.getAge());

        System.out.println("-------------------------");

        UserDTO userDTO2 = userDTOBuilder
                .withFirstName("Aatish")
                .withLastName("Azad")
                .withAge("22")
                .build();

        System.out.println(userDTO2.getName());
        System.out.println(userDTO2.getAge());


        System.out.println(userDTO2 == userDTO);
        // some inbuilt examples
        System.out.println("-------------------------");

        StringBuilder stringBuilder = new StringBuilder().append("1").append("1");
        System.out.println(stringBuilder);

        Calendar calendar = new GregorianCalendar();

    }
}
