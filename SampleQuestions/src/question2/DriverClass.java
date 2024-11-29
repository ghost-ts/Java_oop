package question2;

public class DriverClass {
    public static void main(String[] args) {
        Car obj = new Car(1, "LaFerrai", "Ferrari"); 
        obj.checkAvailability();
        obj.rentCar();
        obj.rentCar();
        obj.returnCar();
        obj.returnCar();
        obj.rentCar();
        obj.getDetails();
        obj.checkAvailability();
    }
}
