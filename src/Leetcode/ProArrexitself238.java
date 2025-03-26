package Leetcode;

import java.util.Arrays;

public class ProArrexitself238 {
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums1)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans [] = new int [n];

        int ProdL =1 ;
        int ProdR =1 ;

        for(int i = n-1;i>=0;i--){
            ans[i] = ProdR;
            ProdR = ProdR*nums[i];
        }

        for(int i = 0; i<n;i++){
            ans[i]=ans[i]*ProdL;
            ProdL = ProdL*nums[i];
        }

        return ans;
    }
}
