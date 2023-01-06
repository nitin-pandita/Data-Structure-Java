package Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10; // initializing
        int b = 20;

//        System.out.println(marks); // marks cannot be accessed as has no scope in this function.
        {
            a = 50; // updating the value
            int k = 34;
            System.out.println(k);
        }
        int k = 56;
        System.out.println(k);
//        for (int i = 0; i<= 10; i++){
//            System.out.println(i);
//
//        }
//        System.out.println(i); // for loop, we can't access it outside the loop

    }
    static void random(int marks){
        int num = 45;
        System.out.println(num);
        System.out.println(marks); // marks can be accessed inside the random function
    }
}
