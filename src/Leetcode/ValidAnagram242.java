package Leetcode;

public class ValidAnagram242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        String s1 = "car";
        String t1 = "rat";

        System.out.println(isAnagram(s,t));
        System.out.println(isAnagram(s1,t1));
    }

    public static boolean isAnagram(String s, String t) {

        int m=s.length();
        int n=t.length();
        if(m!=n){
            return false;
        }else{
            int[] count = new int[26];
            for(int i=0;i<m;i++){
                count[s.charAt(i)-'a']++;
            }

            for(int i=0;i<n;i++){
                count[t.charAt(i)-'a']--;
            }

            for(int i=0;i<count.length;i++){
                if(count[i]!=0){
                    return false;
                }
            }
        }
        return true;
    }
}
