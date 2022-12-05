package tasks7;

public class FFTest {
    public static void main(String[] args){
        File f1 = new File("tree.jpg");
        File f2 = new File("snow.jpg");
        Folder folder = new Folder("zdjecia");
        folder.addFile(f1);
        folder.addFile(f2);
        System.out.println(folder);
        folder.removeFile("tree.jpg");
        System.out.println(folder);
    }

}
