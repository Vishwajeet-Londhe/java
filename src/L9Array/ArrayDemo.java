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

        //rebundancy code
        for (int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }

        //last to first
        for (int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

        //enhanced for loop
        System.out.println("----------EF---------");

        for (int val:arr){
            System.out.println(val);
        }

        System.out.println("--------case0------");
        int [] arr1 = arr;
        arr[3]= 100;
        System.out.println(arr[3]);



        int i = 0; //32
        int j = 2; //24

        System.out.println("------Case1-------");
        System.out.println(arr[i]+","+arr[j]);
        swap(arr[i],arr[j]);
        System.out.println(arr[i]+","+arr[j]);

        System.out.println("-------Case2--------");
        System.out.println(arr[i]+","+arr[j]);
        swap(arr,i,j);
        System.out.println(arr[i]+","+arr[j]);

        System.out.println("--------Case3--------");
        int[] other = {100,200,300,400,500};
        System.out.println(arr[0]+","+other[0]);
        swap(arr,other);
        System.out.println(arr[0]+","+other[0]);
    }

    public static void swap(int[] one,int[] two){
        int [] temp = one;
        one = two;
        two = temp;
    }

    public static void swap(int one,int two){
        int temp = one;
        one = two;
        two = temp;
    }

    public static void swap(int [] a,int i,int j){
        System.out.println(a[i]+","+a[j]);
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
