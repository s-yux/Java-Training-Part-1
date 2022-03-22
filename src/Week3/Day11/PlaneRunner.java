package Week3.Day11;

abstract class Plane {
    abstract void takeOff();
    abstract void fly();
    abstract void land();
}

class PassengerPlane extends Plane {
    void takeOff() {
        System.out.println("passenger plane takes off at medium sized runway");
    }

    void fly() {
        System.out.println("passenger plan flies at medium height");
    }

    void land() {
        System.out.println("Ppassenger plane lands on medium size runway");
    }
}

class CargoPlane extends Plane {
    void takeOff() {
        System.out.println("CargoPlane takes off at large sized runway");
    }

    void fly() {
        System.out.println("CargoPlane flies at large height");
    }

    void land() {
        System.out.println("CargoPlane lands on large size runway");
    }
}

class FighterPlane extends Plane {
    void takeOff() {
        System.out.println("FighterPlane takes off at small sized runway");
    }

    void fly() {
        System.out.println("FighterPlane flies at small height");
    }

    void land() {
        System.out.println("FighterPlane lands on small size runway");
    }
}

class Airport {
    void permit(Plane ref) {
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}

public class PlaneRunner {
    public static void main(String[] args) {
        PassengerPlane pp = new PassengerPlane();
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();

        Airport ap = new Airport();
        ap.permit(pp);
        ap.permit(cp);
        ap.permit(fp);
    }
}
