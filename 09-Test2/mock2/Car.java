import java.util.ArrayList;
import java.util.Arrays;

public class Car extends Vehicle{
    
    private int maxSpeed;


    public Car(int maxSpeed, int seats) {
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int[] spec(){ 
        int[] speci = new int[]{getSeats(), getMaxSpeed()};
        return speci;
        // return new int[] {this.getSeats(),this.maxSpeed};
    }
}
