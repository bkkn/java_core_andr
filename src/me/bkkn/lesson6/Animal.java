package me.bkkn.lesson6;

public class Animal {
    protected String name;
    protected boolean isMale;
    private static int counter = 0;

    public Animal(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
        ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public static void resetCounter() {
        counter = 0;
    }

    Animal run(int dist) {
        System.out.println(name + (isMale ? " пробежал " : " пробежала ") + dist + " м.");
        return this;
    }

    Animal swim(int dist) {
        System.out.println(name + (isMale ? " проплыл " : " проплыла ") + dist + " м.");
        return this;
    }
}