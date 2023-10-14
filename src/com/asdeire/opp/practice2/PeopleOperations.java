package com.asdeire.opp.practice2;

import java.util.ArrayList;
import java.util.List;

public class PeopleOperations {

    private final List<Person> people;

    public PeopleOperations(List<Person> people) {
        this.people = people;
    }

    public List<Person> getPersonByAge(int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getBirthYear() < age) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPersonByDegree(String degree) {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getEducation().equalsIgnoreCase(degree)) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPersonByGender(String gender) {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equalsIgnoreCase(gender)) {
                result.add(person);
            }
        }
        return result;
    }
}
