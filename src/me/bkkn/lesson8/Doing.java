package me.bkkn.lesson8;

public interface Doing extends Running, Jumping, Nameable {
    default boolean overcome(Obstacle obstacle) {
        if (obstacle instanceof Wall) {
            if (canRun(obstacle.getSize(), getMaxHeight()))
                jump(obstacle.getSize());
            else {
                System.out.print("\n" + getName() + " fails to jump " + obstacle.getSize() + " max is " + getMaxHeight());
                return false;
            }
        }
        if (obstacle instanceof Treadmill) {
            if (canJump(obstacle.getSize(), getMaxDist()))
                run(obstacle.getSize());
            else {
                System.out.print("\n" + getName() + " fails to run " + obstacle.getSize() + " max is " + getMaxDist());
                return false;
            }
        }
        return true;
    }

    @Override
    default void jump(int size) {
        String actorName = this.toString();
        System.out.print("\n" + actorName + " jumps " + size);
    }

    @Override
    default void run(int size) {
        String actorName = this.toString();
        System.out.print("\n" + actorName + " runs " + size);
    }
}
