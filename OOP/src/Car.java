public class Car {

    String make = "Ferrari";
    String model = "LaFerrari";
    int year = 2013;
    String color = "Red";
    double price = 3500000.00;

    public String toString() {
        return "Make: " + make + "\nModel: " + model + "\nYear: " + year + "\nColor: " + color + "\nPrice: " + price;
    }

    void drive() {
        System.out.println("Driving the car.");
    }

    void brake() {
        System.out.println("Hitting the brakes.");
    }

}
