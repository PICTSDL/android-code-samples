package ducks;

/**
 * Not supposed fly!!
 */
public class RubberDuck extends Duck{

    @Override
    public void quack() {
        System.out.println("Rubber duck's Quack");
    }

    @Override
    public void swim() {
        System.out.println("Rubber duck swimming");
    }

    @Override
    public void display() {
        System.out.println("Looks like rubber duck");
    }
}
