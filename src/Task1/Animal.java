package Task1;

public class Animal extends Zoo{

    public static int numberOfAnimal = 4;


    static {
        System.out.println("Animal static block");
    }


    {
        System.out.println("Animal non-static block");
    }


    public String nameOfAnimal = "Name of the animal: Lion";


    public Animal(){
        System.out.println("Animal: public static int = " + numberOfAnimal);
        System.out.println("Animal: public static int = " + numberOfAnimalSpecies);
        System.out.println("Animal: public String name = " + nameOfAnimal);
        System.out.println("Animal: public String name = " + nameOfZoo);
    }
}
