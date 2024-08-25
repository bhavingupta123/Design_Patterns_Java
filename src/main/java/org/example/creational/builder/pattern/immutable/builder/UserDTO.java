package org.example.creational.builder.pattern.immutable.builder;

import org.example.creational.builder.pattern.UserDTOBuilder;
import org.example.creational.builder.pattern.UserWebDTO;

public class UserDTO {

    private String fName;
    private String lName;

    private int age;

    public String getfName() {
        return fName;
    }

    private void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    private void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public static UserDTOBuilder2 getBuilder(){
        return new UserDTOBuilder2();
    }

    public static class UserDTOBuilder2{

        private String fName;
        private String lName;
        private int age;

        public UserDTOBuilder2 withLastName(String lname) {
            this.lName = lname;
            return this;
        }

        public UserDTOBuilder2 withFirstName(String fname) {
            this.fName = fname;
            return this;
        }

        public UserDTOBuilder2 withAge(int age) {
            this.age = age;
            return this;
        }

        public UserDTO build() {
            UserDTO userDTO = new UserDTO();

            userDTO.setAge(age);
            userDTO.setfName(fName);
            userDTO.setlName(lName);

            return userDTO;
        }
    }
}
