package me.bkkn.lesson12;

public class MultiThreadTask implements Creating, Initializing, Calculating {
    public void execute() {
        calculateParallel(init(create()));
    }

}
