package homework;


import java.util.Scanner;

public class Programme14 {
    static double a, b;

    public static void area() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Width of Rectangle: ");
        a = input.nextDouble();
        System.out.print("Enter Height of Rectangle: ");
        b = input.nextDouble();

        System.out.println("Area is " + a + " * " + b + " = " + (a * b));

    }

    public static void perimeter() {

        System.out.println("Perimeter is 2 * (" + a + " + " + b + ") = " + (2 * (a + b)));

    }

    public static void main(String[] args) {

        area();
        perimeter();

    }

}
