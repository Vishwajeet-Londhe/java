package L8;

import com.sun.source.tree.Scope;

public class AnotherExam {
    public static void main(String[] args) {

        System.out.println("--------Case1--------");
        int one = 10;
        int two = 20;

        int sum = scopes(one, two);
        System.out.println(sum);


        System.out.println("---------Case2---------");
        System.out.println(one + "," + two);
        swap(one, two);
        System.out.println(one + "," + two);
    }

    public static void swap(int one, int two){
        System.out.println(one+","+two);
        int temp = one;
        one = two;
        two = temp;
        System.out.println(one+","+two);
    }

    public static int scopes(int one, int another){
        int sum = one+another;
        return sum;
    }
}
