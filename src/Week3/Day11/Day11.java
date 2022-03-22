package Week3.Day11;

class Demo1 {
    static void display() {
        System.out.println("Demo1");
    }
}

class Demo2 extends Demo1 {
    static void display() {
        System.out.println("Demo2");
    }
}

public class Day11 {
    public static void main(String[] args) {
        Demo1 d = new Demo2();
        d.display();
    }
}
