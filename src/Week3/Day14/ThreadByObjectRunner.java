package Week3.Day14;

import java.util.Scanner;

class Bank extends Thread {
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

class Print extends Thread{
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

class Add extends Thread{
    @Override
    public void run() {
        System.out.println("Add started");
        System.out.println(10+12);
        System.out.println("Ended");
    }
}

public class ThreadByObjectRunner {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Print print = new Print();
        Add add = new Add();

        bank.start();
        print.start();;
        add.start();
    }
}

