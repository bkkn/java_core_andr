package me.bkkn.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
            arrayList.add(i, array[i]);
        return arrayList;
    }

    public static <T> ArrayList<T> asArrayList(T[] array) {
        return asArrayList(array);
    }

    public static void main(String[] args) {
        Box<Apple> ab = new Box<Apple>(new Apple());
//        ab.pourIn(new Box<Apple>())

        Box[] boxes = new Box[10];
        for (int i = 1; i < 9; i = i+2) {
            boxes[i] = new Box(Apple.class, 3*i);
            boxes[i+1] = new Box(Orange.class, i+1);
            System.out.format("box%d wieghts %f\n",i,boxes[i].getWeight());
            System.out.format("box%d wieghts %f\n",i+1,boxes[i+1].getWeight());
            System.out.println("result of compare: " + Box.compare(boxes[i],boxes[i+1]));
        }

        for (int i = 1; i < 9; i = i+2) {
            boxes[i] = new Box(Orange.class, i).pourIn(new Box(new Apple())).pourIn(new Box(new Orange()));
            boxes[i+1] = new Box(Apple.class, i+1).pourIn(new Box(new Apple()));
            System.out.format("box%d wieghts %f\n",i,boxes[i].getWeight());
            System.out.format("box%d wieghts %f\n",i+1,boxes[i+1].getWeight());
            System.out.println("result of compare: " + Box.compare(boxes[i],boxes[i+1]));
        }

        List<Apple> appleBox =  BoxBuilder.getList(new Apple(), new Apple());
//        Box<Apple> appleBox =  BoxBuilder.build(3);
//        Box<Orange> orangeBox =  BoxBuilder.build(4);

//        Box<Apple> appleBox = new Box<Apple>(new Apple[]{new Apple(),new Apple(),new Apple()});
//        Box<Orange> orangeBox = new Box<Orange>(new Orange[]{new Orange(),new Orange(),new Orange()});
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
