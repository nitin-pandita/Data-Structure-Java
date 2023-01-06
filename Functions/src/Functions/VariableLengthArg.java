package Functions;

import java.util.Arrays;

public class VariableLengthArg {
    public static void main(String[] args) {
//        fun("khtrf","Park","Hello","Nitin");
//        multiple(34,56,"kartik","Pandita");
        demo("kartik","pandita");
    }
    // overloading in variable length arguments
    static void demo(int ...v){

    }
    static void demo(String ...v){

    }
    static void fun(String ...v){
//        System.out.println(Arrays.toString(v));
    }
}
