package L11;

public class WaveDisplay {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        waveDiaplay(a);
    }

    private static void waveDiaplay(int[][] arr) {
        for (int c = 0; c<arr[0].length;c++){

            if (c%2==0){
                //move down

                for (int r=0;r< arr.length;r++ ){
                    System.out.print(arr[r][c] + " ");
                }
            }else {
                //move up

                for (int r = arr.length-1;r>=0;r--){
                    System.out.print(arr[r][c]+ " ");
                }
            }
        }
    }
}
