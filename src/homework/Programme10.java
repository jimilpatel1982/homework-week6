package homework;

import java.util.Scanner;

public class Programme10 {

    public static void tables(int a) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input Number: ");
        a = input.nextInt();
        System.out.println("Table of " + a);
        System.out.println(a + " x 1 = " + (a));
        System.out.println(a + " x 2 = " + (a * 2));
        System.out.println(a + " x 3 = " + (a * 3));
        System.out.println(a + " x 4 = " + (a * 4));
        System.out.println(a + " x 5 = " + (a * 5));
        System.out.println(a + " x 6 = " + (a * 6));
        System.out.println(a + " x 7 = " + (a * 7));
        System.out.println(a + " x 8 = " + (a * 8));
        System.out.println(a + " x 9 = " + (a * 9));
        System.out.println(a + " x 10 = " + (a * 10));


    }

    public static void main(String[] args) {

        tables(0);
    }
}
