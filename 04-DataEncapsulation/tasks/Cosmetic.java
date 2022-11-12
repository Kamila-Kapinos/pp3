public class Cosmetic {
    private String name;
    private String brand;
    private String cosmeticType;
    private double price;
    
    public void setName(String name){
        this.name = name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setCosType(String type){
        this.cosmeticType = type;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getType(){
        return this.cosmeticType;
    }

    public double getPrice(){
        return this.price;
    }

    public String checkCategory(){
        if(getPrice() >= 100){
            return "luxury";
        }else{
            return "basic";
        }
    }

    public String toString(){
        return "Cosmetic name: " + getName() + "\nBrand: " + getBrand() + "\nType: " + getType()
                + "\nPrice: " + getPrice() + "\nCategory: " + checkCategory();
    }
}
