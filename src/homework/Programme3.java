package homework;

/*  Creating instance and static variables
*   and instance and static methods
    and calling both methods into main method
 */

public class Programme3 {

    int a = 40; // instance variable
    static int b = 30; //static variable

    public void addition() {
        // instance area
        System.out.println(a + Programme3.b);
    }

    public static void multiplication() {
        // static area
        Programme3 obj = new Programme3();

        int c = obj.a;

        System.out.println(b * c);

    }

    public static void main(String[] args) {

        Programme3 obj1 = new Programme3();

        obj1.addition();

        multiplication();

    }
}
