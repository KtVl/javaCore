package exceptions.lesson;

public class Exception {
    public static void main(String[] args) {
        //исключения
        try {
            test1();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("поймали исключение ArrayIndexOutOfBoundsException");
            System.out.println(ex.getMessage());
        }

        try {
            test2();
        } catch (ArithmeticException ex) {
            System.out.println("поймали исключение ArithmeticException");
            System.out.println(ex.getMessage());
        }
    }

    public static void test1() {
        int[] ints = new int[4];
        ints[5] = 5; // кидает ArrayIndexOutOfBoundsException
        System.out.println(ints[5]);
    }

    public static void test2() {
        int test = 1 / 0; // кидает ArithmeticException
    }
}
