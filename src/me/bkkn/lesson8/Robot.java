package me.bkkn.lesson8;

public class Robot implements Doing{
    private static final int maxHeight = 1;
    private static final int maxDist = 10;
    public static final String name = "Robot";

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void jump(int size) {
        Doing.super.jump(size);
        if(size> maxHeight)
            System.out.print(" and ... fails");
        else
            System.out.print(" and ... going ahead");
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void run(int size) {
        Doing.super.run(size);
        if(size> maxDist)
            System.out.print(" and ... fails");
        else
            System.out.print(" and ... going ahead");
    }

    @Override
    public int getMaxDist() {
        return maxDist;
    }

    @Override
    public String getName() {
        return name;
    }
}
