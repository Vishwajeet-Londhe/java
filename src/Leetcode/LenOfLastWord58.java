package Leetcode;

public class LenOfLastWord58 {
    public static void main(String[] args) {
        String s = "Hello World";


        System.out.println(lengthOfLastWord(s));

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

