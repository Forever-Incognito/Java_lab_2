package Task1;

public class Zoo {
    //5
    public static int numberOfAnimalSpecies  = 48;

    //6
    static {
        System.out.println("Zoo static block");
    }

    //7
    {
        System.out.println("Zoo non-static block");
    }

    //7
    public String nameOfZoo = "Zoo name: Animaland";

    //8
    public Zoo(){
        System.out.println("Zoo: public static int = " + numberOfAnimalSpecies);
        System.out.println("Zoo: public String name = " + nameOfZoo);
    }
}
