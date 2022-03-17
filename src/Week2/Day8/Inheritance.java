package Week2.Day8;

class Demo{
    int a = 10;
    int b = 20;
    Demo(){}
    Demo(int a, int b){
        this.a=a;
        this.b=b;
    }
    Demo(int a){
        this(1000,2000);    //this should be first line of constructor, cannot coexist with super()
        this.a=a;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
}

class Demo2 extends Demo{
    Demo2(){
        super(111);
        a=100;
        b=200;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.display();
    }
}
