package homework;

import java.util.Scanner;

public class Programme8 {

    public static void triangle(int b, int h) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Triangle base value: ");
        b = input.nextInt();

        System.out.print("Enter Triangle height value: ");
        h = input.nextInt();

        System.out.print("Area of a Triangle : " + ((b * h) / 2));

    }

    public static void main(String[] args) {
        triangle(0, 0);
    }
}
