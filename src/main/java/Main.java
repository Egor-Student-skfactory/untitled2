import module.Student;
import module.University;
import org.example.StudyProfile;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAvgExamScore(4.0f)
                .setCurrentCourseNumber(3)
                .setFullName("Ivanov Ivan Ivanovich")
                .setUniversityId(1);
        System.out.println(student);
        University university = new University();
        university.setId("21-00k")
                .setMainProfile(StudyProfile.ECOLOGY)
                .setShortName("Gard")
                .setYearOfFoundation(1099)
                .setFullName("Garvard");
        System.out.println(university);
                

      
    }
}
