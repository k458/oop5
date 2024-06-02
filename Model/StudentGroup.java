package Model;

import java.util.List;

public class StudentGroup {

    private Teacher teacher;
    private List<Student> students;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(teacher);
        sb.append('\n');
        for (Student student : students) {
            sb.append(student);
            sb.append('\n');
        }
        return sb.toString();
    }
}
