package org.example.behavioral.strategy.design.sort.strategy;

import org.example.behavioral.strategy.design.Person;

import java.util.Comparator;
import java.util.List;

public class SortByAge implements SortByStrategy{


    @Override
    public void sortBy(List<Person> p) {
        p.sort((p1, p2) -> {
            if (p1.age > p2.age)
                return 1;

            return -1;
        });
    }
}
