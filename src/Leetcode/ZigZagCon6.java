package Leetcode;

public class ZigZagCon6 {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }

        int cr = 0, i = 0, mod = 0;
        int[] dir = {1, -1};

        while (i < s.length()) {
            arr[cr].append(s.charAt(i));
            i++;
            int newRow = cr + dir[mod];
            if (newRow < 0 || newRow >= numRows) {
                mod = (mod + 1) % 2;
                newRow = cr + dir[mod];
            }
            cr = newRow;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder st : arr) {
            res.append(st);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        String s1 = "PAYPALISHIRING";
        int numRows1 = 4;

        System.out.println(convert(s,numRows));
        System.out.println(convert(s1,numRows1));
    }
}
