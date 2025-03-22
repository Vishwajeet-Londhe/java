package Leetcode;

public class JumpGame55 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int[] nums1 = {3,2,1,0,4};
        System.out.println(canJump(nums));
        System.out.println(canJump(nums1));
    }
    public static boolean canJump(int[] nums) {

        int lastpos = nums.length-1;

        for(int i = nums.length-2;i>=0;i--){
            if(i+nums[i]>=lastpos){
                lastpos=i;
            }
        }
        return lastpos == 0;
    }
}
