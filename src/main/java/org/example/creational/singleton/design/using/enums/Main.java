package org.example.creational.singleton.design.using.enums;

public class Main {

    public static void main(String[] args) {
        RegistryEnum registryEnum =  RegistryEnum.INSTANCE;
        RegistryEnum registryEnum2 =  RegistryEnum.INSTANCE;

        registryEnum.setValue(42);

        System.out.println("Singleton value: " + registryEnum.getValue());

        registryEnum.performAction();

        System.out.println(registryEnum == registryEnum2);
    }
}
