package homework;

import java.util.Scanner;

public class Programme18 {

    public static void mathOperations() {

        int a, b;

        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        a = input.nextInt();
        System.out.print("Input second number: ");
        b = input.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " mod " + b + " = " + (a % b));


    }

    public static void main(String[] args) {

        mathOperations();
    }

}
