package Leetcode;

public class FindUniqueBinaryString1980 {
    public static void main(String[] args) {
        String[] nums = {"111","101","001"};
        System.out.println(findDifferentBinaryString(nums));
    }

    public static String findDifferentBinaryString(String[] nums) {

        int n = nums.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n;i++){
            if(nums[i].charAt(i)=='0'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        return sb.toString();
    }
}
