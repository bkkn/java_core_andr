package me.bkkn.lesson14;

public class ArrayClass {

    public int[] firstCheckArray(int[] arr) {
        //проходимся по массиву с конца до ближайшей четвёрки, создаём новый размером от 4 до конца предыдущего
        //и заполняем оставшимся в массиве
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == 4) {
                int[] outArray = new int[arr.length - 1 - i];
                int k = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    outArray[k] = arr[j];
                    k++;
                }
                return outArray;
            }
        }
        throw new RuntimeException();
    }


    public boolean secondCheckArray(int[] userArr) {
        boolean one = false;
        boolean four = false;

        for (int i = 0; i < userArr.length; i++) {
            if (userArr[i] == 1) {
                one = true;
            }
            if (userArr[i] == 4) {
                four = true;
            }
            if (userArr[i] != 1 && userArr[i] != 4) {
                return false;
            }
        }
        return one && four;
    }
}
