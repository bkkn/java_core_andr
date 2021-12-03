package me.bkkn.lesson12;

public class SingleThreadTask implements Creating,Initializing,Calculating{
    public void execute(){
        calculate(init(create()));
    }
}
