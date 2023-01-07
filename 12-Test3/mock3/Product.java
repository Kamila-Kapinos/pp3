package mock3;

public class Product implements Comparable<Product>{
    
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name.toLowerCase();
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product p) {

        char letter1 = getName().toCharArray()[0];
        char letter2 = p.getName().toCharArray()[0];

        if(letter1==letter2){
            return 0;
        }else if(letter1>letter2){
            return 1;
        }
        return -1;
    }

    

}
