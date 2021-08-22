package zthreads.threadpool;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
    private List queue = new LinkedList();
    private int limit = 0;

    public BlockingQueue(int limit) {
        this.limit = limit;
    }

    public synchronized void enqueue(Object item) {
        while (this.queue.size() == this.limit) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.queue.add(item);
            if (this.queue.size() == 1) {
                notifyAll();
            }
        }
    }

    public synchronized Object dequeue() {
        while (this.queue.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (this.queue.size() == this.limit)
            notifyAll();
        return this.queue.remove(0);
    }
}
