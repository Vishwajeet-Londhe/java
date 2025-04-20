package L15Recursion;

public class PrintDecreasing {
    public static void main(String[] args) {
        decrease(50);
    }
    public static void decrease(int n){
        //base case
        if(n==0){
            return; //do nothing as 0 is not a natural number
        }
        System.out.println(n);
        decrease(n-1);
    }
}
