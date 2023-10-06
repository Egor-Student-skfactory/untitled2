import Comp.StudentComp;
import Comp.UniversityComp;
import IO.JsonWriter;
import IO.XLSXWriter;
import IO.XlSXReader;
import IO.XmlWriter;
import UniversityComparators.CompYOF;
import Util.ComparatorUtil;
import Util.JsonUtil;
import Util.StatisticsUtil;
import enams.StudentProfile;
import enams.StudyProfile;
import enams.UniversityEnum;
import module.FullInfo;
import module.Statistics;
import module.Student;
import module.University;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {

        try {
            LogManager.getLogManager().readConfiguration(
                    Main.class.getResourceAsStream("/Logg.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }

        logger.log(INFO, "Application started, Logger configured");

        List<University> universities =
                XlSXReader.XLSReader("src/main/resources/universityInfo.xlsx");
        UniversityComp universityComparator =
                ComparatorUtil.getUniversityComp(UniversityEnum.YEAROFFOUNDATION);
        universities.sort(universityComparator);

        List<Student> students =
                XlSXReader.X("src/main/resources/universityInfo.xlsx");
        StudentComp studentComp =
                ComparatorUtil.getStudentComp(StudentProfile.AVGEXAM);
        students.sort(studentComp);

        List<Statistics> statisticsList = StatisticsUtil.createStatistics(students, universities);
        try {
            XLSXWriter.writeXlsStatistics(statisticsList, "statistics.xlsx");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FullInfo fullInfo = new FullInfo()
                .setStudentList(students)
                .setUniversityList(universities)
                .setStatisticsList(statisticsList)
                .setProcessDate(new Date());

        XmlWriter.generateXmlReq(fullInfo);
        JsonWriter.writeJsonReq(fullInfo);

        logger.log(INFO, "Application finished");
    }
}