package StudentComparators;

import Comp.StudentComp;
import module.Student;

public class CompAVG implements StudentComp {
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o1.getAvgExamScore(), o2.getAvgExamScore());
    }
}
