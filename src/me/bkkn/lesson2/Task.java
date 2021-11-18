package me.bkkn.lesson2;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.abs;
/*
    Как выполнить задания через циклы и условия мне понятно, поэтому я попробовал, как это сделать через Arrays.stream,
    чего раньше не пробовал.
    Еще хотел узнать, можно ли выполнять домашки на котлине?
*/

public class Task {
    public static boolean checkBalance(int[] arr) {
        if (arr.length < 2)
            return false;
        else if (arr.length == 2)
            return arr[0] == arr[1];
        else {
            for (int i = 1; i < arr.length - 1; i++) {

                int leftSize = arr.length - i;
                int leftSum = 0;
                int rightSize = i;
                int rightSum = 0;

                for (int l = 0; l < leftSize; l++) leftSum += arr[l];
                for (int r = 0; r < rightSize; r++) rightSum += arr[arr.length - 1 - r];

                if (leftSum == rightSum)
                    return true;
            }
        }
        return false;
    }

    //7
    // **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1, 2] при n = -2 (на два влево) -> [ 6, 1, 2, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.

    public static void single_shift_right(int[] arr) {
        int tmp_cur = 0;
        int tmp_nxt = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int nxt = (i + 1) % (arr.length);
            tmp_cur = arr[nxt];
            arr[nxt] = tmp_nxt;
            tmp_nxt = tmp_cur;
        }
    }

    public static void single_shift_left(int[] arr) {
        int tmp_cur = 0;
        int tmp_nxt = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            int nxt = (i - 1) % (arr.length);
            if (nxt < 0) nxt = arr.length + nxt;
            tmp_cur = arr[nxt];
            arr[nxt] = tmp_nxt;
            tmp_nxt = tmp_cur;
        }
    }

    static public void shift(int[] arr, int n) {
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                single_shift_right(arr);
            }
        } else {
            for (int i = 0; i < abs(n); i++) {
                single_shift_left(arr);
            }
        }
    }
}

