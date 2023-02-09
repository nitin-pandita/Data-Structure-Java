public class Palin {
    public static void main(String[] args) {
        String str = "";
        System.out.println(Palindrome(str));
    }
    static boolean Palindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() /2 ; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length()-1 - i); // because we have to moving from
            // the end also

          if(start != end){
              return false;
          }
        }
        return true;
    }
}
