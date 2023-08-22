import module.Student;
import module.University;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import enams.StudyProfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XlSXReader {
        public static List<University> XLSReader (String filePath) throws IOException {

            List<University> universities = new ArrayList<>();

            FileInputStream inputStream = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Университеты");

            Iterator<Row> rowIterator = sheet.iterator();

            rowIterator.next();
            while (rowIterator.hasNext()){
                Row row = rowIterator.next();
                University university = new University();
                universities.add(university);
                university.setId(row.getCell(0).getStringCellValue());
                university.setFullName(row.getCell(1).getStringCellValue());
                university.setShortName(row.getCell(2).getStringCellValue());
                university.setYearOfFoundation((int)row.getCell(3).getNumericCellValue());
                university.setMainProfile(StudyProfile.valueOf(
                        StudyProfile.class, row.getCell(4).getStringCellValue()));

            }
        return universities;
        }
    public static List<Student> X (String filePath) throws IOException{
            List<Student> students = new ArrayList<>();
             FileInputStream inputStream = new FileInputStream(filePath);
             XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inputStream);
             XSSFSheet sheet = xssfWorkbook.getSheet("Студенты");

             Iterator<Row> rows = sheet.iterator();
             rows.next();

             while (rows.hasNext()){
                 Row row =rows.next();
                 Student student = new Student();
                 students.add(student);
                 student.setUniversityId(row.getCell(0).getStringCellValue());
                 student.setFullName(row.getCell(1).getStringCellValue());
                 student.setCurrentCourseNumber((int)row.getCell(2).getNumericCellValue());
                 student.setAvgExamScore((float)row.getCell(3).getNumericCellValue());
             }

             return students;

    }
}
