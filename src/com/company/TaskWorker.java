package com.company;

public class TaskWorker {
    public void start(){
        OnTaskDoneListener doneListener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(doneListener, errorListener);
        worker.start();
    }
}
