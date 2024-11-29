import java.util.Random;

public class DiceRoller {

    Random random;
    int number;

    DiceRoller() {
        random = new Random();
        System.out.println(number=roll());
    }

    int roll() {
        this.number = random.nextInt(6)+1;
        return number;
    }

}
