package L11;

public class TWODArray {
    public static void main(String[] args) {

        int [] [] a = new int[3][4];

        int [] [] a1 = {
                {1,2},
                {3,4},
                {5,6}
        };
        System.out.println(a);

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        System.out.println(a.length);//rows length

        System.out.println(a[0].length);//col length

        // access value
        System.out.println(a[1][2]);
    }
}
