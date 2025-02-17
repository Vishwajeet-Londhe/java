package L8;

import com.sun.source.tree.Scope;

public class AnotherExam {
    public static void main(String[] args) {

        System.out.println("--------Case1--------");
        int one = 10;
        int two = 20;

        int sum = scopes(one, two);
        System.out.println(sum);
    }

    public static int scopes(int one, int another){
        int sum = one+another;
        return sum;
    }
}
