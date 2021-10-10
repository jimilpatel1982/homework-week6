package homework;

public class objectpractice3 {

    static int a = 30;

    public void test2(){

        int b= objectpractice3.a;
        System.out.println(b);
    }

    public static void main(String[] args) {

        objectpractice3 obj3 = new objectpractice3();

        obj3.test2();

    }
}
