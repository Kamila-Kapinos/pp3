package mock3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Person p = new Person("kamilka","kapi");
        // System.out.println(p);
        // boolean[] arr = {true,false,true,true,false,true,false,true,false};
        // Logic l = new Logic(arr);
        // // System.out.println(l.opposite());
        // Number n = new Number(2, "1111");
        // System.out.println(n.get10());
        // String[] arr = {"Warszawa", "Szczecin", "Sopot", "gdansk"};
        // Cities c = new Cities(arr);
        // System.out.println(c.filter('S').cities());

        // Pizza p = new Pizza("Parma", 34);
        // p.setPrice();
        // System.out.println(p.getPrice());
        // System.out.println(p.discount());
        // System.out.println(p.delivery());

        // int[] arr = {2,5,2,8,4};
        // Numbers n = new Numbers(arr);
        // System.out.println(n.ok());

        ArrayList<Product> al = new ArrayList<Product>();
        al.add(new Product("marchew", 13));
        al.add(new Product("Ziemniak", 2));
        al.add(new Product("owoce", 12));     

        Collections.sort(al);
        for (Product st : al) {
            System.out.println( st.getName() + " " + st.getPrice());
        }
    }
}
