package org.example.creational.singleton.design.using.enums;

public enum RegistryEnum {

    INSTANCE;

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void performAction() {
        // Implement your business logic here
        System.out.println("Performing action in Singleton instance.");
    }
}


/*
Enum Declaration: The enum type itself ensures that only one instance of Singleton is created. The JVM guarantees that any enum value is instantiated only once in a Java program.

Singleton Instance: The INSTANCE is the single element of the enum, and it represents the singleton instance.

Private Fields and Methods: You can define private fields and methods just like in a regular class. In the example above, there's a private integer field value and a method performAction to demonstrate that the enum can hold state and behavior.

Accessor Methods: Getter and setter methods (getValue and setValue) are provided to access and modify the private field value
*/