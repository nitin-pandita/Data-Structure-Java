import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = 45;
        int totol_choice = 5;
        while(true){
            System.out.println("Make a Guess: ");
            int guess = sc.nextInt();
            if(guess == target){
                System.out.println("Well done you found the Number");
                break;
            } else if (guess > target) {
                System.out.println("To hight");
                totol_choice--;
                System.out.printf("Guess Remaining %s ",totol_choice);
                System.out.println();
                System.out.println("Guess Again");
                System.out.println();
            }else{
                System.out.println("Too Low");
                totol_choice--;
                System.out.printf("Guess Remaining %s", totol_choice);
                System.out.println();
            }

            if( totol_choice == 0){
                System.out.println("You lost");
                break;
            }
        }
    }
}
