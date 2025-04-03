package Leetcode;

public class RemDupFromSortedArr26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int iIdx=1;
        for(int i=1;i<nums.length;i++){

            if(nums[i-1] != nums[i]){
                nums[iIdx] = nums[i];
                iIdx ++;
            }
        }
        return iIdx;
    }
}
