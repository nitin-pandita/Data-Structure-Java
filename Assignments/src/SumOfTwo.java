import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Value: ");
        float uservalue1 = sc.nextFloat();
        System.out.println("Enter the Second Value: ");
        float uservalue2 = sc.nextFloat();

        float sum = calculate(uservalue1,uservalue2);
        System.out.println(sum);

    }
    static float calculate(float a, float b){

        float sum = a + b;
        return sum;
    }
}
