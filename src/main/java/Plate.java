import java.util.Scanner;

public class Plate {

    private Scanner add = new Scanner(System.in);

    private int foodCount;

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println(this );
    }

    @Override
    public String toString() {
        return "\nВ миски корма: " + foodCount;
    }

    public int decreaseFood(int catEatCountFood) {
        System.out.println(catEatCountFood);
        if (foodCount - catEatCountFood < 0) {
            System.out.print("В миске не хватает корма\n");
            System.out.print("Сколько ты хочешь добавить корма: ");
            addFood();
            printInfo();
        }
        foodCount -= catEatCountFood;
        return catEatCountFood;
    }

    private int addFood() {
        return foodCount += add.nextInt();
    }
}
