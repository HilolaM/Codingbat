package Arrays;

public class maxEnd3 {

    /*
    Given an array of ints length 3, figure out which is larger, the first or
    last element in the array, and set all the other elements to be that value. Return the changed array.
     */

    public int[] maxEnd3(int[] nums) {
        int[] maxArr=new int[3];
        maxArr[0]=nums[0];
        if(maxArr[0]<=nums[2])
            maxArr[0]=nums[2];
        maxArr[1]=maxArr[0];
        maxArr[2]=maxArr[0];

        return maxArr;

    }
}
