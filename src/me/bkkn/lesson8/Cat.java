package me.bkkn.lesson8;

public class Cat implements Doing{
    private static final int maxHeight = 3;
    private static final int maxDist = 10000;
    public static final String name = "Cat";
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
