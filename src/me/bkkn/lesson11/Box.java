package me.bkkn.lesson11;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;


public class Box<F extends Fruit> {
    public Box(Class<F> type) {
        this.list = new ArrayList<>();
        this.type = type;
    }

    public static Box<Apple> newAppleBox(){
        return new Box<Apple>(Apple.class);
    }

    public static Box<Orange> newOrangeBox(){
        return new Box<Orange>(Orange.class);
    }


    public static <T extends isApple> boolean appleMethod(Box<? extends isApple> box) {
        return true;
    }

    public static <T extends isOrange> boolean orangeMethod(Box<? extends isOrange> box) {
        return true;
    }

    private Class<F> type = null;

    public Box(F fruitType) {
        this.list = new ArrayList<>();
        this.list.add(fruitType);
        this.type = (Class<F>) fruitType.getClass();
    }

    public Class<F> getMyType() {
        return this.type;
    }

    private ArrayList<Fruit> list = new ArrayList<>();
    private static float epsilon = 1e-5f;

    public Box(ArrayList<Fruit> list) {
        this.list = list;
    }

//    public <FruitType extends Fruit> Box(F[] array) {
//        object = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].getClass().getName().equals(object.getClass().getName()))
//                this.list.add(array[i]);
//            else
//                System.out.println("Class type mismatch; " + array[i] + " skipped");
//        }
//}


//    public <FruitType extends Fruit> Box(FruitType fruit) {
//        this.list.add(fruit);
//        object = fruit;
//    }

    public Box(Class<F> type, int count) {
        try {
            for (int i = 0; i < count; i++)
                list.add((type.getDeclaredConstructor().newInstance()));
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

//    public Box(Fruit[] array) {
//        if (array.length != 0)
//            this.type = (Class<F>) array[0].getClass();
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].getClass().equals(this.type))
//                list.add(array[i]);
//            else
//                System.out.println("not a " + array[0] + "; skipped" );
//        }
//    }

    public float getWeight() {
        float sum = 0.f;
        for (Fruit fruit :
                list) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public void add(F fruit) {
        list.add((Fruit) fruit);
    }

    public Box<F> pourIn(Box<F> other) {
        Class<F> otherType = other.getMyType();
        boolean sameType = otherType.getTypeName().equals(this.getMyType().getTypeName());
        if (sameType)
            this.list.addAll(other.list);
        else
            System.out.println("different type");
        return this;
    }

    public Box<F> pourOut(Box<F> other) {
        Class<F> otherType = other.getMyType();
        boolean sameType = otherType.getTypeName().equals(this.getMyType().getTypeName());
        if (sameType)
            this.list.addAll(other.list);
        else
            System.out.println("different type");
        return this;
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
