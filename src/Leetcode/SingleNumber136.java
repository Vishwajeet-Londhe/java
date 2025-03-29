package Leetcode;

public class SingleNumber136 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int value = 0;
        for(int i = 0; i<nums.length;i++){
            value = value^nums[i];
        }
        return value;
    }
}
