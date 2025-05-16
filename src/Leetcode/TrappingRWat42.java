package Leetcode;

public class TrappingRWat42 {
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height1 = {4,2,0,3,2,5};

        System.out.println(trap(height));
        System.out.println(trap(height1));
    }
    public static int trap(int[] height) {

        int len =height.length;
        int[] left = new int[len];
        left[0] = height[0];
        for(int i =1;i<len;i++){
            left[i] = Math.max(height[i],left[i-1]);
        }

        int[] right = new int[len];
        right[len-1]=height[len-1];
        for(int i =len-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }

        int water=0;
        for(int i=0;i<len;i++){
            water += (Math.min(left[i],right[i]))-height[i];
        }
        return water;
    }
}
