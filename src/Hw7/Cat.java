package Hw7;

public class Cat {
    private static int countOfCats = 0;
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        countOfCats++;
        this.hungry = true;
    }

    void info() {
        String isHungry = !hungry ? "Ссыт" : "Голоден";
        System.out.println(name + ": " + isHungry);
    }

    public void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }


    public String getName() {
        return name;
    }

    public static int getCountOfCats() {
        return countOfCats;
    }
}
