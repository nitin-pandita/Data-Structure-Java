package Functions;

public class SwapExample {
    public static void main(String[] args) {
//        String name = "Nitin Pandita";
//         changeName(name);
//        System.out.println(name);

        int a =12;
        int b = 23;

        sum(a,b);
        System.out.println(a + " "+ b);
    }

    static void sum(int a, int b) {
      int temp = a;
      a = b;
      b = temp;
    }

    static void changeName(String name) {
        name = "kartik ";

    }


}
