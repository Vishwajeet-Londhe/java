package Leetcode;

public class AddDigits258 {
    public static void main(String[] args) {
        System.out.println(addDigits(345));
        System.out.println(addDigits(11));
        System.out.println(addDigits(181));
        System.out.println(addDigits(222));
    }
    public static int addDigits(int num) {
        if(num==0){
            return 0;
        }
        return (num%9==0)?9:num%9;
    }
}
