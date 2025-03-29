package Leetcode;

public class CheckBalString3340 {
    public static void main(String[] args) {
        String num = "1234";
        String num1 = "24123";
        System.out.println(isBalanced(num));
        System.out.println(isBalanced(num1));
    }
    public static boolean isBalanced(String num) {

        int evensum = 0;
        int oddsum = 0;

        for(int i=0; i<num.length();i++){
            if(i%2==0){
                evensum+=num.charAt(i)-'0';
            }else{
                oddsum+=num.charAt(i)-'0';
            }
        }
        return oddsum==evensum;
    }
}
