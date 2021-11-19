package me.bkkn;

import me.bkkn.lesson1.Task;
import me.bkkn.lesson5.Worker;
import me.bkkn.lesson6.Animal;
import me.bkkn.lesson6.Cat;
import me.bkkn.lesson6.Dog;
import me.bkkn.lesson7.Bowl;

import java.util.Arrays;
import java.util.Random;

import static me.bkkn.lesson2.Task.checkBalance;
import static me.bkkn.lesson2.Task.shift;
import static me.bkkn.lesson3.Task.guessTheNumber;
import static me.bkkn.lesson3.Task.guessTheWord;
import static me.bkkn.lesson4.TicTacToeGame.play;

public class Homework {
    public static void main(String[] args) {
        lesson1Hw();
        lesson2Hw();
        lesson3Hw();
        lesson4Hw();
        lesson5Hw();
        lesson6Hw();
        lesson7Hw();
        lesson8Hw();
    }

    private static void lesson8Hw() {
        //do smth
    }

    private static void lesson7Hw() {
        me.bkkn.lesson7.Cat[] cats = {
                new me.bkkn.lesson7.Cat("Cat1", 50),
                new me.bkkn.lesson7.Cat("Cat2", 100),
                new me.bkkn.lesson7.Cat("Cat3", 300),
        };

        Bowl bowl = new Bowl();
        bowl.putFood(400);
        for(me.bkkn.lesson7.Cat cat : cats){
            cat.eat(bowl);
        }

        for(me.bkkn.lesson7.Cat cat : cats){
            System.out.println(cat);
        }
    }

    private static void lesson6Hw() {
        new Dog("Бобик", true).run(600).swim(20);
        new Dog("Каштанка", false).run(10).swim(20);

        new Cat("Барсик", true).run(10).swim(20);
        new Cat("Пуся", false).run(10).swim(20);

        System.out.println("Total animals count: " + Animal.getCounter());
        System.out.println("Total cats count: " + Cat.getCounter());
        System.out.println("Total dogs count: " + Dog.getCounter());
    }

    private static void lesson5Hw() {
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", "892312312", 30000, 30);
        workers[1] = new Worker("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", "892312313", 40000, 40);
        workers[2] = new Worker("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", "892312314", 50000, 50);
        workers[3] = new Worker("Ivanov Ivan4", "Engineer4", "ivivan4@mailbox.com", "892312315", 30000, 60);
        workers[4] = new Worker("Ivanov Ivan5", "Engineer5", "ivivan5@mailbox.com", "892312316", 30000, 20);
        for (Worker w : workers) {
            if (w.getAge() > 40)
                System.out.println(w);
        }
    }

    private static void lesson4Hw() {
        play();
    }

    private static void lesson3Hw() {
        guessTheNumber();
        guessTheWord();
    }

    private static void lesson2Hw() {
        //      1
//      Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//      С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        arr = Arrays.stream(arr).map(i -> i == 1 ? 0 : 1).toArray();

//      2
//      Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arr8 = new int[8];
//      Не понял, как написать oneliner, не понятно, как получить предыдущий элемент или номер иттерации
//      внутри лямбды map'a ( arr8 = Arrays.stream(arr8)..map(it -> prev + 3).toArray();)
//      в цикле понятно:
        for (int i = 0; i < 8; i++) {
            arr8[i] = i * 3;
        }

//      3
//      Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        array = Arrays.stream(array).map(i -> i < 6 ? i * 2 : i).toArray();

//      4
//      Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//      и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int len = 3;
        int[][] arr2d = new int[len][len];
        for (int i = 0; i < len; i++)
            for (int j = 0; j < len; j++)
                if (i == j) arr2d[i][j] = 1;

//      5
//      ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] maxMinArr = new int[len];
        for (int it : maxMinArr) it = new Random().nextInt();
        int max = -Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            int cur = maxMinArr[i];
            if (max < cur) max = cur;
            if (min > cur) min = cur;
        }

//      6
//      ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//         если в массиве есть место, в котором сумма левой и правой части массива равны.
//         Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
//         граница показана символами ||, эти символы в массив не входят.

        boolean result1 = checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1});
        boolean result2 = checkBalance(new int[]{1, 1, 1, 2, 1});

        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{3, 5, 6, 1, 2};
        shift(a1, 1);
        shift(a2, -2);
        for (int j : a1) System.out.println(j);
        for (int j : a2) System.out.println(j);
    }

    private static void lesson1Hw() {
        float ans1 = Task.method1(1, 2, 3, 4);
        boolean ans2 = Task.method2(10, 3);
        Task.method3(1);
        boolean ans4 = Task.method4(1);
        Task.method5("Name");
        boolean ans6 = Task.method6(2021);

    }
}
