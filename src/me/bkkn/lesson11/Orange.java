package me.bkkn.lesson11;

public class Orange extends Fruit implements isOrange{
    @Override
    float getWeight() {
        return 1.5f;
    }
    @Override
    public String toString() {
        return "Orange";
    }
}
