package Model;

public class Student extends Human {

    private int studentID;

    public Student(String firstName, String sureName, String lastName, int age, int studentID) {
        super(firstName, sureName, lastName, age);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString(){
        return "(Student) " + super.toString();
    }
}
