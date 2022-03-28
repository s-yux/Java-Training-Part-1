package Week4.Day15_ThreadRelated;

class Bathroom implements Runnable{
    @Override
    synchronized public void run() {
        try{
            System.out.println(Thread.currentThread().getName() + " has entered the bathroom");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " is using the bathroom");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " has left the bathroom");
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class ThreadRaceRunner {
    public static void main(String[] args) {
        Bathroom b = new Bathroom();
        Thread boy = new Thread(b);
        Thread girl = new Thread(b);
        Thread others = new Thread(b);

        boy.setName("BOY");
        girl.setName("GIRL");
        others.setName("OTHERS");

        boy.start();
        girl.start();
        others.start();
    }
}
