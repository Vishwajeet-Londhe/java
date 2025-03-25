package Leetcode;

public class LarOddNumStr1903 {
    public static void main(String[] args) {
        String nums = "356";
        String nums1 = "2564749";
        String nums2 = "246";
        System.out.println(largestOddNumber(nums));
        System.out.println(largestOddNumber(nums1));
        System.out.println(largestOddNumber(nums2));
    }

    public static String largestOddNumber(String num) {

        for(int i = num.length() - 1; i>=0; i--)

            if(num.charAt(i) % 2 != 0) return num.substring (0,i+1);

        return "";



    }
}
