import module.Student;
import module.University;
import org.example.StudyProfile;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities =
                XlSXReader.XLSReader("src/main/resources/universityInfo.xlsx");
        for(University university : universities) {
            System.out.println(university);
        }

        List<Student> students =
                XlSXReader.X("src/main/resources/universityInfo.xlsx");
        for(Student student : students) {
            System.out.println(student);
        }
                

      
    }
}
