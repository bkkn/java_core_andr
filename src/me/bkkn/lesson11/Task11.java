package me.bkkn.lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class Task11 {
    /*Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);*/
    public static <T> void swap(T[] array, int idx1, int idx2) {
        T temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
    /*Написать метод, который преобразует массив в ArrayList;*/

    public static <T> ArrayList<T> convertToArrayList(T[] array) {
        ArrayList<T> arrayList = new ArrayList<>(array.length);
        for (int i = 0; i < array.length; i++)
            arrayList.set(i, array[i]);
        return arrayList;
    }

    public static <T> ArrayList<T> asArrayList(T[] array) {
        return (ArrayList<T>) Arrays.asList(array);
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Box<Apple> boxOfApples = new Box<Apple>(apple);
        boxOfApples.add(apple);
        Float weight1 = boxOfApples.getWeight();

        Box<Apple> boxOfApples2 = new Box<Apple>( new Apple[]{apple,apple,apple} );
        Float weight11 = boxOfApples.getWeight();
        boxOfApples2.pourIn(boxOfApples);
        boxOfApples2.pourOut(boxOfApples);
        Float weight111 = boxOfApples.getWeight();
        Float weight1111 = boxOfApples2.getWeight();

        Orange orange = new Orange();
        Box<Orange> boxOfOranges = new Box<Orange>(orange);
        boxOfOranges.add(orange);
        float weight2 = boxOfOranges.getWeight();

        boolean isSameWeight = Box.compare(boxOfApples, boxOfOranges);
    }
/*


Задача: Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
Класс Box, в который можно складывать фрукты.
Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
Для хранения фруктов внутри коробки можно использовать ArrayList; Сделать метод getWeight(),
который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f,
апельсина – 1.5f (единицы измерения не важны); Внутри класса Box сделать метод compare(),
который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра.
true – если их массы равны, false в противоположном случае.
Можно сравнивать коробки с яблоками и апельсинами;
Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
Не забываем про метод добавления фрукта в коробку.
*/


}
