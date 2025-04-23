package lesson11;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = Math.max(food, 0);
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Миска пополнена. Теперь в миске: " + food);
        }
    }

    public boolean eatFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }
}