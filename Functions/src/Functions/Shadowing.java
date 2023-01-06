package Functions;

public class Shadowing {
    static int x = 50; // for static use static
    // it is shadowing at line 9 because high presidence will be dominated

    public static void main(String[] args) {
        System.out.println(x);
        int x = 707; // high presidence than line 4  x variable

        System.out.println(x);
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
