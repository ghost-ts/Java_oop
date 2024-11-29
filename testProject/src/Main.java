import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println();

        //Objects
        /*Car myCar = new Car();
        Car yourCar = new Car();

        System.out.println("My car is "+myCar.year+" "+myCar.make+" "+myCar.model+".");
        System.out.println("My car's color is "+myCar.color+".");

        //myCar.drive();
        //myCar.brake();

        System.out.println();
        System.out.println("Your car is "+yourCar.year+" "+yourCar.make+" "+yourCar.model+".");
        System.out.println("Your car's color is "+yourCar.color+".");*/

        //Constructor
        /*User user1 = new User("Ghost", 6226, 20, "Purple");
        User user2 = new User("Robin", 2662, 30, "Purple");

        //System.out.println(user1.userName);
        //System.out.println(user2.userName);

        user1.hug(user2.userName);
        user2.kiss(user1.userName);*/
        
        //Global variables
        /*DiceRoller diceRoller = new DiceRoller();*/

        //overloaded constructors
        User user1 = new User("Ghost", 6226, 20, "Purple");
        User user2 = new User("Robin", 2662, 30, "Purple");

        user1.kiss(user2.userName);
        user1.hug();
        user2.kiss(user1.userName);
        user2.hug();







        System.out.println();
        input.close();
    }
}