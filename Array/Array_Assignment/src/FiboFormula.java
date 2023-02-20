public class FiboFormula {
    public static void main(String[] args) {
        System.out.println(fibo(12));
    }
    static int fibo(int n){
        return (int)((Math.pow((1 + Math.sqrt(5)/2),n)) - (Math.pow((1 - Math.sqrt(5)/2),n)) /Math.sqrt(5));
    }
}
