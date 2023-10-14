package com.asdeire.opp.practice2;

import java.util.ArrayList;
import java.util.List;

public class People {

    public static List<Person> createPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Boyko", "Vasyl", "Igorovich", "Uzhhorod", "Man", "Bachelor", 2001));
        people.add(
            new Person("Shevchenko", "Anna", "Oleksandrivna", "Lviv", "Woman", "Bachelor",
                2006));
        people.add(
            new Person("Melnyk", "Maksym", "Volodymirovich", "Prague", "Man", "School", 2004));
        people.add(
            new Person("Koval", "Roman", "Romanovich", "Bratislava", "Man", "Bachelor", 2009));
        people.add(
            new Person("Bondar", "Oksana", "Vasylivna", "Kiyv", "Woman", "School", 2003));
        people.add(
            new Person("Lysenko", "Taras", "Sergiyovich", "Uzhhorod", "Man", "Bachelor", 2000));

        return people;
    }
}
