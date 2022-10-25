public class CinemaTicket{

    static String cinemaName = "Morning Star";
    String filmTitle;
    int row;
    int seat;
    double price;
    
    public CinemaTicket(String filmTitle, int row, int seat){
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        this.price = calculatePrice();
    }
        
    public double calculatePrice(){    
        if (this.row <= 2){
            this.price = 10.0;
        }
        else{
            this.price = 25.0;
        }
        return this.price;  
    }
    
    public void displayData(){
    
        System.out.println("Cinema name: " + cinemaName + "\nTitle of the film: "
        + filmTitle + "\nRow: "+ row + "\nSeat " + seat + "\nPrice " + price);
    }
    
    
    public static void main(String[] args){
        CinemaTicket c1 = new CinemaTicket("Gladiator", 2, 14);
        CinemaTicket c2 = new CinemaTicket("Gladiator", 10, 13);
        c1.displayData();
        c2.displayData();
    }
}