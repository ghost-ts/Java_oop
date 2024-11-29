package question4;

public class DriverClass {
    public static void main(String[] args) {
        
        Room singleRoom = new Room(1,"Single",10000);
        // Room doubleRoom = new Room(2,"Double",18000);
        // Room suiteRoom = new Room(3,"Suite",26000);

        singleRoom.bookRoom(2);

        singleRoom.bookRoom(1);

        singleRoom.cancelBooking();
        singleRoom.bookRoom(5);

        singleRoom.getDetails();

    }
}
