public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;

    public Room(int number){
        this.number  = number;
        this.beds = 2; 
    }

    public Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }

    public void checkIn(String guestName){
        this.guestName = guestName;
        isOccupied();
    }

    public void checkOut(){
        this.guestName = null;
        this.occupied = false;
    }

    public void isOccupied(){
        this.occupied = true;

    }

    // public void displayStatus(){
    //     System.out.println("Room number: " + this.number + " Number of beds: " + this.beds 
    //     + " Is occupied: " + this.occupied + " Guest name: " + this.guestName);
    // }

    public String toString(){
        return "Room number: " + this.number + " Number of beds: " + this.beds 
        + " Is occupied: " + this.occupied + " Guest name: " + this.guestName;
    }

    public static void displayRoomStatus(Room[] roomsList, int num){
        System.out.println(roomsList[num].toString());
    }

    public static void showRoomsRaport(Room[] roomsList){
        for(int i = 0; i < roomsList.length; i++){
            System.out.println(roomsList[i].toString());
        }
    }

    public static void showRoomsNumBeds(Room[] roomsList){
        for(int i = 0; i < roomsList.length; i++){
            System.out.print("\nRoom number: " + roomsList[i].number + "\nNumber of beds: " + roomsList[i].beds);
        }
    }

    public static void showRoomsNum(Room[] roomsList){
        int vacantCounter = 0;
        int occupiedConter = 0;
        for(int i = 0; i < roomsList.length; i++){
           if(roomsList[i].occupied){
                occupiedConter ++;
           }else{
               vacantCounter ++;
           }
        }
        System.out.println("Occupied rooms: " + occupiedConter + "\nVacant rooms: " + vacantCounter);
    }

    public static void showVacantBedsNum(Room[] roomsList){
        int vacantBedscounter = 0; 
        for(int i = 0; i < roomsList.length; i++){
            if(!roomsList[i].occupied){
                vacantBedscounter += roomsList[i].beds;
            }
        }
        System.out.println("Vacant beds available: " + vacantBedscounter);
    }


    public static void main(String[] args){
        Room[] rooms = new Room[6];
        for(int i = 0; i < 2; i++){
            rooms[i] = new Room(i + 1);
        }

        for(int i = 2; i < 5; i++){
            rooms[i] = new Room(i + 1, 3);
        }
        
        rooms[5] = new Room(6, 1);

        rooms[5].checkIn("Kamila");

        showRoomsRaport(rooms);
        showRoomsNum(rooms);
        showVacantBedsNum(rooms);

    }
}
