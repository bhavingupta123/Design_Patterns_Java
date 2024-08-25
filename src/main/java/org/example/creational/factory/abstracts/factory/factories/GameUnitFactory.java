package org.example.creational.factory.abstracts.factory.factories;

import org.example.creational.factory.abstracts.factory.products.land.LandUnit;
import org.example.creational.factory.abstracts.factory.products.naval.NavalUnit;

public abstract class GameUnitFactory {

    public abstract LandUnit createLandUnit();
    public abstract NavalUnit createNavalUnit();

}
