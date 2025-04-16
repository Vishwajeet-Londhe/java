package Leetcode;

public class countnoofvowel2586 {
    public static void main(String[] args) {
        String[] words = {"are","amy","u"};
        int left = 0;
        int right = 2;
        System.out.println(vowelStrings(words,left,right));
    }

    public static int vowelStrings(String[] words, int left, int right) {

        int count = 0;
        for(int i=left;i<=right;i++){
            int s = words[i].charAt(0);
            int e = words[i].charAt(words[i].length() - 1);

            if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u'){
                if(e=='a' || e=='e' || e=='i' || e=='o' || e=='u'){
                    count ++;
                }
            }
        }
        return count;
    }
}
