package Week4.Day15_ThreadRelated;

class Producer extends Thread {
    Queue q;
    Producer(Queue q) {
        this.q = q;
    }
    @Override
    public void run() {
        try {
            int i = 1;
            while (true) {
                q.put(i++);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    Queue q;
    Consumer(Queue q) {
        this.q = q;
    }
    @Override
    public void run() {
        try {
            while (true) {
                q.get();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Queue {
    int x;
    boolean hasValue;

    synchronized void put(int i) {
        try {
            if (!hasValue) {
                x = i;
                System.out.println("Producer has produced: " + x);
                hasValue = true;
                notify();
            } else {
                wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized void get() {
        try {
            if (hasValue) {
                System.out.println("Consumer has consumed: " + x);
                hasValue = false;
                notify();
            } else {
                wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerRunner {

    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.start();
        c.start();
    }
}
