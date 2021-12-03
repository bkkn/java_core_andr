package me.bkkn.lesson12;

public interface Dividing extends Merging{
    int SIZE = 10_000_000;
    int HALF = SIZE / 2;

    default float[][] divide(float[] arr){
        float[][] arrays = new float[2][];
        arrays[0] = new float[HALF];
        arrays[1] = new float[HALF];
        System.arraycopy(arr, 0, arrays[0], 0, HALF);
        System.arraycopy(arr, HALF, arrays[1], 0, HALF);
        return arrays;
    }
}
