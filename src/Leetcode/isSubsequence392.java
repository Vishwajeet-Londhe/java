package Leetcode;

public class isSubsequence392 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        String s1 = "axc";
        String t1 = "ahbgdc";

        String s2 = "ace";
        String t2 = "abecd";

        String s3 = "ace";
        String t3 = "abzxvcde";

        System.out.println(isSubsequence(s,t));
        System.out.println(isSubsequence(s1,t1));
        System.out.println(isSubsequence(s2,t2));
        System.out.println(isSubsequence(s3,t3));
    }

    public static boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }

        int i =0;
        int j =0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        if(i==s.length()){
            return true;
        }
        return false;
    }
}
