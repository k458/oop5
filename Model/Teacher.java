package Model;

public class Teacher extends Human {

    private int teacherID;

    public Teacher(String firstName, String sureName, String lastName, int age, int teacherID) {
        super(firstName, sureName, lastName, age);
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    @Override
    public String toString(){
        return "(Teacher) " + super.toString();
    }
}
