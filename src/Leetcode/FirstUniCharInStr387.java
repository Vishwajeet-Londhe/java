package Leetcode;

public class FirstUniCharInStr387 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar( "aabb"));
    }
    public static int firstUniqChar(String s) {

        int [] freq = new int[26];

        char[] chars = s.toCharArray();
        for(char c:chars){
            freq[c-'a']++;
        }

        for(int i =0; i<chars.length;i++){
            if(freq[chars[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
