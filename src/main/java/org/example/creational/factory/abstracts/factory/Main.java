package org.example.creational.factory.abstracts.factory;

import org.example.creational.factory.abstracts.factory.factories.GameUnitFactory;
import org.example.creational.factory.abstracts.factory.factories.IndustrialGameUnitFactory;
import org.example.creational.factory.abstracts.factory.products.land.LandUnit;
import org.example.creational.factory.abstracts.factory.products.naval.NavalUnit;

public class Main {

    static NavalUnit createNavalUnit(GameUnitFactory gameUnitFactory){
        return gameUnitFactory.createNavalUnit();
    }

    static LandUnit createLandUnit(GameUnitFactory gameUnitFactory){
        return gameUnitFactory.createLandUnit();
    }

    public static void main(String[] args) {
        GameUnitFactory gameUnitFactory = new IndustrialGameUnitFactory();

        createNavalUnit(gameUnitFactory);
        createLandUnit(gameUnitFactory);



    }
}
