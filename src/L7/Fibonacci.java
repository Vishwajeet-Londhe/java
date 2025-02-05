package L7;

public class Fibonacci {
    public static void main(String[] args) {

        int n =5;

        //print till nth fibonnaci numbers = n+1(count in while)
        //print first n fibonacci numbers = n(count in while)
        //print the nth fibonacci numbers

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
