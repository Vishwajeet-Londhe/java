package L8;

public class Pattern {
    public static void main(String[] args) {

        int n = 4;
        int trows = n;

        for (int row = 1 ; row<=trows; row++){

            //work for current row
            for(int cst = 1; cst<=row;cst++){
                System.out.print("*");
            }
            //work for next row

            System.out.println();
        }

    }
}
