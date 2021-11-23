package me.bkkn.lesson9;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {

    public static final int SIZE = 4;
    int i;
    int j;

    public MyArraySizeException(String[][] arr) {
        i = arr.length;
        j = arr[0].length;
    }

    @Override
    public String getMessage() {
        String msg = "";
        if (i != SIZE) {
            msg += "First dimension should be " + SIZE + ", not " + i;
        }
        if (j != SIZE) {
            msg += "Second dimension should be " + SIZE + ", not " + j;
        }
        return msg;
    }
}
