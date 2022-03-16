package Week2.Day7;

public class Farmer {

    public float principle;
    public int duration;
    public float amount;

    public static float interest = 2.5f;

    public void input(float principle, int duration){
        this.principle = principle;
        this.duration = duration;
    }

    public void compute(){
        amount = principle * (1 + ((interest/100)*duration));
    }

    public void display(){
        System.out.println("The amount is: " + amount);
    }
}
