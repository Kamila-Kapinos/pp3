import java.util.Random;

public class Car {
    private String carName;
    private String brand;
    private int speedometer;

    public Car(String carName, String brand) {
        this.carName = carName;
        this.brand = brand;
        this.speedometer = 0;
    }

    public void setName(String name){
        this.carName = name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getName(){
        return this.carName;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getSpeed(){
        return this.speedometer;
    }

    public void drive(){
        Random r = new Random();
        this.speedometer = r.nextInt(200);
    }

    public String toString(){
        return "\nCar name: " + getName() + "\nCar brand: " + getBrand() + "\nYour speed: " + getSpeed() + "km/h";
    }


}
