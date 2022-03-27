package Week3.Day14;

import java.util.Scanner;

class Handler extends Thread{
    @Override
    public void run() {
        if(getName().equals("BANK")){
            bank();
        }else if(getName().equals("PRINT")){
            print();
        }else {
            add();
        }
    }

    void bank(){
        System.out.println("Banking started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter acc num");
        int a = sc.nextInt();
        System.out.println("Enter pass");
        int pw = sc.nextInt();
        System.out.println("Collec monet");
        System.out.println("Banking ended");
    }

    void print(){
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

    void add(){
        System.out.println("Add started");
        System.out.println(10+12);
        System.out.println("Ended");
    }
}

public class AnotherWayofThread {
    public static void main(String[] args) {
        Handler handler1 = new Handler();
        Handler handler2 = new Handler();
        Handler handler3 = new Handler();

        handler1.setName("BANK");
        handler2.setName("PRINT");
        handler3.setName("ADD");

        handler1.start();
        handler2.start();
        handler3.start();
    }
}
