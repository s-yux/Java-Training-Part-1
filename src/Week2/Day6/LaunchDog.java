package Week2.Day6;

class Dog{

    String name;
    String color;
    int cost;

    public Dog(){
        name = "Ruby";
        color = "Black";
        cost = 15000;
    }

    public Dog (String name){
        this();
        this.name = name;
        cost = 20000;
    }

    public Dog(String name, String color, int cost){
        this("Spinny");
    }

//    public Dog(String name, String color){
//        this.name = name;
//        this.color = color;
//        this.cost = 20000;
//    }

//    public Dog(String name, String color, int cost){
//        this("Spinny", "White");
//    }

    public void disp(){
        System.out.println(name + " , " + color + " , " + cost);
    }
}

public class LaunchDog {
    public static void main(String[] args) {
        Dog d = new Dog("Rocky", "White", 90000);
        d.disp();

    }
}
