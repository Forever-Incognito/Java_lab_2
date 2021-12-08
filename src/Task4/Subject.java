package Task4;

public class Subject {

    private String name;
    private int amountPerWeek;

    //Constructors
    public Subject(final String name, final int amountPerWeek){
        this.name = name;
        this.amountPerWeek = amountPerWeek;
    }

    public Subject(final String name){
        this.name = name;
    }

    //Getter

    public String getName() {
        return name;
    }

    public int getAmountPerWeek() {
        return amountPerWeek;
    }

    //Setter

    public void setName(final String name) {
        this.name = name;
    }

    public void setAmountPerWeek(final int amountPerWeek) {
        this.amountPerWeek = amountPerWeek;
    }

    @Override
    public String toString() {
        return "" + getName();
    }
}

