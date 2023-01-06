package Functions;

public class BlockScope {
    public static void main(String[] args) {
        int a = 12;
        int b = 34;
// block scope

        {
//            int a = 34; // it cannot not be initialized again because it has already being initialized above
            int c = 45;
            a = 45;
        }
//        System.out.println(c); // it cannot be accessed because the value declared inside the block scope will remain inside the block code
//        it can't be accessed outside the scope
        System.out.println(a);
    }
}
