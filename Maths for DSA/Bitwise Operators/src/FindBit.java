public class FindBit {
    public static void main(String[] args) {
        int n = 9;
        int k = 13;
        System.out.println(bit(n,k));
    }
    static int bit(int n, int k){

        return ((n & (1 << k-1)) << (k-1));
    }
}
