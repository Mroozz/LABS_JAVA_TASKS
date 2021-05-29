package creatures;

public class FarmAnimal extends Animal {
    public FarmAnimal(String species) {
        super(species);
    }

    public void beEaten(){
        System.out.println("Oh noooooo!!");
    }
}
