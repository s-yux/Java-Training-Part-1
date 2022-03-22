package Week3.Day11;

abstract class Bird {
    abstract void fly();

    abstract void eat();
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow Flying...");
    }

    @Override
    void eat() {
        System.out.println("Sparrow Eating...");
    }
}

abstract class Eagle extends Bird {
    @Override
    void eat() {
        System.out.println("Eagle Eating...");
    }
}


class GoldenEagle extends Eagle {
    @Override
    void fly() {
        System.out.println("Golden Eagle flying..");
    }
}

class SerpentEagle extends Eagle {
    @Override
    void fly() {
        System.out.println("Serpent Eagle flying..");
    }
}

class Sky {
    void permit(Bird bird) {
        bird.fly();
        bird.eat();
    }
}

public class BirdRunner {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        GoldenEagle goldenEagle = new GoldenEagle();
        SerpentEagle serpentEagle = new SerpentEagle();

        Sky sky = new Sky();
        sky.permit(sparrow);
        sky.permit(goldenEagle);
        sky.permit(serpentEagle);
    }
}
