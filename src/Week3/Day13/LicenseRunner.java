package Week3.Day13;

import java.util.Scanner;

class UnderageException extends Exception{
    @Override
    public String getMessage() {
        return "You are underage, hence unable to apply.";
    }
}

class Branch{
    int age;

    void apply(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();
    }

    void verify() throws UnderageException{
        if(age>=18){
            System.out.println("License Issued");
            System.exit(0);
        }else {
            UnderageException ue = new UnderageException();
            System.out.println("In Branch 1: " + ue.getMessage());
            throw ue;
        }
    }
}

class HeadOffice{
    void initiate(){
        try{
            Branch b1 = new Branch();
            b1.apply();
            b1.verify();

            Branch b2 = new Branch();
            b2.apply();
            b2.verify();

            Branch b3 = new Branch();
            b3.apply();
            b3.verify();
        }catch (UnderageException e){
            System.out.println("CANNOT APPLY COS UNDERAGE");
        }
    }
}

public class LicenseRunner {

    public static void main(String[] args) {
        HeadOffice headOffice = new HeadOffice();
        headOffice.initiate();
    }
}
