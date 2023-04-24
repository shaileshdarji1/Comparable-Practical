import java.util.Comparator;

public class SortByPhy implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        if (student.getPhysics() == t1.getPhysics())
            return 0;
        else if (student.getPhysics() > t1.getPhysics())
            return 1;
        else
            return -1;
    }
}
