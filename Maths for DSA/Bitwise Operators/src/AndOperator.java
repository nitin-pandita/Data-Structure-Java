public class AndOperator {
    public static void main(String[] args) {
        System.out.println(IsOdd(46));
    }
    static boolean IsOdd(int n){
        return (n & 1) == 1;
//        1 0 0 1 0 1 //1 is call least significant number
//        0 0 0 0 0 1
//        --------------
//         1 0 0 1 0 1
    }
}
