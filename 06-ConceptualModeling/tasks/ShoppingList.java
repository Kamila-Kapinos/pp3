import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList{
    private String[] products;


    public ShoppingList(String[] products) {
        this.products = products;
    }

    public ShoppingList() {
        this.products = new String[0];
    }

    public void setProducts(){
        int n;
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number of products you want to store: ");  
        n=sc.nextInt();  
        this.products = new String[n];  
        System.out.println("Enter the products: ");  
        for(int i=0; i<n; i++)  
        {     
            String product = sc.next();
            this.products[i]=product;
        }
        sc.close();
    }

    public String[] getProducts() {
        return this.products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public String[] addProducts(String product){ 
       String newarr[] = new String[getProducts().length + 1];
       for (int i = 0; i < getProducts().length; i++)
           newarr[i] = getProducts()[i];
   
       newarr[getProducts().length] = product;
       this.products = newarr;
   
       return this.products;
    }

    public String displayProductsNum(){
        return "Number of products on your list: " + getProducts().length;
    }

    public String toString() {
        return Arrays.toString(getProducts());          
    }
}