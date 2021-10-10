package homework;

import java.util.Scanner;

public class Programme17 {

    public static void decimal() {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int a = input.nextInt();
        System.out.println("Binary number is: " + Integer.toBinaryString(a));

    }

    public static void main(String[] args) {

        decimal();
    }

}
