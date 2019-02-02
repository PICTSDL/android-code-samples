package ducks.quacking;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("...");
    }
}
