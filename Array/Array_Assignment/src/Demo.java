public class Demo {

    // by using recursion
    public static void main(String[] args) {
//        System.out.println(fibo(12));
        fibo1(12);
    }
    static int fibo(int n ){
        if(n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
    static void fibo1(int n){
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum= first + second;
            first = second;
            second = sum;
        }
        System.out.println(sum);

    }
}
