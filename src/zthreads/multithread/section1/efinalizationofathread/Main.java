package zthreads.multithread.section1.efinalizationofathread;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DataSourcesLoader dsLoader = new DataSourcesLoader();
        Thread thread1 = new Thread(dsLoader, "DataSourceThread");

        //Creates and starts a NetworkConnectionLoader runnable object
        NetworkConnectionLoader ncLoader = new NetworkConnectionLoader();
        Thread thread2 = new Thread(ncLoader, "NetworkConnectionLoader");
        thread1.start();
        thread2.start();

        //wait for finalization of two threads

        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Waits a message
        System.out.printf("Main : Configuration has been loaded : %s\n", new Date());
    }
}
