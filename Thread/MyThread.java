package Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

    private int id;
    private static AtomicInteger num = new AtomicInteger(0); // Every MyThread shares this number.
    // Using AtomicInteger means it will go thread by thread one at a time to add
    // the num using incrementAndGet().

    public MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            num.incrementAndGet();
            printMessage("Hello");
            sleep((int) (Math.random() * 5000) + 1000); // Causes thread to stop for in between 1 - 5 seconds and then
                                                        // prints Hello again!
            printMessage("Hello again!");
            printMessage("Num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void printMessage(String m) {
        System.out.println("[Thread " + id + "] " + m);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            MyThread thread = new MyThread(i);
            thread.start(); // Starts the thread and invokes the run method.
        } // Thread will print at random because it all runs at the same time and goes by
          // which one gets to print first.
    }
}