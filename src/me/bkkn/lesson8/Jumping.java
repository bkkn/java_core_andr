package me.bkkn.lesson8;

public interface Jumping {
    void jump(int size);

    default boolean canJump(int size, int max) {
        return max >= size;
    }

    int getMaxHeight();
}
