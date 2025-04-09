package Leetcode;

public class RansomNote383 {
    public static void main(String[] args) {
        String ransomeNote = "aa";
        String magazine = "b";

        String ransomeNote1 = "aa";
        String magazine1 = "ab";

        String ransomeNote2 = "aa";
        String magazine2 = "aab";

        String ransomeNote3 = "abcdef";
        String magazine3 = "aabbccddeeff";


        System.out.println(canConstruct(ransomeNote,magazine));
        System.out.println(canConstruct(ransomeNote1,magazine1));
        System.out.println(canConstruct(ransomeNote2,magazine2));
        System.out.println(canConstruct(ransomeNote3,magazine3));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];
        for(char c:magazine.toCharArray())
        {
            count[c-'a']++;
        }

        for(char c:ransomNote.toCharArray()){
            if(count[c-'a']==0){
                return false;
            }
            count [c-'a']--;
        }
        return true;
    }
}
