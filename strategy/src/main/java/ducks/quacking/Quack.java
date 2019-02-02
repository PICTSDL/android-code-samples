package ducks.quacking;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Normal Quack >>>");
    }
}
