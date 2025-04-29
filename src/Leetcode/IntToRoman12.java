package Leetcode;

public class IntToRoman12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(253));
    }
    public static String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();

        String[] notations = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value ={1000, 900, 500, 400, 100,  90,  50,  40,  10,   9,   5,   4,   1};

        for (int i = 0; i < value.length; i++) {
            while (num >= value[i]) {
                roman.append(notations[i]);
                num -= value[i];
            }
        }
        return roman.toString();
    }
}
