package ducks;

/**
 * Looks like Redhead
 */
public class RedHeadDuck extends Duck{


    @Override
    public void quack() {
        System.out.println("Redhead's quack..");
    }

    @Override
    public void swim() {
        System.out.println("Redhead swimming..");
    }

    @Override
    public void display() {
        System.out.println("Looks like redhead");
    }
}
