package L6;

public class DoWhile {
    public static void main(String[] args) {
        //while vs doWhile
        //while

        int n1 = 10;
        int i1 = 1;

        while (i1<=n1){
            System.out.println("Hello While"+ " " + i1);
            i1++;
        }

        //do...while
        int n2=10;
        int i2=1;

        do{
            System.out.println("Hello DoWhile" + " "+i2);
            i2++;
        }while (i2<=n2);



        //for vs do...while

        for (int m = 100; m<=99; m++){
            System.out.println("for cond");
        }

        int m = 100;
        do{
            System.out.println("Hello");
            m++;
        }while (m<=99);
    }
}
