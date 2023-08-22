package UniversityComparators;

import Comp.UniversityComp;
import module.University;
import org.apache.commons.lang3.StringUtils;

public class CompUNfullname implements UniversityComp {
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getFullName(),o2.getFullName());
    }
}
