package src;

import java.util.ArrayList;
import java.util.List;

public class GreatestNoOfCandy {
    public static void main(String[] args) {
        int [] arr = {2,3,5,1,3};
        int extracandy = 3;

        System.out.println(kidsWithCandies(arr,extracandy));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // int max = 0; greatest number of candies all kids have;

        int max = 0;

        for(int i =0 ; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        List <Boolean> list = new ArrayList<>();

        for(int i = 0; i < candies.length; i++){
            list.add(extraCandies + candies[i] >= max);
            // max isiliye nikala kyuiki agr extra candies milna ka baad
            // hum directly sabsa badha number ka saath compare kar skta hai

        }
        return list; // we will return the list here
    }
}
