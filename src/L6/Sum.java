package L6;

public class Sum {
    public static void main(String[] args) {
        //sum of n natural number from 1 to 100

        int sum =0;

        for(int i = 1; i<=100; i++){
            sum +=i;
        }
        System.out.println(sum);

        //sum of n natural number from 1 to 1000 ( M-2 )

        int total =0;
        int n = 50;

        for(int i = 1; i<=n; i++){
            total +=i;
        }
        System.out.println(total);
    }
}
