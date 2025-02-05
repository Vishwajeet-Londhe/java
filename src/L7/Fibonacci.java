package L7;

public class Fibonacci {
    public static void main(String[] args) {

        int n =5;

        int a=0;
        int b=1;

        int count = 1;

        while (count <= n) {

            System.out.println(a);

            int sum = a + b;
            a=b;
            b=sum;

            count = count + 1;
        }
    }
}
