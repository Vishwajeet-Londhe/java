package Leetcode;

public class FindIndOfFirOccinStr28 {
    public static void main(String[] args) {
        String haystack =  "sadbutsad";
        String needle = "sad";

        String haystack1 = "leetcode";
        String needle1= "leeto";


        System.out.println(strStr(haystack,needle));
        System.out.println(strStr(haystack1,needle1));
    }
    public static int strStr(String haystack, String needle) {

        for(int i = 0; i<haystack.length()-needle.length()+1;i++){

            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
