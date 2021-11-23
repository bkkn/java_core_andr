package me.bkkn.lesson9;
/*
 * Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
 * При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 * должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 * В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
 * и вывести результат расчета.
 */

public class Task {

    public static int summarize(String[][] arr) {
        if (arr.length != 4)
            throw new MyArraySizeException(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4)
                throw new MyArraySizeException(arr);
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }

}
