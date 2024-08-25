package org.example.creational.factory.abstracts.factory;

import org.example.creational.factory.abstracts.factory.factories.GameUnitFactory;
import org.example.creational.factory.abstracts.factory.factories.IndustrialGameUnitFactory;
import org.example.creational.factory.abstracts.factory.products.land.LandUnit;
import org.example.creational.factory.abstracts.factory.products.naval.NavalUnit;

public class Main {

    public static void main(String[] args) {
        GameUnitFactory gameUnitFactory = new IndustrialGameUnitFactory();
        LandUnit landUnit = gameUnitFactory.createLandUnit();
        NavalUnit navalUnit = gameUnitFactory.createNavalUnit();

    }
}
