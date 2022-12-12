public class Counter {
    private int counter;
   
    Counter(int c){
        this.counter=c;
    }

    public void add1(){
        this.counter++;
    }

    public int getCounter(){
        return this.counter;
    }
      
}
