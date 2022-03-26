package Week3.Day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionRunner {

    public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int a = sc.nextInt();
			System.out.println("Enter the denominator");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Enter a non zero denominator.");
		}


		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array");

			int size = sc.nextInt();
			int arr[] = new int[size];

			System.out.println("Enter index to insert");
			int index = sc.nextInt();

			System.out.println("Enter number to insert");
			int number = sc.nextInt();
			arr[index] = number;
			System.out.println(arr[index]);

		} catch (ArithmeticException e) {
			System.out.println("Enter a non zero denominator.");
		} catch (NegativeArraySizeException e) {
			System.out.println("Enter a non neg size.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Be within limits");
		} catch (InputMismatchException e) {
			System.out.println("Enter only number");
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Connection terminated");


		try {
			int a = 20;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		}catch (ArithmeticException e){
			System.out.println("Entered here");
			e.printStackTrace();
		}
    }

}