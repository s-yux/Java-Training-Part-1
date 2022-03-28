package Week4.Day15_ThreadRelated;

class Warrior extends Thread {
    String knife = "Knife";
    String gun = "Gun";
    String bomb = "Bomb";

    @Override
    public void run() {
        if (getName().equals("Rudresh")) {
            rudreshAcquireResource();
        } else {
            akhilAcquireResource();
        }
    }

    void rudreshAcquireResource() {
        try {
            synchronized (knife) {
                System.out.println("Rudresh has acquired " + knife);
                Thread.sleep(2000);
                synchronized (gun) {
                    System.out.println("Rudresh has acquired " + gun);
                    Thread.sleep(2000);
                    synchronized (bomb) {
                        System.out.println("Rudresh has acquired " + knife);
                        Thread.sleep(2000);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void akhilAcquireResource() {
        try {
            synchronized (knife) {
                System.out.println("Akhil has acquired " + knife);
                Thread.sleep(2000);
                synchronized (gun) {
                    System.out.println("Akhil has acquired " + gun);
                    Thread.sleep(2000);
                    synchronized (bomb) {
                        System.out.println("Akhil has acquired " + knife);
                        Thread.sleep(2000);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class WarriorThreadRunner {
    public static void main(String[] args) {
        Warrior w1 = new Warrior();
        Warrior w2 = new Warrior();

        w1.setName("Rudresh");
        w2.setName("Akhil");

        w1.start();
        w2.start();
    }
}
