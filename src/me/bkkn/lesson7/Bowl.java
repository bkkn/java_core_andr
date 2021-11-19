package me.bkkn.lesson7;

public class Bowl {
    private int foodAmount;

    public boolean decreaseFood(int amount) {
        if (amount < 0) return false;
        if (amount <= foodAmount) {
            foodAmount -= amount;
            System.out.printf("Food decreased by %d, %d left\n", amount, foodAmount);
            return true;
        } else {
            System.out.printf("Food decreased by %d, %d left\n", amount, amount);
            foodAmount = 0;
            return false;
        }
    }

    public void putFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.printf("Food amount increased by %d, current amount is: %d\n", amount, foodAmount);
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
