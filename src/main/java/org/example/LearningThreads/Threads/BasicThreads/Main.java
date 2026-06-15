package org.example.LearningThreads.Threads.BasicThreads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("The creation of Thread");
        MyThreads t = new MyThreads();
        t.start();
        for(int i=1;i<=3;i++){
            t.join();
            System.out.println(i);
        }
    }
}
