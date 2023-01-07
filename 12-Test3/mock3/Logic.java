package mock3;

public class Logic {
    private boolean[] values;
    // private ArrayList<boolean> values;

    public Logic(boolean[] values) {
        this.values = values;
    }

    public boolean[] getValues() {
        return this.values;
    }

    public void setValues(boolean[] values) {
        this.values = values;
    }
    
    public int opposite(){
        int counter = 0;
        for(int i = 1; i<getValues().length-1; i++){
            if(getValues()[i]!=getValues()[i+1] && getValues()[i]!=getValues()[i-1]){
                counter ++;
            }
        }
        return counter;
    }
}
