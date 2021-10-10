package homework;

import java.util.Scanner;

public class Programme6 {
    public static final double PI = 3.14159265358979323846;

    public void radius(double a) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter radius of circle : ");
        a = input.nextInt();
        System.out.print("\033[1mResult: " + (Programme6.PI * a * a));

    }

    public static void main(String[] args) {
        Programme6 obj = new Programme6();

        obj.radius(0);

    }

}
