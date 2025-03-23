package Leetcode;

public class LarSubstringbw2EQchar1624 {
    public static void main(String[] args) {
        String s = "abcda";
        String s1 = "abcdefgha";
        System.out.println(maxLengthBetweenEqualCharacters(s));
        System.out.println(maxLengthBetweenEqualCharacters(s1));
    }

    public static int maxLengthBetweenEqualCharacters(String s) {

        int[] indices = new int[26];
        int maxLen = -1;

        //a -> 97 - 97 = 0
        //b -> 98 - 97 = 1
        for(int i = 0; i<s.length();i++){
            int idx = s.charAt(i) - 'a';

            if(indices[idx]>0){

                //the current char is repeating one
                maxLen = Math.max(maxLen,i - indices[idx]);
            }else{

                //we are seeing this char for first one

                indices[idx] = i+1;
            }
        }
        return maxLen;
    }
}
