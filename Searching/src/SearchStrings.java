public class SearchStrings {
    public static void main(String[] args) {
        String name = "Kartik";
        char target = 'r';
//        System.out.println(search(name,target));
        System.out.println(search2(name, target));
    }
    // want to return the index
    static int search2(String name, char target) {
        if (name.length() == 0) { // here length is a function not a variable
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    static boolean search(String name, char target) {
        if (name.length() == 0) { // here length is a function not a variable
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
