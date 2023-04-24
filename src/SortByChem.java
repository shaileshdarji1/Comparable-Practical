import java.util.Comparator;

public class SortByChem implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        if (student.getChemistry() == t1.getChemistry())
            return 0;
        else if (student.getChemistry() > t1.getChemistry())
            return 1;
        else
            return -1;
    }
}
