package homework;

import java.util.Scanner;

public class Programme7 {

    public static void temperature(int a) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit : ");
        a = input.nextInt();
        System.out.print("Temperature in Celsius : " + ((a - 32) * 5 / 9) + " °C");
    }

    public static void main(String[] args) {

        temperature(0);

    }
}
