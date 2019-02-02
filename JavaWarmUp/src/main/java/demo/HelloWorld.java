package demo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        /*System.out.println("Hello World");
        Car car = new Car();

        System.out.println(Car.Hello);
        Car.Builder builder = new Car.Builder();

        TV tv = new TV();
        builder.build(tv);*/


        Car car1 = new BMW();
        car1.print();

        ArrayList<Paintable> paintables = new ArrayList<>();
        paintables.add(new BMW());
        paintables.add(new Maruti());

        for (Paintable paintIt:
             paintables) {
            System.out.println(paintIt.paint());
        }
    }
}
class Car {
    public static final String Hello = "Hello";
    public static class Builder {
        protected Builder() {

        }
        public void build() {
            System.out.println("Building car...");
        }
        public void build(TV name) {
            System.out.println("Building car " + name);
        }
    }
    public void print() {
        System.out.println("Printing");
    }
}

class TV {
    class Builder {

    }

    /*@Override
    public String toString() {
        return "I'm TV";
    }*/
}

class BMW extends Car implements Paintable{
    @Override
    public void print() {
        //(super.print();
        System.out.println("I Don't want to print..");

    }

    @Override
    public String paint() {
        return "Painting BMW";
    }
}
class Mercedese extends Car {

}
class Maruti extends Car implements Paintable{
    @Override
    public String paint() {
        return "Painting Maruti";
    }

}

interface Paintable {
    public String paint();
}