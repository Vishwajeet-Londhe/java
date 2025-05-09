package Leetcode;

public class MaxSubarr53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums1 = {1};
        int[] nums2 = {5,4,-1,7,8};

        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray(nums1));
        System.out.println(maxSubArray(nums2));
    }
    public static int maxSubArray(int[] nums) {

        int sum = 0;
        int max_sum = nums[0];

        for(int i=0;i<nums.length;i++){
            sum =sum+nums[i];
            if(sum>max_sum){
                max_sum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max_sum;
    }
}
