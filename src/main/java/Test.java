public class Test {
    public static void main(String[] args) throws InterruptedException {

        Cat cat = new Cat("Патрик", 0, 10);
        Plate plate = new Plate(20);
        plate.printInfo();

        while (cat.getSatiety() < cat.getAppetite()) {
            cat.eat(plate);
            plate.printInfo();
            Thread.sleep(1500);
        }

        Cat[] catArr = new Cat[3];
        catArr[0] = new Cat("Боб", 0, 6);
        catArr[1] = new Cat("Планктон", 0, 9);
        catArr[2] = new Cat("Сквидвард", 0, 4);
        for (Cat doAction : catArr) {
            while (doAction.getSatiety() < doAction.getAppetite()) {
                doAction.eat(plate);
                plate.printInfo();
                Thread.sleep(1500);
            }
        }
    }
}