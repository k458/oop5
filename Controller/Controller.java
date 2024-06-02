package Controller;


import java.util.ArrayList;
import java.util.List;

import Model.*;
import Services.*;

public class Controller {
    public void run(){
        Teacher teacher = new Teacher("Anna", "Korenina", "", 33, TeacherIDService.getTeacherIDNext());
        Student student1 = new Student("Viktor", "Ivanov", "Voktorovich", 18, StudentIDService.getStudentIDNext());
        Student student2 = new Student("Aziza", "Amurova", "Tezctlanovna", 21, StudentIDService.getStudentIDNext());
        Student student3 = new Student("Kotan", "Sibirsky", "Vechnogolodnovich", 10, StudentIDService.getStudentIDNext());
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        StudentGroup studentGroup = StudentGroupService.GetNewStudentGroup(teacher, students);
        System.out.println(studentGroup);
    }
}
