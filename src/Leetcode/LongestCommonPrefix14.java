package Leetcode;

import java.util.Arrays;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        String[] str1 = {"car", "ant", "fish"};
        String[] str2 = {"vaibhavi", "vaishali","vaidanti"};
        System.out.println(longestCommonPrefix(str));
        System.out.println(longestCommonPrefix(str1));
        System.out.println(longestCommonPrefix(str2));

    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];

        int index = 0;
        while(index<str1.length()){
            if(str1.charAt(index)==str2.charAt(index)){
                index ++;
            }else{
                break;
            }
        }
        return index == 0 ? "" : str1.substring(0,index);
    }
}
