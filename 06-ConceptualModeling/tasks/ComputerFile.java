import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ComputerFile extends Exception{

    private String fileName;
    File file = new File(this.fileName);

    public ComputerFile(String fileName){
        this.fileName = fileName;     
    }

    public void setName(){
        this.fileName = fileName;
    }

    public boolean fileExists(){
        try {
            return file.exists();
        } catch (Exception e) {
            System.out.println("This file doesn't exist");
            return false;
        }
    }

    public String getPath(){
        return file.getAbsolutePath();
    }

    public String readFile(){
        try (Scanner scanner = new Scanner(fileName)) {
            String text = "";
            while(scanner.hasNext()){
                text += scanner.nextLine();
            }
            return text;
        }
    }

    public void createNewFile(String content) throws FileNotFoundException{
        PrintWriter save = new PrintWriter(this.fileName);
        save.println(content);
        save.close();
    }

    public static void main(String[] args){
        ComputerFile cf = new ComputerFile("test.txt");
        System.out.print(cf.fileExists());
        System.out.print(cf.getPath());
        System.out.print(cf.readFile());
    }    
}
