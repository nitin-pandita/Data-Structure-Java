import java.util.Scanner;

public class GradeFInder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks: ");
        int n = sc.nextInt();

        String ans = grade(n);

        System.out.print("Your grade is: "+ ans);



    }
    static String grade(int marks){
        String canditate = null;
        if(marks >= 91 && marks <=100){
            return "AB";
        } else if (marks >= 81 && marks <= 90) {
            return "AB";
        } else if (marks >= 71 && marks <= 80) {
            return "BB";
        } else if (marks >= 61 && marks <= 70) {
            return "BC";
        }else if (marks >=51 && marks <= 60){
            return "CD";
        } else if (marks >= 41 && marks <= 50) {
            return "DD";
        } else{
            return "Fail";
        }



    }
}
