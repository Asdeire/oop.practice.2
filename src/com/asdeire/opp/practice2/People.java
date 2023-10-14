package com.asdeire.opp.practice2;

import java.util.ArrayList;
import java.util.List;

public class People {

    public static List<Person> createPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Boyko", "Vasyl", "Igorovich", "Uzhhorod", "Man", "Bachelor", 2001));
        people.add(
            new Person("Shevchenko", "Anna", "Oleksandrivna", "Uzhhorod", "Woman", "Bachelor",
                2006));
        people.add(
            new Person("Melnyk", "Maksym", "Volodymirovich", "Uzhhorod", "Man", "School", 2004));
        people.add(new Person("Koval", "Roman", "Romanovich", "Uzhhorod", "Man", "Bachelor", 2009));
        people.add(
            new Person("Bondar", "Oksana", "Vasylivna", "Uzhhorod", "Woman", "School", 2003));
        people.add(
            new Person("Lysenko", "Taras", "Sergiyovich", "Uzhhorod", "Man", "Bachelor", 2000));

        return people;
    }
}
