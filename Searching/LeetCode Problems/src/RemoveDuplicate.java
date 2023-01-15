public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {

        //Here we declared a pointer to keep the track of previous index
        int previous = 0;

        for(int i = 1; i < nums.length; i++)
        {
            //Condition used - if the integer at i'th index is not equal to integer at previous'th index then the condition is satisfies i.e both the integer are different
            if(nums[i] != nums[previous])
            {
                //Incresing the previous by one to update its position by 1.
                previous++;

                //Inserting the value at i'th index to the previous'th index
                nums[previous] = nums[i];
            }
        }

        return previous+1;
    }

}
