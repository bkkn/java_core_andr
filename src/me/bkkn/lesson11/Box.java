package me.bkkn.lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<F extends Fruit> {
    private ArrayList<F> list = new ArrayList<>();
    private static float epsilon = 1e-5f;

    public Box(ArrayList<F> list) {
        this.list = list;
    }

    public Box(F[] array) {
        for (F fruit : array)
            this.list.add(fruit);
    }


    public Box(F fruit) {
        this.list.add(fruit);
    }

    public float getWeight() {
       float sum = 0.f;
        for (F fruit :
                list) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public void add(F fruit) {
        list.add(fruit);
    }

    public void pourIn(Box other){
        this.list.addAll(other.list);
    }

    public void pourOut(Box other){
        other.list.addAll(this.list);
    }

    public <Other extends Fruit> boolean compare(Box<Other> otherBox) {
        return compare(this, otherBox);
    }

    public static <F1 extends Fruit, F2 extends Fruit> boolean compare(Box<F1> box1, Box<F2> box2) {
        return compareEpsilon(box1, box2, epsilon);
    }

    public static <F1 extends Fruit, F2 extends Fruit> boolean compareEpsilon(Box<F1> box1, Box<F2> box2, float epsilon) {
        return Math.abs(box1.getWeight() - box2.getWeight()) < epsilon;
    }

}
