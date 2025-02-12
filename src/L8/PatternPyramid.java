package L8;

public class PatternPyramid {
    public static void main(String[] args) {

        int n = 4;
        int trows = n;

        //first row
        int spaces = n-1;
        int stars = 1;

        for (int row =1 ; row<=trows;row++){

            //work for current row

            //spaces
            for(int csp = 1; csp<=spaces;csp++){
                System.out.print(" ");
            }
            //stars
            for (int cst = 1; cst<=stars; cst++){
                System.out.print("*");
            }

            // prep for next row

            System.out.println();
            spaces --;
            stars +=2;
        }
    }
}
