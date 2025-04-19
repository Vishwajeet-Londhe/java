package Leetcode;

public class JumpGameii45 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int[] nums1 = {2,3,0,1,4};
        int[] nums2 = {2,4,1,2,3,1,1,2};

        System.out.println(jump(nums));
        System.out.println(jump(nums1));
        System.out.println(jump(nums2));
    }

    public static int jump(int[] nums) {

        int totalJumps = 0;
        int destination = nums.length - 1;
        int coverage = 0;
        int lastJumpIdx = 0;

        if(nums.length == 1){
            return 0;
        }

        for(int i =0;i<nums.length; i++){
            coverage = Math.max(coverage, i + nums[i]);

            if(i == lastJumpIdx){
                lastJumpIdx = coverage;
                totalJumps++;

                if(coverage>=destination){
                    return totalJumps;
                }
            }
        }
        return totalJumps;
    }
}
