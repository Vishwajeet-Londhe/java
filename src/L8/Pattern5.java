package L8;

public class Pattern5 {
    public static void main(String[] args) {

        int n = 14;

        //print the first row

        for (int frow = 1; frow<=2*n-1; frow++){
            System.out.print("*");
        }
        System.out.println();

        int trows = n-1;
        int stars = n-1;
        int spaces = 1;

        for (int row = 1; row<=trows; row++){
            //work

            //star
            for (int cst = 1; cst<=stars; cst++){
                System.out.print("*");
            }
            //spaces
            for (int csp = 1; csp<=spaces; csp++){
                System.out.print(" ");
            }
            //star
            for (int cst = 1; cst<=stars; cst++){
                System.out.print("*");
            }

            //prep
            System.out.println();
            stars--;
            spaces +=2;

        }
    }
}
