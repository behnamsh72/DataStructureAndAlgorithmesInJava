package zthreads.multithread.section1.binteruptingathread;

import java.util.concurrent.TimeUnit;

public class PrimeGenerator extends Thread {

    @Override
    public void run() {
        long number = 1L;
        while (true) {
            if (isPrime(number)) {
                System.out.printf("Number %d is Prime\n", number);
            }
            if (isInterrupted()) {
                System.out.print("The Prime Generator has been Interrupted\n");
                return;
            }
            number++;
        }
    }

    private boolean isPrime(long number) {
        if (number <= 2)
            return true;

        for (long i = 2; i < number; i++) {
            if ((number % i) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Thread task = new PrimeGenerator();
        task.start();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task.interrupt();
        //Write Information about the status of the Thread
        System.out.printf("Main : Status of the Thread: %s\n", task.getState());
        System.out.println("Main : isInterrupted: " + task.isInterrupted());
        System.out.printf("Main : isAlive: %s\n", task.isAlive());
    }
}
