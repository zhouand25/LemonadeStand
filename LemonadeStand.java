import java.util.Scanner;
public class LemonadeStand {
    public static void main(String args[]) {
        Start begin = new Start();
        begin.choose();
    }
}

public class Start {
    int length;
    int budget;

    System.out.print("Instructions: This is a simulation of a lemonade stand business, have fun!");

    public void choose() {
        Scanner scan = new Scanner("How many days would you like the simulation to be?");
        length = scan.nextInt();
        scan = new Scanner("How much money would you like to have as a budget?");
        budget = scan.nextInt();
        System.out.print("Type 'A' to begin");
    }
}

public class Setup {
    int cups;
    int sugar;
    int lemon;
    int ice;
    int price;
    double demand;

    //ratio between lemon, sugar, and water
    //According to https://www.allrecipes.com/recipe/32385/best-lemonade-ever/
    // ideal="9, 1.75, 8"
    // goldenratio=

    //hello

    public int calculate() {
        // demand=
    }
}

public class Environment {
    int temperature;
    int potentialcustomers;

    public void generate() {

    }
}