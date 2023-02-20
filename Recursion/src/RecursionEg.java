public class RecursionEg {
    public static void main(String[] args) {
//        numbers(1);

        System.out.println(fibo(6));
    }

    static void recursion(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("Hello world");
        recursion(n - 1);
    }

    static void numbers(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        } else {
            System.out.println(n);
            numbers(n + 1);
        }
    }

    static int fibo(int n) {

        //base condition
        if (n < 2) {
            return n;
        }
        // previous and next
        return fibo(n - 1) + fibo(n -2);


    }
}
