package Week1;

import java.util.*;

public class Day4 {
    public static void main(String[] args) {

//        //1D array
//        int marks[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter marks:");
//        for(int i=0; i<marks.length; i++){
//            marks[i] = sc.nextInt();
//        }
//
//        for(int x: marks){
//            System.out.println(x);
//        }

//        //2D Array
//        int marks[][] = new int[2][5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter marks");
//
//        for(int i=0; i<marks.length; i++){
//            for(int j=0; j<marks[1].length; j++){
//                marks[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i=0; i<marks.length; i++){
//            for(int j=0; j<marks[1].length; j++){
//                System.out.println(marks[i][j]);
//            }
//        }

//        //3D Array
//        int marks[][][] = new int[2][2][4];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < marks.length; i++) {
//            for (int j = 0; j < marks[i].length; j++) {
//                for (int k = 0; k < marks[i][j].length; k++) {
//                    System.out.println("Enter marks of sch " + i + ", class " + j + ", student " + k + ":");
//                    marks[i][j][k] = sc.nextInt();
//                }
//            }
//        }
//
//        for (int i = 0; i < marks.length; i++) {
//            for (int j = 0; j < marks[i].length; j++) {
//                for (int k = 0; k < marks[i][j].length; k++) {
//                    System.out.println("Result of sch " + i + ", class " + j + ", student " + k + ":" + marks[i][j][k]);
//                }
//            }
//        }

//        int[][][] marks;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter number of schools");
//        marks = new int[sc.nextInt()][][];
//
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println("Enter number of classes for school " + i + ": ");
//            marks[i] = new int[i][sc.nextInt()];
//            for (int j = 0; j < marks[i].length; j++) {
//                System.out.println("Enter number of students for class " + i + ": ");
//                marks[i][j] = new int[i][j][sc.nextInt()];
//            }
//        }

//        int [][][] marks = new int[2][][];
//        marks[0] = new int[2][];
//        marks[1] = new int[3][];
//
//        marks[0][0] = new int[2];
//        marks[0][1] = new int[3];
//
//        marks[1][0] = new int[2];
//        marks[1][1] = new int[3];
//        marks[1][2] = new int[2];
//
//        for (int i = 0; i < marks.length; i++) {
//            for (int j = 0; j < marks[i].length; j++) {
//                for (int k = 0; k < marks[i][j].length; k++) {
//                    System.out.println("Enter marks of sch " + i + ", class " + j + ", student " + k + ":");
//                    marks[i][j][k] = sc.nextInt();
//                }
//            }
//        }
//
//        for (int i = 0; i < marks.length; i++) {
//            for (int j = 0; j < marks[i].length; j++) {
//                for (int k = 0; k < marks[i][j].length; k++) {
//                    System.out.println("Result of sch " + i + ", class " + j + ", student " + k + ":" + marks[i][j][k]);
//                }
//            }
//        }

        //Find Single Number
        int arr[] = {1,2,1,2,4,3,4,3,5};
        int ans = 0;

        for(int i=0; i<arr.length; i++){
            ans = ans^arr[i];
        }
        System.out.println(ans);

    }
}

