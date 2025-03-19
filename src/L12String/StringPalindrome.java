package L12String;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "nitin";
        String str1 = "Vaibhavi";
        String str2 = "naman";

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }

    public static boolean isPalindrome(String str){

        int left = 0;
        int right = str.length()-1;

        while (left<right){
            if (str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
