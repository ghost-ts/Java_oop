package question3;

public class Car extends Vehicle{

    @Override
    public double calculateTollCharge(double numberOfTolls) {
        return (numberOfTolls*2);
    }
    
}
