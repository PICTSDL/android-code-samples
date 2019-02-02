package ducks;


import ducks.flying.FlyWithWings;
import ducks.quacking.Quack;
import ducks.quacking.Squeak;

/**
 * Looks like Mallard
 */
public class MallardDuck extends Duck{

    @Override
    public void quack() {
        System.out.println("Mallard's quack..");
    }

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Squeak();
    }

    @Override
    public void swim() {
        System.out.println("Mallard swimming...");
    }

    @Override
    public void display() {
        System.out.println("Looks like Mallard");
    }
}
