package org.example.behavioral.strategy.design.sort.strategy;

import org.example.behavioral.strategy.design.Person;

import java.util.List;

public interface SortByStrategy {

    public void sortBy(List<Person> p);
}
