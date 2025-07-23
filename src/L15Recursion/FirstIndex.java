package L15Recursion;

public class FirstIndex {
    public static int f(int [] arr, int idx, int x){
        //base
        if(idx==arr.length) return -1;
        return (arr[idx]==x) ? idx: f(arr,1,x);
    }
    public static void main (String[] args){
        int[] arr = {31,22,12,56,13,22,85,95,48};
        int x = 22;
        System.out.println(f(arr,0,x));
    }
}
