package org.example.behavioral.strategy.design.sort.strategy;

import org.example.behavioral.strategy.design.Person;

import java.util.Comparator;
import java.util.List;

public class SortByName implements SortByStrategy{

    @Override
    public void sortBy(List<Person> p) {
        p.sort(Comparator.comparing(p2 -> p2.name));
    }
}
