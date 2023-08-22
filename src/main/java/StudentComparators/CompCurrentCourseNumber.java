package StudentComparators;

import Comp.StudentComp;
import module.Student;

public class CompCurrentCourseNumber implements StudentComp {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getCurrentCourseNumber(), o2.getCurrentCourseNumber());
    }
}
