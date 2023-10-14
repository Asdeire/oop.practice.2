package com.asdeire.opp.practice2;

public class Person {

    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String address;
    private final String gender;
    private final String education;
    private final int birthYear;

    public Person(String lastName, String firstName, String middleName, String address,
        String gender, String education, int birthYear) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.gender = gender;
        this.education = education;
        this.birthYear = birthYear;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
