public class Pangram {
    public static void main(String[] args) {
        String sentence = "the";
        System.out.println(pangram(sentence));
    }


    static boolean pangram(String alphabet) {

        // pangram
        // first let's create a array of size of number of alphabets present in the english aplhabets
        int[] count = new int[26]; // 26 is the number of alphabets

        // filling the array with the elements present in it;

        for (int i = 0; i < alphabet.length(); i++) {
            count[alphabet.charAt(i) - 'a']++; // we are subtracting 'a' because we have to place the char at
            // their place according to the english alphabets


        }

        // checking if the char is present in the array or not

        for (int i : count) {
            if (i < 1) {
                return false;
            }
        }
        return true;

    }
}

