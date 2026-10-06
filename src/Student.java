public class Student {
    int id;
    String name;
    double marks;

    public Student( int id, String name, double marks ) {
        this.id = id;
        this.name = name;
        this.marks = marks;

    }

    public int getId () {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}
