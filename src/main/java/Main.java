import Comp.StudentComp;
import Comp.UniversityComp;
import Util.ComparatorUtil;
import enams.StudentProfile;
import enams.UniversityEnum;
import module.Student;
import module.University;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<University> universities =
                XlSXReader.XLSReader("src/main/resources/universityInfo.xlsx");
        UniversityComp universityComparator =
                ComparatorUtil.getUniversityComp(UniversityEnum.YEAROFFOUNDATION);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);

        List<Student> students =
                XlSXReader.X("src/main/resources/universityInfo.xlsx");
        StudentComp studentComparator =
                ComparatorUtil.getStudentComp(StudentProfile.AVGEXAM);
        students.stream()
                .sorted(studentComparator)
                .forEach(System.out::println);
    }
}
