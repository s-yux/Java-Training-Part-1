package Week3.Day10;

class Animal {
}

class Tiger extends Animal {
}

class Exmp11 {
    Animal display(){
        System.out.println("Inside Exmp1");
        Animal a = new Animal();
        return a;
    }

//    Tiger display(){
//        System.out.println("Inside Exmp2");
//        Tiger t = new Tiger();
//        return t;
//    }

}

class Exmp12 extends Exmp11 {
    Tiger display(){
        System.out.println("Inside Exmp2");
        Tiger t = new Tiger();
        return t;
    }

//    Animal display() {
//        System.out.println("Inside Exmp1");
//        Animal a = new Animal();
//        return a;
//    }
}

public class Day10 {

    public static void main(String[] args) {
        Exmp12 e = new Exmp12();
        e.display();
    }
}
