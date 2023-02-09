import java.lang.reflect.Array;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Nitin Pandita";
        String name2 = "Nitin Pandita";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase()); // creating new object as the string are immutable because for security
        System.out.println(name.indexOf('t'));
        System.out.println("    nitin".strip()); // remove spaces
        System.out.println(name.equals(name2));
        System.out.println(Arrays.toString(name.getBytes()));
//        System.out.println(name.wait(2000,23));
        System.out.println(name); // original name will remain the same
    }
}
