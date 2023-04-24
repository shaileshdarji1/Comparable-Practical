public class Student implements Comparable<Student> {
    private String name;
    private Integer physics;
    private Integer chemistry;
    private Integer maths;
    private Integer total;

    public Student(String name, int physics, int chemistry, int maths) {
        this.name = name;
        this.physics = physics;
        this.chemistry = chemistry;
        this.maths = maths;
        this.total = physics + chemistry + maths;
    }

    @Override
    public int compareTo(Student student) {
        if (this.total == student.total) {
            return this.name.compareTo(student.name);
        } else if (this.total > student.total)
            return 1;
        else
            return -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhysics() {
        return physics;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public Integer getChemistry() {
        return chemistry;
    }

    public void setChemistry(Integer chemistry) {
        this.chemistry = chemistry;
    }

    public Integer getMaths() {
        return maths;
    }

    public void setMaths(Integer maths) {
        this.maths = maths;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + name + '\'' +
                ", Physics=" + physics +
                ", Chemistry=" + chemistry +
                ", Maths=" + maths +
                ", Total=" + total +
                '}' + "\n";
    }
}
