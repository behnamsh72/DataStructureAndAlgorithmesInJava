package zthreads.multithread.section1.fdeamongthread;

import java.util.Date;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

public class WriterTask implements Runnable {

    /**
     * Data structure to stores the event
     */
    private Deque<Event> deque;

    /**
     * Constructor of the class
     *
     * @param deque
     */
    public WriterTask(Deque<Event> deque) {
        this.deque = deque;
    }


    @Override
    public void run() {
        //Writes 100 events
        for (int i = 0; i < 100; i++) {
            Event event = new Event();
            event.setDate(new Date());
            event.setEvent(String.format("The thread %s has generated the event %d event", Thread.currentThread().getId(), i));

            //Add to the data structure
            deque.addFirst(event);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
