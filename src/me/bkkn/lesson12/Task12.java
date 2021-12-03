package me.bkkn.lesson12;

public class Task12 {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;
    float[] arr = new float[SIZE];

    public static void main(String[] args) {
        calcSingleThread();
        calcDoubleThread();;
    }

    private static void calcSingleThread() {
        float[] arr = new Creating(){}.create();
        arr = new Initializing(){}.init(arr);
        long start = System.currentTimeMillis();
        arr = new Calculating(){}.calculate(arr);
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }

    private static void calcDoubleThread() {
        float[] arr = new Creating(){}.create();
        arr = new Initializing(){}.init(arr);
        long start = System.currentTimeMillis();
        arr = new Calculating(){
            @Override
            public float[] calculate(float[] arr) {
                float[][] arrs = new Dividing(){}.divide(arr);
                return Calculating.super.calculate(arr);
            }
        }.calculate(arr);
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
}
