package me.bkkn.lesson9;

public class MyArrayDataException extends RuntimeException{
    int i;
    int j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String getMessage() {
        return "Incorrect data at i" + " = "+ i+", j = " + j;
    }
}
