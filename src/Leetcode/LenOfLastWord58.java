package Leetcode;

public class LenOfLastWord58 {
    public static void main(String[] args) {
        String s = "Hello World";
        String s1 = "   fly me   to   the moon  ";
        String s2 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord(s2));
    }
    public static int lengthOfLastWord(String s) {
        String str = s.trim();

        int count = 0;
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}

