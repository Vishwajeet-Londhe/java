package L15Recursion;

public class PrintArray {
    public static void f(int [] arr, int idx){
        if(idx>= arr.length) return;
        System.out.println(arr[idx]);
        f(arr, idx+1);
    }
    public static void main (String[] args){
        int[] arr = {21,23,543,23,12};
        f(arr,0);
    }
}
