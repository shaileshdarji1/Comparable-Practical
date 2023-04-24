import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Shailesh", 90, 90, 90));
        students.add(new Student("Mihir", 92, 89, 89));
        students.add(new Student("Parth", 88, 88, 95));
        students.add(new Student("Nimit", 95, 95, 94));
        students.add(new Student("Arpit", 80, 80, 80));

        Collections.sort(students);
        System.out.println(students);

        Collections.sort(students, new SortByPhy());
        System.out.println(students);

        Collections.sort(students, new SortByChem());
        System.out.println(students);

        Comparator<Student> sortByMath = (s1, s2) -> s1.getMaths().compareTo(s2.getMaths());
        Collections.sort(students, sortByMath);
        System.out.println(students);
    }
}
