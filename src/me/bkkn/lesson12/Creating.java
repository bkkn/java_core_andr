package me.bkkn.lesson12;

public interface Creating {
    int SIZE = 10_000_000;
    int HALF = SIZE / 2;
    float[] arr = new float[SIZE];

    default float[] create(){
        return  new float[SIZE];
    }
}
