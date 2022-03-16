package Week2.Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

//        List<Farmer> farmerList = new ArrayList<>();
//        Farmer tempFarmer;
//        float principle;
//        int duration;
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//            tempFarmer = new Farmer();
//            farmerList.add(tempFarmer);
//            System.out.println("Enter principle for farmer " + (i + 1));
//            principle = sc.nextFloat();
//            System.out.println("Enter duration for farmer " + (i + 1));
//            duration = sc.nextInt();
//            farmerList.get(i).input(principle, duration);
//            farmerList.get(i).compute();
//            farmerList.get(i).display();
//        }

        //Count number of objects created
        CountObject c1 = new CountObject();
        System.out.println(CountObject.count);
        CountObject c2 = new CountObject();
        CountObject c3 = new CountObject();
        CountObject c4 = new CountObject();
        CountObject c5 = new CountObject();
        CountObject c6 = new CountObject();
        System.out.println(CountObject.count);
    }
}
