package exercises;
import java.util.Scanner;


public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many miles have you driven on your trip?");
        int milesDriven = input.nextInt();
        System.out.print("How many gallons did you use while driving those miles?");
        int gasConsumed = input.nextInt();
        float milesPerGallon = milesDriven/gasConsumed;
        System.out.print("Your mpg of your car is " + milesPerGallon + ".");

    }
}
