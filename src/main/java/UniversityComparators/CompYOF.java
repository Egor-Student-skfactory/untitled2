package UniversityComparators;

import Comp.UniversityComp;
import module.University;

public class CompYOF implements UniversityComp {
    @Override
    public int compare(University o1, University o2) {
        return Integer.compare(o1.getYearOfFoundation(), o2.getYearOfFoundation());
    }
}
