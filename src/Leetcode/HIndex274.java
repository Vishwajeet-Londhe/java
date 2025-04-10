package Leetcode;

public class HIndex274 {
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {

        int n=citations.length;
        int[] arr = new int[n+1];

        for(int c:citations){
            if(c>n){
                arr[n]++;
            }else{
                arr[c]++;
            }
        }

        int count=0;
        for(int i=n;i>=0;i--){
            count+=arr[i];
            if(count>=i){
                return i;
            }
        }
        return 0;
    }
}
