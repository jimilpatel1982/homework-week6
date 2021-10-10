package homework;

import java.util.Scanner;

public class Programme5 {

    public static void main(String[] args) {
        Programme5 obj = new Programme5();
        Programme5 obj1 = new Programme5();
        // Scanner input = new Scanner(System.in);
//        System.out.println("Select arithmetic operator: + or - or * or / ");
//        String Addition = input.nextLine();

        obj.addition(0, 0);

        obj1.subtraction(0, 0);

        multiplication(0, 0);

        divide(0, 0);

    }

    public void addition(int c, int d) {

        System.out.println("Addition");
        Scanner input = new Scanner(System.in);
        System.out.print("Select First Number: ");

        c = input.nextInt();
        System.out.print("Select Second Number: ");
        d = input.nextInt();

        System.out.println("Result : " + (c + d));


    }

    public void subtraction(int c, int d) {

        System.out.println("Subtraction");

        Scanner input = new Scanner(System.in);
        System.out.print("Select First Number: ");

        c = input.nextInt();
        System.out.print("Select Second Number: ");
        d = input.nextInt();

        System.out.println("Result : " + (c - d));


    }


    public static void multiplication(int c, int d) {

        System.out.println("Multiplication");

        Scanner input = new Scanner(System.in);
        System.out.print("Select First Number: ");

        c = input.nextInt();
        System.out.print("Select Second Number: ");
        d = input.nextInt();

        System.out.println("Result : " + (c * d));


    }

    public static void divide(int c, int d) {

        System.out.println("Division");

        Scanner input = new Scanner(System.in);
        System.out.print("Select First Number: ");

        c = input.nextInt();
        System.out.print("Select Second Number: ");
        d = input.nextInt();

        System.out.println("Result : " + (c / d));


    }

}
