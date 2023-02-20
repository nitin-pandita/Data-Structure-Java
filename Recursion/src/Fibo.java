public class Fibo {
    public static void main(String[] args) {

        System.out.println(fibo(6));
    }
    static int fibo(int n){

        //base condition
        if(n < 2){
            return n; // mean if n is 0 return 0 and if n is 1 return 1;
        }

        // Recursion tree
        return fibo(n-1) + fibo(n-2);
    }
}
