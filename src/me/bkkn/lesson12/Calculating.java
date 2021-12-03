package me.bkkn.lesson12;

public interface Calculating {
    default float[] calculate(float[] arr) {
        for (int i = 0; i <arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5.f) * Math.cos(0.2f + i / 5.f) * Math.cos(0.4f + i / 2.f));
        return arr;
    }
}
