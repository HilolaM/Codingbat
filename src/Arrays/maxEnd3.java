package Arrays;

public class maxEnd3 {

    /*
    Given an array of ints length 3, figure out which is larger, the first or
    last element in the array, and set all the other elements to be that value. Return the changed array.
     */


    public int[] maxEnd3(int[] nums) {
        int max= Math.max(nums[0], nums[2]);
        int [] temp={max, max, max};
        return temp;
    }
}
