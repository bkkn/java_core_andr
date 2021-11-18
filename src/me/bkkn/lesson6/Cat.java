package me.bkkn.lesson6;

public class Cat extends Animal {
    private static final int maxDistRun = 200;
    private static final int maxDistSwim = 0;
    private static int counter = 0;

    public Cat(String name, boolean isMale) {
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
    public Cat run(int dist) {
        if (dist <= maxDistRun)
            super.run(dist);
        else {
            super.run(maxDistRun);
            System.out.println(super.isMale ? "и утомился" : "и утомилась");
        }
        return this;
    }

    @Override
    public Cat swim(int dist) {
        System.out.println(super.name + (super.isMale ? " утонул" : " утонула"));
        return this;
    }
}