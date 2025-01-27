package Operator;

public class Assignment {
    public static void main(String[] args) {
        int age;
        age = 5;

        int a=20;
        int val = age;

        System.out.println(val);

        val += a;
        System.out.println(val);
        val -= a;
        System.out.println(val);
        val *= a;
        System.out.println(val);
        val /= a;
        System.out.println(val);
        val %= a;
        System.out.println(val);

    }
}
