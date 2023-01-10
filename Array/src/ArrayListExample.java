import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);

//        list.add(5512);
//        list.add(2412);
//        list.add(1212);
//        list.add(112);
//        list.add(1223);
//        list.add(234);
//        list.add(5512);

//        System.out.println(list.contains(234)); // contains an element
//        System.out.println(list);
//
//        list.remove(2); // removing of an element
//        list.set(4,12); // 4th index 12 value
//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i <5; i++) {
            System.out.print(list.get(i)+ " "); // pass index here, list[index] syntax will not work here
        }

    }
}
