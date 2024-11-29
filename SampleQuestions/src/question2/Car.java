package question2;

class Car {
    private int registrationNumber;
    private String model, brand;
    private boolean isAvailable = true;
    
    public Car(int registrationNumber, String model, String brand) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.brand = brand;
    }
    
    public void checkAvailability() {
        System.out.println("Availability: "+this.isAvailable);
        System.out.println();
    }

    public void rentCar() {
        if(this.isAvailable==true) {
            System.out.println("Car is rented.");
            this.isAvailable=false;
            System.out.println();
        }
        else {
            System.out.println("Car is not available.");
            System.out.println();
        }
    }
    
    public void returnCar() {
        if(this.isAvailable==false) {
            this.isAvailable=true;
            System.out.println("Car has been returned.");
            System.out.println();
        }
        else {
            System.out.println("Car is not rented.");
            System.out.println();
        }
    }
    
    public void getDetails() {
        System.out.println("Registration Number: "+this.registrationNumber);
        System.out.println("Model: "+this.model);
        System.out.println("Brand: "+this.brand);
        System.out.println();
    }
}
