package ducks;


/**
 * Looks like Mallard
 */
public class MallardDuck extends Duck{

    @Override
    public void quack() {
        System.out.println("Mallard's quack..");
    }

    public MallardDuck() { }

    @Override
    public void swim() {
        System.out.println("Mallard swimming...");
    }

    @Override
    public void display() {
        System.out.println("Looks like Mallard");
    }
}
