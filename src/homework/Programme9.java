package homework;

import java.util.Scanner;

public class Programme9 {

    public static void uppercase() {

        Scanner input = new Scanner(System.in);
        System.out.println("Write sentence in UPPERCASE");
        String a = input.nextLine();
        String b = a.toLowerCase();
        System.out.println("Result: " + b);

    }

    public static void main(String[] args) {

        uppercase();
    }
}
