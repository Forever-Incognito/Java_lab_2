package Task1;

public class Lion extends Animal{
    //1
    public static int numberOfMales = 1;

    //2
    static {
        System.out.println("Lion static block");
    }

    //11
    {
        System.out.println("Lion non-static block");
    }

    //11
    public String nameOfSon = "Lion name: Artur";

    //12
    public Lion(){
        System.out.println("Lion: public static int = " + numberOfMales);
        System.out.println("Lion: public static int = " + numberOfAnimal);
        System.out.println("Lion: public static int = " + numberOfAnimalSpecies);
        System.out.println("Lion: public String name = " + nameOfSon);
        System.out.println("Lion: public String name = " + nameOfAnimal);
        System.out.println("Lion: public String name = " + nameOfZoo);
    }
}
