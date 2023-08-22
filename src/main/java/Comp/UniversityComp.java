package Comp;

import module.University;

import java.util.Comparator;

public interface UniversityComp extends Comparator<University > {
    @Override
    int compare(University o1, University o2);
}
