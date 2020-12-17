package exercises;
import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the rectangle?");
        int rectangleLength = input.nextInt();
        System.out.print("What is the width of the rectangle?");
        int rectangleWidth = input.nextInt();
        int rectangleArea = rectangleLength * rectangleWidth;
        System.out.print("The area of the rectangle is " + rectangleArea + ".");

    }
}
