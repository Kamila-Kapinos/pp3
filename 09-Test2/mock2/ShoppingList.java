import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<Product> products;

    public ShoppingList() {
        this.products = new ArrayList<>();
    }

    public void add(Product product) {

        this.products.add(product);
    }

    public int total(){
       
        int counter = 0;
        for(Product el : this.products){
            counter+= el.getQuantity();
        }
        return counter;
    }

    public String toString() {
        String products = "";
        for(Product el : this.products){
            products += el.getName() + ",";
        }
        return products.substring(0,products.length()-1);
    }


}
