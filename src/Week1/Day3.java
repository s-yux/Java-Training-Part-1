package Week1;

public class Day3 {

    public static void main(String[] args) {
//        byte a = 10;
//        int b;
//        b = a;
//        System.out.println(b);

//        int a = 11234243;
//        byte b;
//        b = (byte) a;
//        System.out.println(b);

//        float b = 23.4f;
//        int a;
//        a = (int) b;
//        System.out.println(a);
//        System.out.println(b);

//        for(int i=0; i<4; i++){
//            for(int j=0; j<5; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        //Same as above
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for (int i = 5; i > 0; i--) {
//            for (int j = i; j > 0; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for(int i=0; i<5; i++){
//            for(int j=0; j<5; j++){
//                System.out.print("- ");
//            }
//            for(int k=0; k<5; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        //Same as above
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= 5; j++){
//                System.out.print("- ");
//            }
//            for (int j = 0; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        //Pyramid Type 1
//        int count = 0;
//        for (int i = 5; i > 0; i--) {
//            for (int j = i; j > 0; j--) {
//                System.out.print("-");
//            }
//            for (int k = 0; k <= count; k++) {
//                System.out.print("* ");
//            }
//            count++;
//            System.out.println();
//        }

//        //Pyramid Type 2
//        int count = 0;
//        for (int i = 5; i > 0; i--) {
//            for (int j = i; j > 0; j--) {
//                System.out.print("  ");
//            }
//            for (int k = 0; k <= count; k++) {
//                System.out.print("* ");
//            }
//            count+=2;
//            System.out.println();
//        }

//        //Inverted Triangle
//        int count = 5;
//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("  ");
//            }
//            for (int k = (2 * count) - 1; k > 0; k--) {
//                System.out.print("* ");
//            }
//            count--;
//            System.out.println();
//        }

//        //Letter A
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 5; j++) {
//                if(i%4==0 && i!=8){
//                    System.out.print("* ");
//                }else{
//                    if(j==0 || j == 4){
//                        System.out.print("* ");
//                    }else{
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }

        //Letter B
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                if (i % 5 == 0) {
                    if (j == 9){
                        System.out.print("  ");
                    }else{
                        System.out.print("* ");
                    }
                } else {
                    if (j == 0 || j == 9) {
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }


        //Write above here
    }
}
