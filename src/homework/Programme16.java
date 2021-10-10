package homework;

import java.util.Scanner;

public class Programme16 {


    public static String addition() {
        String a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        a = input.nextLine();
        System.out.print("Input second binary number: ");
        b = input.nextLine();

        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);

//        String add = (a+b);
        int sum = a1 + b1;
        return Integer.toBinaryString(sum);

    }


    public static void main(String[] args) {

        System.out.println("Sum of two binary numbers: " + addition());

    }
}
