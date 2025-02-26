package L9Array;

import java.util.ArrayList;

public class AddTwoArray {
    public static void main(String[] args) {

        int [] one = {5,6,7};
        int [] two = {1};

        System.out.println(SumofTwoArrays(one,two));
    }

    private static ArrayList SumofTwoArrays(int[] one, int[] two) {
        ArrayList <Integer> anss = new ArrayList<>();

        int carry = 0;

        int i = one.length-1;
        int j = two.length-1;

        while (i >= 0 || j>=0){

            int sum = carry;

            if(i>=0){
                sum += one[i];
            }

            if (j>=0){
                sum += two[j];
            }

            sum += carry;

            int rem = sum%10;
            carry = sum/10;

            anss.add(0,rem);
            i--;
            j--;
        }
        return anss;
    }
}
