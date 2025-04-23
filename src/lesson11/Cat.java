package lesson11;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name, int runLimit) {
        super(name, runLimit, 0);
        this.isFull = false;
        catCount++;
    }

    public void eat(Bowl bowl, int foodAmount) {
        isFull = bowl.eatFood(foodAmount);
        System.out.println(name + (isFull ? " покушал и теперь сыт." : " остался голодным, так как в миске недостаточно еды."));
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isFull() {
        return isFull;
    }
}