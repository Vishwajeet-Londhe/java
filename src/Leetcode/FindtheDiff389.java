package Leetcode;

public class FindtheDiff389 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        String s1 = "";
        String t2 = "y";

        System.out.println(findTheDifference(s,t));
        System.out.println(findTheDifference(s1,t2));
    }
    public static char findTheDifference(String s, String t) {

        int total = 0;
        for(int i = 0; i<t.length();i++){
            total = total + t.charAt(i);
        }
        for(int i = 0; i<s.length();i++){
            total = total - s.charAt(i);
        }
        return (char)total;
    }
}
