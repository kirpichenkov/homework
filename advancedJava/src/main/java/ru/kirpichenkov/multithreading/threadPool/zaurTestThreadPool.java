package ru.kirpichenkov.multithreading.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class zaurTestThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=0; i < 10; i++){
            executorService.execute(new myClass());
        }

        executorService.shutdown();
        executorService.awaitTermination(7, TimeUnit.SECONDS);

        System.out.println("main ENDS");
    }
}

class myClass implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
      //  System.out.print("   " + Thread.currentThread().getId());
    }
}
