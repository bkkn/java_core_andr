package me.bkkn.lesson8;

public class Human implements Doing {
    private static final int maxHeight = 2;
    private static final int maxDist = 1000;
    @Override
    public String toString() {
        return "Human";
    }

    @Override
    public void jump(int size) {
        Doing.super.jump(size);
        if(size> maxHeight)
            System.out.println("and ... fails");
        else
            System.out.println("and ... going ahead");
    }

    @Override
    public void run(int size) {
        Doing.super.run(size);
        if(size> maxDist)
            System.out.println("and ... fails");
        else
            System.out.println("and ... going ahead");
    }
}
