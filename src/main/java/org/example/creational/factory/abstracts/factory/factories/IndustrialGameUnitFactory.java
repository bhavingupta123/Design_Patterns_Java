package org.example.creational.factory.abstracts.factory.factories;

import org.example.creational.factory.abstracts.factory.products.land.LandUnit;
import org.example.creational.factory.abstracts.factory.products.land.RifleMan;
import org.example.creational.factory.abstracts.factory.products.naval.IronNaval;
import org.example.creational.factory.abstracts.factory.products.naval.NavalUnit;

public class IndustrialGameUnitFactory extends GameUnitFactory{
    @Override
    public LandUnit createLandUnit() {
        return new RifleMan();
    }

    @Override
    public NavalUnit createNavalUnit() {
        return new IronNaval();
    }

}
