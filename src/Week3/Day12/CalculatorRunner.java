package Week3.Day12;

// //Interface cannot implement another interface
//interface Calculator1 {
//    void add();
//
//    void sub();
//}
//
//interface Calculator2 implements Calculator1 {
//    void mul();
//
//    void div();
//}

interface Calculator3 {
    abstract void add();

    abstract void sub();
}

interface Calculator4 extends Calculator3 {
    abstract void mul();

    abstract void div();
}

class MyCalculator implements Calculator4{

    @Override
    public void add() {

    }

    @Override
    public void sub() {

    }

    @Override
    public void mul() {

    }

    @Override
    public void div() {

    }
}


public class CalculatorRunner {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        myCalculator.add();
        myCalculator.sub();
        myCalculator.mul();
        myCalculator.div();
    }
}
