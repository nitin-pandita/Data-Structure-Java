import java.util.List;

public class CountItems {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"phone", "blue", "pixel"},
                {"computer", "silver", "lenovo"},
                {"phone", "gold", "iphone"}
        };

        String ruleKey = "color";
        String ruleValue = "silver";

//        System.out.println(countMatches(arr,ruleKey,ruleValue));
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int res = 0;

        for (int i = 0; i < items.size(); i++) {

            if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) {
                res++;                      // col    // row
            }
            if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
                res++;
            }
            if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
                res++;
            }
        }
        return res;
    }
}

