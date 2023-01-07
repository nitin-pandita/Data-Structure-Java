import java.util.Scanner;

public class Voteeligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Age Please: ");
        int age = sc.nextInt();

        int eligible = voter(age);
        System.out.println(eligible);

    }
    static int voter(int k) {
        if (k >= 18) {
            System.out.println("You are eligible");
        } else {
            System.out.println("Not Eligible");

        }
        return k;
    }}
