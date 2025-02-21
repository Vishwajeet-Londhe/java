package L9Array;

public class maxElement {
    public static void main(String[] args) {
        int [] arr = {4435,2565,7876,45};
            maxElement(arr);

    }

    public static void maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        // int max = arr[0]; uppar ke line main ye bhi chalta

        for (int i =0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);


    }
}
