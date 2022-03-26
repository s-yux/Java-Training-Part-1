package Week3.Day13;

import java.util.Scanner;

class Launch1 {
    void fun () throws ArithmeticException{
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Numerator");
            int a = sc.nextInt();
            System.out.println("Denominator");
            int b = sc.nextInt();
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Handled in fun");
            throw e;
        }
        System.out.println("Connection terminated");
    }
}

public class ThrowsRunner {
    public static void main(String[] args) {
        Launch1 launch1 = new Launch1();
        try {
            launch1.fun();
        } catch (ArithmeticException e) {
            System.out.println("Handled in main");
        }
    }
}
