package Week2.Day9;

class Airport{
    void permit(Plane ref){
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}

class Plane{
    void takeOff(){
        System.out.println("Plane is taking off");
    }
    void fly(){
        System.out.println("Plane is flying");
    }
    void land(){
        System.out.println("Plane is landing");
    }
}

class PassengerPlane extends Plane{
    void fly(){
        System.out.println("Passenger plane flies at low heights");
    }
    void carryPassenger(){
        System.out.println("Passenger plane carries passengers");
    }
}

class CargoPlane extends Plane{
    void fly(){
        System.out.println("Passenger plane flies at medium heights");
    }
    void carryCargo(){
        System.out.println("Passenger plane carries goods");
    }
}

class FighterPlane extends Plane{
    void fly(){
        System.out.println("Passenger plane flies at high heights");
    }
    void carryArms(){
        System.out.println("Passenger plane carries arms");
    }
}

public class InheritancePractise {

    public static void main(String[] args) {

        Airport airport = new Airport();
        PassengerPlane pp = new PassengerPlane();
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();

        airport.permit(pp);
        airport.permit(cp);
        airport.permit(fp);

        Plane plane = new Plane();

        plane = cp;
        ((CargoPlane)(plane)).carryCargo();
    }
}
