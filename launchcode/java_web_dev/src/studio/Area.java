package studio;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the radius of the circle?");
        double circleRadius = input.nextDouble();
/*
        if (circleRadius < 0.0) {
            System.out.print("Input not valid. Please enter a postive numeric value.");
        } else if (circleRadius instanceOf double){
            System.out.print("Input not valid. Please enter a postive numeric value.");
        } else {
            System.out.print("The area of the circle is " + Circle.getArea(circleRadius) + ".");

        }
*/
            // double circleArea = Math.PI * circleRadius * circleRadius;
        System.out.print("The area of the circle is " + Circle.getArea(circleRadius) + ".");

    }
}
