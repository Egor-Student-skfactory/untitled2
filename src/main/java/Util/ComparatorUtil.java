package Util;

import Comp.StudentComp;
import Comp.UniversityComp;
import StudentComparators.CompAVG;
import StudentComparators.CompCurrentCourseNumber;
import StudentComparators.CompFullName;
import StudentComparators.CompIDUniver;
import UniversityComparators.*;
import enams.StudentProfile;
import enams.UniversityEnum;

public class ComparatorUtil {
    private ComparatorUtil() {}

    public static StudentComp getStudentComp(StudentProfile studentProfile){
        switch (studentProfile){
            case UNIVERSITYID:
                return new CompIDUniver();

            case FULLNAME:
                return new CompFullName();

            case AVGEXAM:
                return new CompAVG();

            case CURRENTCOURSENUMBER:
                return new CompCurrentCourseNumber();

            default:
                return new CompFullName();
        }
    }
    public static UniversityComp getUniversityComp(UniversityEnum universityEnum){

        switch (universityEnum){
            case ID:
                return new CompID();

            case FULLLNAME:
                return new CompUNfullname();

            case SHORTNAME:
                return new CompUNshortName();

            case YEAROFFOUNDATION:
                return new CompYOF();

            case MAINPROFILE:
                return new CompStudyProf();

            default:
                return new CompUNfullname();
        }
    }
}
