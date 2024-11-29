package question4;

public class Room {

    private int roomNumber=0;
    private String type;
    private double pricePerNight=0, nightsBooked=0;

    Room(int roomNumber, String type, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
    }

    public void bookRoom(int nights) {
        if(this.nightsBooked>0) {
            System.err.println("Room is already booked.\n");
        }
        else {
            System.out.println("Room Booked.\n");
            this.nightsBooked = nights;
        }
    }

    public void cancelBooking() {
        if(this.nightsBooked<1) {
            System.err.println("Room is not booked.\n");
        }
        else {
            this.nightsBooked=0;
            System.out.println("Booking canceled.\n");
        }
    }

    public void getDetails() {
        System.out.println("Room Number: "+this.roomNumber);
        System.out.println("Room Type: "+this.type);
        System.out.println("Price per Night: "+this.pricePerNight);

        if(this.nightsBooked<1) {
            System.err.println("Room is not booked.\n");
        }
        else {
            System.out.printf("Nights Booked: %.0f%n", this.nightsBooked);
            System.out.println("Total Price = "+this.pricePerNight*this.nightsBooked+"\n");
        }
    }

    // public void calculateAndDisplayPrice() {
    //     if(this.nightsBooked<1) {
    //         System.err.println("Room is not booked.");
    //     }
    //     else {
    //         System.out.println("Total Price = "+this.pricePerNight*this.nightsBooked);
    //     }
    // }

}
