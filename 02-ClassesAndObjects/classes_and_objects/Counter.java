public class Counter{  

    //atrybuty
   
    private int counter = Constans.INITIAL_VALUE_STATE;
   
    //metody
   
    public int increase(){
   
        return this.counter++;
    }

   
    public int decrease(){
   
        return this.counter--;
    }

    public int increase10(){
   
        return this.counter += 10;
    }

   
    public int decrease10(){

   
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
        
        for (int i = 0; i < 2; i++) {
              c1.increase10();
            }
        
        for(int i = 0; i < 3; i++){
            c1.increase();
        }
            
        c1.showValue();
        c1.resetCounter();
        c1.showValue();
        c1.decrease();
        c1.showValue();
    }

}