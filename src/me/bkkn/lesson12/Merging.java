package me.bkkn.lesson12;

import static me.bkkn.lesson12.Task12.HALF;
import static me.bkkn.lesson12.Task12.SIZE;

public interface Merging {
    default float [] merge(float [] arr1, float [] arr2){
        float[] arr = new float[SIZE];
        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
        return arr;
    }
}
