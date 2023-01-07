package mock3;

public class Pizza extends Food implements Extra {

    private int size;

    public Pizza(String name, int size) {
        super(name);
        this.size = size;
        //TODO Auto-generated constructor stub
    }


    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setPrice() {
        setPrice(getSize() - 10);
        // TODO Auto-generated method stub   
    }

    @Override
    public float discount() {
        // TODO Auto-generated method stub
        if(getSize()<30){
           return getPrice();
        }else{
           return (float) (getPrice()*0.95);
        }
    }

    @Override
    public float delivery() {
        // TODO Auto-generated method stub
        // float cost = 0;
        if (getSize()<50){
            return 6;
        }else{
            return 8;
        }     
    }

    @Override
    public float delivery(int tip) {
        // TODO Auto-generated method stub
        return delivery() + tip;
    }


}
