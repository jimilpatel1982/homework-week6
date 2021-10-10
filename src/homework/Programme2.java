package homework;

/*  Creating static variables and static method
 *   and calling static variables into static method
 *   and calling static method into main
 */

public class Programme2 {

    static int a = 30;  //static variable
    static int b = 20;  //static variable

    static void addition() {
        //static area
        System.out.println(a + b);

    }

    public static void main(String[] args) {

        addition();

    }
}
