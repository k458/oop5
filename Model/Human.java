package Model;

public class Human {

    private String firstName;
    private String sureName;
    private String lastName;
    private int age;

    public Human(String firstName, String sureName, String lastName, int age) {
        this.firstName = firstName;
        this.sureName = sureName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s, %d.",sureName, firstName, lastName, age);
    }
}
