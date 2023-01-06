package Functions;

public class Overloading {
    public static void main(String[] args) {
//        fun(34);
//        fun("kartik");
        int ans = sum(3,6); // overloading
        System.out.println(ans);
    }
    static int sum(int a, int b){
        return  a+b;
    }
    static  int sum(int a, int b, int c){
        return  a+b+c;
    }
    static void fun(int a){ // function with different argument with same name is called overloading.
        System.out.println("First One");
        System.out.println(a);


    }
    static void fun(String b){
        System.out.println("Second one");
        System.out.println(b);
    }
}
