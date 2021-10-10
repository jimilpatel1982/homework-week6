package homework;

public class Programme4 {

    int a = 5;
    int b = 7;
    static int c = 9;
    static int d = 11;

    public void addition() {

        System.out.println(a + b + Programme4.c + Programme4.d);
    }

    public static void multiplication() {

        Programme4 obj = new Programme4();

        int e = obj.a;
        int g = obj.b;

        System.out.println((e * g) * (c * d));

    }

    public static void main(String[] args) {

        Programme4 obj1 = new Programme4();

        obj1.addition();
        multiplication();
    }
}


