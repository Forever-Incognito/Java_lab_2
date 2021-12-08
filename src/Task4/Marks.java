package Task4;

public class Marks{
    private int marks;

    //Constructors
    public Marks(final int marks){
        this.marks = marks;
    }
    public Marks(){
    }

    //Getter
    public int getMarks() {
        return marks;
    }

    //Setter
    public void setMarks(final int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "" + getMarks();
    }
}