package me.bkkn.lesson6;

public class Dog extends Animal {

    private static final int maxDistRun = 500;
    private static final int maxDistSwim = 10;
    public static int counter = 0;

    public Dog(String name, boolean isMale) {
        super(name, isMale);
        ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public static void resetCounter() {
        counter = 0;
    }

    @Override
    public Dog run(int dist) {
        if (dist <= maxDistRun)
            super.run(dist);
        else {
            super.run(maxDistRun);
            System.out.println(super.isMale ? "и утомился" : "и утомилась");
        }
        return this;
    }

    @Override
    public Dog swim(int dist) {
        if (dist <= maxDistSwim)
            super.swim(dist);
        else {
            super.swim(maxDistSwim);
            System.out.println(super.isMale ? "и утомился" : "и утомилась");
        }
        return this;
    }
}