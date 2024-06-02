package Services;

import Model.*;
import java.util.List;

public class StudentGroupService{
    public static StudentGroup GetNewStudentGroup(Teacher teacher, List<Student> students){
        return new StudentGroup(teacher, students);
    }
}