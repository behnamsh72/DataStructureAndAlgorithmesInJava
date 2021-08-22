package zthreads.multithread.section1.efinalizationofathread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NetworkConnectionLoader implements Runnable {
    @Override
    public void run() {
        System.out.printf("Begining Network sources loading : %s\n", new Date());
        //Sleeps four seconds

        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Write a message
        System.out.printf("Netowork sources loading has finished: %s\n", new Date());
    }
}
