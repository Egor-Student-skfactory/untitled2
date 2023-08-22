package Comp;

import module.Student;

import java.util.Comparator;

public interface StudentComp extends Comparator<Student>  {
    @Override
    int compare(Student o1, Student o2);
}
