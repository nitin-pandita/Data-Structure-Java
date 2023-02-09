public class Main {
    public static void main(String[] args) {
//        String a = "Nitin ";
//        System.out.println(a);
//        a = "Pandita";
//        System.out.println(a);

        // pool example
//        String a = "Nitin";
//        String b = "Nitin";
//        System.out.println(a == b);
//    }

        // what if we want to create two different objects for each reference variable
        // it means outside the pool

        String a = new String("Nitin");
        String b = new String("Nitin  ");

//        System.out.println(a == b);
        System.out.println(a.equals(b)); // equals here is a method
    }
}