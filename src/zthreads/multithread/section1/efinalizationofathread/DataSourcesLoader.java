package zthreads.multithread.section1.efinalizationofathread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DataSourcesLoader implements Runnable {

    @Override
    public void run() {

        System.out.printf("Begining data sources loading : %s\n", new Date());
        //Sleep four seconds

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Write a Message
        System.out.printf("Data sources loading has finished : %s\n", new Date());
    }
}
