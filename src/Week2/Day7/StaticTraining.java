package Week2.Day7;

class Demo{
    int a;
    static int m;

    {
        System.out.println("Non-static-block");
        a = 10;
    }

    static {
        System.out.println("Static-block");
        m = 100;
    }

    void disp1(){
        System.out.println(a);
        System.out.println(m);
    }

    static void disp2(){
        //System.out.println(a);
        System.out.println(m);
    }
}

public class StaticTraining {
    public static void main(String[] args) {
        Demo.disp2();
        Demo d = new Demo();
        d.disp1();
    }
}


