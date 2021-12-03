package me.bkkn.lesson11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class BoxBuilder<F extends Fruit> {
    public static <T extends Fruit> Box<T> createBox(Class<T> type, int count) {
        return new Box<T>(type, count);
    }

    public static <T> boolean isInstanceOf(Class<T> clazz, Class<T> targetClass) {
        return clazz.isInstance(targetClass);
    }

    public static <T> List<T> getList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

//    static <F extends Fruit> Box<F> build(int count) {
//        Type typeT = typeOf(F)
//        isInstanceOf(F.class, Apple.class);
//
//        ArrayList<F> list = new ArrayList<>(count);
//        for (int i = 0; i < count; i++)
//            list.add((F) new Object());
//        return new Box<F>();
//    }

    static <F extends Fruit> ArrayList<Box<F>> buildBoxes(int boxCount, int fruitCount) {
        ArrayList<Box<F>> boxes = new ArrayList<>(boxCount);
        for (Box box :
                boxes) {
            box = new Box<F>(new ArrayList<>(fruitCount));
        }
        return boxes;
    }

}
