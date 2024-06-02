package Services;
public class TeacherIDService {
    private static int teacherIDNext = 0;
    public static int getTeacherIDNext(){
        return teacherIDNext++;
    }
}
