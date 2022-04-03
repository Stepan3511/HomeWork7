package Hw7;

public class App {
    public static void main(String[] args) {

        Cat[] cats = {new Cat("Cake", 50), new Cat("Jake", 50), new Cat("Cat", 25), new Cat("Kotya", 5), new Cat("Kote", 1)};

        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();

        }
    }
}
