package org.example.creational.factory.abstracts.factory.factories;

import org.example.creational.factory.abstracts.factory.products.land.LandUnit;
import org.example.creational.factory.abstracts.factory.products.land.SwordsMan;
import org.example.creational.factory.abstracts.factory.products.naval.GalleyNaval;
import org.example.creational.factory.abstracts.factory.products.naval.NavalUnit;

public class MedivialGameUnitFactory extends GameUnitFactory{
    @Override
    public LandUnit createLandUnit() {
        return new SwordsMan();
    }

    @Override
    public NavalUnit createNavalUnit() {
        return new GalleyNaval();
    }

}
