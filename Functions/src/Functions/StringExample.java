package Functions;
import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {
//        int sum = sum3(9,10);
//        System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        String personalised  = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String greeting = "Hello " + name;
        return greeting;
    }

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
    static String greet(){
        String greeting = "How are you my friend";
        return greeting;
    }
}
