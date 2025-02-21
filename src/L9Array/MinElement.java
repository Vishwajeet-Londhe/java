package L9Array;

public class MinElement {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        minElement(arr);

    }
    public static void minElement(int[] arr){
        int min = Integer.MAX_VALUE;
        //int min = arr[0];   uppear ki line ki jagah yke bhi likh sakta

        for (int i = 0; i< arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
