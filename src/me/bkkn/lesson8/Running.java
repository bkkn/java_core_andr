package me.bkkn.lesson8;

public interface Running {
    void run(int size);

    default boolean canRun(int size, int max) {
        return max >= size;
    }

    int getMaxDist();
}
