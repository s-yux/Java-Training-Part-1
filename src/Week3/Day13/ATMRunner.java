package Week3.Day13;

import java.util.Scanner;

class ATM {

    String user;
    String pass;

    public void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user");
        user = sc.nextLine();
        System.out.println("Enter pass");
        pass = sc.nextLine();
    }

    public void verify(){
        if(user.equals("1111") && pass.equals("2222")){
            System.out.println("Collect your money!");
        }else{
            System.out.println("Invalid credentials");
        }
    }
}

class Bank{
    void initiate(){
        ATM atm = new ATM();
        atm.acceptInput();
        atm.verify();;
    }
}

public class ATMRunner {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.initiate();
    }
}
