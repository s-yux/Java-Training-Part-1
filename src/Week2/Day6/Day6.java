package Week2.Day6;

class Addition{
    int add(int a, int b){
        return a+b;
    }

    float add(int a, float b){
        return a+b;
    }

    float add(float a, int b){
        return a+b;
    }

    float add(float a, float b){
        return a+b;
    }
}

public class Day6 {
    public static void main(String[] args) {

//        int a = 10, b = 20, c = 30;
//        float d = 10.2f, e = 12.4f;
//
//        Addition addition = new Addition();
//        System.out.println(addition.add(a,b));
//        System.out.println(addition.add(a,d));
//        System.out.println(addition.add(e,c));
//        System.out.println(addition.add(d,e));

        int arr[] = {1,2,3,4,5};
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        System.out.println(sum);
    }
}
