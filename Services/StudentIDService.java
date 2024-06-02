package Services;

public class StudentIDService {
    private static int studentIDNext = 0;
    public static int getStudentIDNext(){
        return studentIDNext++;
    }
}
