package Leetcode;

public class RemDupFromSortedArr26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        int[] nums2 = {5,6,6,6,7,7,7,7,8,9};

        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates(nums1));
        System.out.println(removeDuplicates(nums2));

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
