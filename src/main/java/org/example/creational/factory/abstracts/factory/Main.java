package org.example.creational.factory.abstracts.factory;

import org.example.creational.factory.abstracts.factory.factories.GameUnitFactory;
import org.example.creational.factory.abstracts.factory.factories.IndustrialGameUnitFactory;
import org.example.creational.factory.abstracts.factory.products.land.LandUnit;
import org.example.creational.factory.abstracts.factory.products.naval.NavalUnit;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Main {

    static NavalUnit createNavalUnit(GameUnitFactory gameUnitFactory){
        return gameUnitFactory.createNavalUnit();
    }

    static LandUnit createLandUnit(GameUnitFactory gameUnitFactory){
        return gameUnitFactory.createLandUnit();
    }

    public static void main(String[] args) throws Exception {
        GameUnitFactory gameUnitFactory = new IndustrialGameUnitFactory();

        createNavalUnit(gameUnitFactory);
        createLandUnit(gameUnitFactory);


        // real life example

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

    }
}
