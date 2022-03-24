package Week3.Day12;

interface Calculator {
    int count = 3;

    static void test1(){
        System.out.println("Only JDK 1.7 above static");
    }

    default void test2(){
        System.out.println("Only JDK 1.7 above default");
    }

    void add();

    void sub();
}

abstract class MyCalculator1 {
    abstract void mul();

    abstract void div();
}

class MyCalculator2 extends MyCalculator1 implements Calculator {

    @Override
    public void add() {
        System.out.println("My cal2 add");
    }

    @Override
    public void sub() {
        System.out.println("My cal2 sub");
    }

    @Override
    void mul() {
        System.out.println("My cal2 mul");
    }

    @Override
    void div() {
        System.out.println("My cal2 div");
    }

    void display(){
        System.out.println(count);
    }
}

public class ExtImpPractise {
    public static void main(String[] args) {
        MyCalculator2 myCaluclator2 = new MyCalculator2();
        myCaluclator2.add();
        myCaluclator2.sub();
        myCaluclator2.mul();
        myCaluclator2.div();
        myCaluclator2.display();
    }
}
