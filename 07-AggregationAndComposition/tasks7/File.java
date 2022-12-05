package tasks7;

import java.util.Random;

public class File {
    private String name;
    private int size;

    public File(String name) {
        this.name = name; 
        Random rand = new Random();
        this.size = rand.nextInt(50);
    }
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return this.size;
    }

    public String toString() {
        return getName() + ", " + getSize();
    }


}
