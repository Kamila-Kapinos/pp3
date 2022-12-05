package tasks7;

public class Computer {
   
    private String brand;
    private int memory;
    private String color;
    private int plugInsNumber;
    private boolean isFanOn;
    private boolean isOn;
    private Processor processor; 


    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPlugInsNumber() {
        return this.plugInsNumber;
    }

    public void setPlugInsNumber(int plugInsNumber) {
        this.plugInsNumber = plugInsNumber;
    }

    public boolean isIsFanOn() {
        return this.isFanOn;
    }

    public boolean getIsFanOn() {
        return this.isFanOn;
    }

    public void setIsFanOn(boolean isFanOn) {
        this.isFanOn = isFanOn;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }

    public Computer(String brand, int memory, String color, int plugInsNumber, boolean isFanOn, boolean isOn) {
        this.brand = brand;
        this.memory = memory;
        this.color = color;
        this.plugInsNumber = plugInsNumber;
        this.isFanOn = isFanOn;
        this.isOn = isOn;
        this.processor = new Processor("", "", "", 0, 0);
    }

    public static void main(String[] args){
        Computer c = new Computer(null, 0, null, 0, false, false);
        c.turnOn();
        c=null; //wtedy usunie obiekt procesora utworzon w konstruktorze

    }
    
}
