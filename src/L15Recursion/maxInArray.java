package L15Recursion;

public class maxInArray {
    public static int f(int [] arr, int idx){
        //base case
        if(idx==arr.length-1) return arr[idx]; //
        return Math.max(arr[idx],f(arr, idx+1));
    }
    public static void main (String[] args){
        int[] arr = {31,54,12,21,51,63,65,82,10};
        System.out.println(f(arr,0));
    }
}
