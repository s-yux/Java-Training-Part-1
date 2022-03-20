package Week2.Day9;

class Zoo{
    void perform(Animal animal){
        animal.eat();
        animal.sleep();
    }
}

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Tiger extends Animal{
    void eat(){
        System.out.println("Tiger is eating meat");
    }
    void run(){
        System.out.println("Tiger runs");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Deer is eating grass");
    }
    void sprint(){
        System.out.println("Deer sprints");
    }
}

class Monkey extends Animal{
    void eat(){
        System.out.println("Monkey is eating banana");
    }
    void swing(){
        System.out.println("Monkey swings");
    }
}

public class AnimalPolymorph {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Tiger tiger = new Tiger();
        Deer deer = new Deer();
        Monkey monkey = new Monkey();

        zoo.perform(tiger);
        zoo.perform(deer);
        zoo.perform(monkey);
    }
}
