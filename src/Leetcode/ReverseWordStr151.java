package Leetcode;

public class ReverseWordStr151 {
    public static void main(String[] args) {
        String words = "     the sky is    blue  ";
        System.out.println(reverseWords(words));
    }
    public static String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();

    }
}
