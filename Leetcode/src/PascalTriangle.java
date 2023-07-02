import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5;
        System.out.println();
    }
    public List<List<Integer>> generate(int numRows){
    List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row, pre = null;
        for (int i = 0; i < numRows; i++) {
            row = new ArrayList<Integer>();

            for (int j = 0; j <= i; j++) {
                if(j ==0 || j == i) {
                    row.add(1); // because first and last element is always 1
                }
                else{
                    row.add(pre.get(j-1) + pre.get(j));
                }
                pre = row;
                res.add(row);
            }
        }
        return res;
    }



}