package org.example.LearningThreads.RaceCondition;

class myRC{
    int seats=1;
    public synchronized void seats(String name){
        if(seats>0){
            System.out.println("Booked for "+name);
            seats--;
        }
        else{
            System.out.println("No seats left");
        }
    }
}
public class RCExample {
    public static void main(String[] args) throws InterruptedException {
        myRC r=new myRC();
        Thread t1 = new Thread(()->{
            r.seats("A");
        });

        Thread t2 = new Thread(()->{
            r.seats("B");
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
