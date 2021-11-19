package me.bkkn.lesson8;

public interface Doing extends Running, Jumping{
    default void overcome(Obstacle obstacle){
        if (obstacle instanceof Wall) {
            jump(obstacle.getSize());
        }
        if (obstacle instanceof Treadmill)
        {
            run(obstacle.getSize());
        }
    }

    @Override
    default void jump(int size){
        String actorName = this.toString();
        System.out.println(actorName + " jumps " + size);
    }

    @Override
    default void run(int size){
        String actorName = this.toString();
        System.out.println(actorName + " runs " + size);
    }
}
