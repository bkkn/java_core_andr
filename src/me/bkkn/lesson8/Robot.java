package me.bkkn.lesson8;

public class Robot implements Doing{
    private static final int maxHeight = 1;
    private static final int maxDist = 10;
    @Override
    public String toString() {
        return "Robot";
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
