package L15Recursion;

public class Pattern1 {
    public static void f(int row,int col, int n){
        if(row>n) return;
        if (col>n){
            System.out.println();
            f(row+1,1,n);
            return;
        }
        System.out.print("*");
        f(row,col+1,n);
    }
    public static void main(String[] args){
        f(1,1,8);
    }
}
