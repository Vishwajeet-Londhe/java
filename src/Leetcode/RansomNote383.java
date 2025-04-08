package Leetcode;

public class RansomNote383 {
    public static void main(String[] args) {
        String ransomeNote = "aa";
        String magazine = "b";
        System.out.println(canConstruct(ransomeNote,magazine));
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
