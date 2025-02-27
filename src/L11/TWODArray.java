package L11;

public class TWODArray {
    public static void main(String[] args) {

        int [] [] a = new int[3][4];

        int [] [] a1 = {
                {1,2},
                {3,4},
                {5,6}
        };
        System.out.println(a);

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        System.out.println(a.length);//rows length

        System.out.println(a[0].length);//col length

        // access value
        System.out.println(a[1][2]);

        //set and update value
        a[2][3]= 100;
        System.out.println(a[2][3]);

        a[2][3] = 150;
        System.out.println(a[2][3]); //updated the value

        //print all values from array

        int [][] a2 = {
                {1,2,7},
                {3,4,8},
                {5,6,9}
        };

        System.out.println("-----print all ele from arr-----");
        for (int i =0; i<a2.length;i++){
            for (int j =0; j<a2[0].length;j++){
                System.out.println(a2[i][j]);
            }
        }
        System.out.println("-----print all ele from arr-----");
        for (int i =0; i<a2.length;i++){
            for (int j =0; j<a2[0].length;j++){
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }

        //enhanced for loop

        for (int [] val:a1){
            for (int temp :val){
                System.out.print(temp+" ");
            }
            System.out.println();
        }

        System.out.println("-----Jagged Array--------");

        int [][] arr = new int [3][];

        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[5];

        //calculate no of rows
        System.out.println(arr.length);

        //calculate no of cols
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);
    }
}
