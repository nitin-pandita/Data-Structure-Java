import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+ 'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+1));
        System.out.println("a" + 1);
        // it is work same as "a" + "1";
        //integer will be converted to Integer and then it will be converted to toString() function;

        // let's do some complex stuff
        System.out.println("Nitin"+ new ArrayList<>());
        System.out.println("Nitin" + new Integer(56));// it is an object so it will not give value
        // as we know the println convert it to toString
        System.out.println(new Integer(56) +" "+ new ArrayList<>());

    }


}
