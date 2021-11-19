package me.bkkn.lesson7;


public class Cat {
    private String name;
    private int appetite;
    private boolean isFed = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Bowl bowl) {
        if (bowl.decreaseFood(appetite)) {
            isFed = true;
            System.out.printf("%s has ate\n", name);
        } else {
            System.out.printf("%s is not enough\n", name);
            isFed = false;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isFed=" + isFed +
                '}';
    }
}