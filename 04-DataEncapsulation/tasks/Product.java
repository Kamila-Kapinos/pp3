public class Product {

    private String productName; 
    private boolean isVegetarian;

    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setIfVegeteerian(boolean isVegetarian){
        this.isVegetarian = isVegetarian;
    }

    public String getProductName(){
        return this.productName;
    }

    public boolean getIfVegeteerian(){
        return this.isVegetarian;
    }

    public String toString(){
        return "Product name: " + getProductName() + "\nIs vegetarian: " + getIfVegeteerian();
    }
}
