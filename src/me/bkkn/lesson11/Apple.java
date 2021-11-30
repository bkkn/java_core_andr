package me.bkkn.lesson11;

public class Apple extends Fruit implements isApple {
    @Override
    float getWeight() {
        return 1.0f;
    }

    @Override
    public String toString() {
        return "Apple";
    }
}
