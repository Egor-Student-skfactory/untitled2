package StudentComparators;

import Comp.StudentComp;
import module.Student;
import org.apache.commons.lang3.StringUtils;

public class CompIDUniver implements StudentComp {
    @Override
    public int compare(Student o1, Student o2) {
        return StringUtils.compare(o1.getUniversityId() ,o2.getUniversityId());
    }
}
