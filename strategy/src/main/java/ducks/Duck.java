package ducks;


import ducks.flying.FlyBehaviour;
import ducks.quacking.QuackBehaviour;

public abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;
    // Every duck has to quack
    public abstract void quack();

    // Every duck can swim
    public abstract void swim();

    // How duck is displayed on the screen
    public abstract void display();

    public void doFly() {
        flyBehaviour.fly();
    }

    public void quackSound() {
        quackBehaviour.quack();
    }
}
