import java.util.concurrent.ThreadLocalRandom;

public class Cat {

    private String name;
    private int satiety;
    private int appetite;
    private int eatCat = 0;

    public String getName() {
        return name;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int satiety, int appetite) {
        this.name = name;
        this.satiety = satiety;
        this.appetite = appetite;
    }


    public boolean eat(Plate plate) {
        System.out.print("\n" + getName() + " хочет съесть ");
        eatCat = plate.decreaseFood(ThreadLocalRandom.current().nextInt(4) + 3);
        satiety += eatCat;
        if (satiety >= appetite) {

            System.out.printf("%s съел %d и наелся \n", getName(), eatCat);
            return true;
        } else {

            System.out.printf("%s съел %d, но ещё голодный\n", getName(), eatCat);
            return false;
        }
    }

}
