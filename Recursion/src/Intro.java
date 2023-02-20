public class Intro {
    public static void main(String[] args) {
        // we have to print hello world 5 without without making any change in the message function;
        message();
        // and we have to call only message function
    }
    static void message(){
        System.out.println("Hello World");
        message1();
    }
    static void message1(){
        System.out.println("Hello World");
        message2();
    }
    static void message2(){
        System.out.println("Hello World");
        message3();
    }
    static void message3(){
        System.out.println("Hello World");
        message4();
    }
    static void message4(){
        System.out.println("Hello World");
    }

}
