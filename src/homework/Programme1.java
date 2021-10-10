package homework;

/* Programme example of creating instance variable and instance method
 *  and calling instance method into main method
 */
public class Programme1 {

    int a = 10; // instance variable
    int b = 20; // instance variable

    public void addition() {
        // instance area
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        Programme1 obj = new Programme1();

        obj.addition();

    }

}
