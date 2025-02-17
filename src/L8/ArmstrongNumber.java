package L8;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        System.out.println(isArmstrong(1634));
          printArmstrongNumbers(100,500);
    }

    public static void printArmstrongNumbers(int lo, int high){
        for(int n = lo; n<=high; n++){
            boolean res = isArmstrong(n);
            if (res){
                System.out.println(n);
            }
        }
    }

    public static boolean isArmstrong(int n){

        int nod = countDigits(n);
        int on = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            sum += Math.pow(rem,nod);
            n=n/10;
        }
        return sum==on;
    }

    public static int countDigits(int n){
        int nod = 0;

        while (n>0){
            n=n/10;
            nod ++;
        }
        return nod;
    }


}
