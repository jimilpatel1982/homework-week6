package homework;

import java.util.Scanner;

public class Programme13 {

    public static void average(double a, double b, double c) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        a = input.nextDouble();
        System.out.print("Enter 2nd Number: ");
        b = input.nextDouble();
        System.out.print("Enter 3rd Number: ");
        c = input.nextDouble();

        System.out.println("Average of three numbers: " + ((a + b + c) / 3));

    }

    public static void main(String[] args) {

        average(0, 0, 0);
    }
}
