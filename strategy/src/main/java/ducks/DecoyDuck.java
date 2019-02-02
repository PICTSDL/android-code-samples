package ducks;

/**
 * Not supposed to fly and quack as well!!
 */
public class DecoyDuck extends Duck{

    @Override
    public void quack() {
        //This is done under duress of my parent class !!
        // I'm not supposed to quack
    }

    @Override
    public void swim() {
        System.out.println("Decoy ducks can swim...");
    }

    @Override
    public void display() {
        System.out.println("Looks like Decoy duck");
    }
}
