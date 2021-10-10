package homework;

public class Programme12 {

    public static void compute() {

        double a = 25.5;
        double b = 3.5;
        double c = 40.5;
        double d = 4.5;

        System.out.println("Test Data: " + "((" + a + "*" + b + "-" + b + "*" + b + ")/(" + c + "-" + d + "))");
        System.out.println("Expected Output: " + (a * b - b * b) / (c - d));

    }

    public static void main(String[] args) {
        compute();
    }
}
