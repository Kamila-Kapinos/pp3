public class Book{

    //atrybuty
    String title;
    int pagesNum;
    boolean isOpen;
    int currPage;
    
    //metody
    public void displayData(){
        System.out.println("The book title is: " + title + " and it has: " + pagesNum + " pages");
    }
    
    public void openBook(){
        this.isOpen = true;
    }
    
    public int read(){
        return this.currPage++;
    }
    
    public void showStatus(){
        System.out.println(title + "\nIs open: " + isOpen + "\nCurrent page: " + currPage);
    }
    
    public static void main(String[] args){
    Book b1 = new Book();
    b1.title = "HP";
    b1.pagesNum = 1000;
    b1.isOpen = false;
    b1.currPage = 0;
    
    b1.displayData();
    b1.openBook();
    b1.read();
    b1.showStatus();
    
    Book b2 = new Book();
    b2.title = "Atlas";
    b2.pagesNum = 800;
    b2.isOpen = false;
    b2.currPage = 400;
    
    b2.displayData();
    b2.openBook();
    b2.read();
    b2.showStatus();
    }


}