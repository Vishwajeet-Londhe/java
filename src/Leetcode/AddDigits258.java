package Leetcode;

public class AddDigits258 {
    public static void main(String[] args) {
        System.out.println(addDigits(345));
    }
    public static int addDigits(int num) {
        if(num==0){
            return 0;
        }
        return (num%9==0)?9:num%9;
    }
}
