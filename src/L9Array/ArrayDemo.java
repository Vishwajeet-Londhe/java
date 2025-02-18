package L9Array;

public class ArrayDemo {
    public static void main(String[] args) {

        int [] arr = new int[5];
        System.out.println(arr);

        //length of array
        System.out.println(arr.length);

        //get element from array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //set or update
        arr[0] = 32;
        arr[1] = 34;
        arr[2] = 24;
        arr[3] = 53;
        arr[4] = 43;

        //get element from array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        //System.out.println(arr[5]); // error out of size
    }
}
