package L8;

public class PatternButterfly {
    public static void main(String[] args) {

        int n = 7;
        int trows = n;

        int stars = 1;
        int spaces = n-2;

        for (int row=1;row<=trows;row++){

            //work
            //star
            for (int cst=1;cst<=stars;cst++){
                System.out.print("*");
            }
            //spaces
            for (int csp = 1; csp<=spaces;csp++){
                System.out.print(" ");
            }
            //star
            for (int cst=1;cst<=stars;cst++){
                System.out.print("*");
            }

            //preparation for next row
            System.out.println();
            if(row<=trows/2){
                stars++;
                spaces-=2;
            }else {
                stars --;
                spaces +=2;
            }
        }
    }
}
