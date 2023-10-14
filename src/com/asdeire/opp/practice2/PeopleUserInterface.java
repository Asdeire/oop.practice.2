package com.asdeire.opp.practice2;

import java.util.List;

public class PeopleUserInterface {

    private final PeopleOperations peopleOperations;

    public PeopleUserInterface(List<Person> people) {
        this.peopleOperations = new PeopleOperations(people);
    }

    private static void printPeople(List<Person> people) {
        if (people.isEmpty()) {
            System.out.println("People were not found");
        } else {
            for (Person person : people) {
                System.out.println(
                    person.getLastName() + " " + person.getFirstName() + " "
                        + person.getMiddleName());
            }
        }
    }

    private void printPeopleByAge() {
        System.out.println("List of people whose age exceeds the specified age:");
        List<Person> peopleByAge = peopleOperations.getPersonByAge(2005);
        printPeople(peopleByAge);
    }

    private void printPeopleByDegree() {
        System.out.println("\nList of people with high degree:");
        List<Person> peopleByDegree = peopleOperations.getPersonByDegree("Bachelor");
        printPeople(peopleByDegree);
    }

    private void printPeopleByGender() {
        System.out.println("\nList of male people:");
        List<Person> peopleByGender = peopleOperations.getPersonByGender("Man");
        printPeople(peopleByGender);
    }

    public void run() {
        printPeopleByAge();
        printPeopleByDegree();
        printPeopleByGender();
    }
}
