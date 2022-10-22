public class Counter{

    //atrybuty
    
    private int counter = 0;
    
    //metody
    
    public int increase(){
    
        return this.counter++;
    }
    
    public int decrease(){
    
        return this.counter -= 10;
    }
    
    public void resetCounter(){
    
        this.counter = Constans.INITIAL_VALUE_STATE;
    }
    
    public void showValue(){
    
        System.out.println("Counter value is: " + this.counter);
    }


    public static void main(String[] args){
        Counter c1 = new Counter();
        
        for (int i = 0; i < 23; i++) {
              c1.increase();
            }
            
        c1.showValue();
        c1.resetCounter();
        c1.showValue();
        c1.decrease();
        c1.showValue();
    }

}