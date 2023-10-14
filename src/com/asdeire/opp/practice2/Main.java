package com.asdeire.opp.practice2;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = People.createPeople();
        PeopleUserInterface peopleUserInterface = new PeopleUserInterface(people);
        peopleUserInterface.run();
    }
}