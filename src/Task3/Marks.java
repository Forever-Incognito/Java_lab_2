package Task3;

public class Marks extends Student{
private int marks;

    public Marks(String name, int marks) {
        super(name);
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "mark=" + marks +
                '}';
    }
}
