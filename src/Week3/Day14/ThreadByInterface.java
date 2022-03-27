package Week3.Day14;

import java.util.Scanner;

class Bank1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Banking started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter acc num");
        int a = sc.nextInt();
        System.out.println("Enter pass");
        int pw = sc.nextInt();
        System.out.println("Collec monet");
        System.out.println("Banking ended");
    }
}

class Print2 implements Runnable{
    @Override
    public void run(){
        System.out.println("Printing started");
        for(int i=0; i<5; i++){
            System.out.println("Printing" + i);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Printing ended");
    }
}

class Add3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Add started");
        System.out.println(10+12);
        System.out.println("Ended");
    }
}

public class ThreadByInterface {
    public static void main(String[] args) {
        Bank1 b1 = new Bank1();
        Print2 p2 = new Print2();
        Add3 a3 = new Add3();

        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(a3);

        t1.start();
        t2.start();
        t3.start();
    }
}
