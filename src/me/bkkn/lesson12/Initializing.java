package me.bkkn.lesson12;

public interface Initializing {
    default float[] init(float[] arr){
        for (float f : arr) f = 1;
        return arr;
    }
}
