package question3;

public class Truck extends Vehicle{

    @Override
    public double calculateTollCharge(double numberOfTolls) {
        return (numberOfTolls*5);
    }
    
}
