public class Lamp{

    //atrybuty
    
    boolean isOn;
    
    //metody
    public void switchOn(){
        this.isOn = true;
    }
    
    public void switchOff(){
        this.isOn = false;
    }
    
    public void showStatus(){
        System.out.println("The lamp is on: " + isOn);
    }
    
    public static void main(String[] args){
        Lamp l1 = new Lamp();
        l1.isOn = false;
       
        Lamp l2 = new Lamp();
        l2.isOn = true;
        
        l1.switchOn();
        l2.switchOff();
        l1.showStatus();
        l2.showStatus();
        
    }

}