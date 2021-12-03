package me.bkkn.lesson12;

import java.util.Arrays;

public interface Initializing {
    default float[] init(float[] arr){
        Arrays.fill(arr, 1);
        return arr;
    }
}
