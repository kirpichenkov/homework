package ru.kirpichenkov.multithreading.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class shedleExecutorService {
    public static void main(String[] args) throws InterruptedException {
        shedleExecutorService executorService = (shedleExecutorService) Executors.newScheduledThreadPool(5);
        for (int i=0; i < 10; i++){
            executorService.execute(new myClass());
        }



        System.out.println("main ENDS");
    }

    private void execute(myClass myClass) {
    }
}

class myClasss implements Runnable{

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


