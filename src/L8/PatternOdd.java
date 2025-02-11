package L8;

public class PatternOdd {
    public static void main(String[] args) {

        //number must be odd
        int n = 11;
        int trows = n;

        int stars = 1;

        for(int row = 1; row<=trows; row++){

            //work for current
            for(int cst =1 ; cst<=stars; cst++){
                System.out.print(cst);
            }

            //pre for next row
            System.out.println();
            if (row <= trows/2){
                stars ++;
            }else {
                stars --;
            }
        }

    }
}
