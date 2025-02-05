package L7;

public class Continue {
    public static void main(String[] args) {

//        for(int i = 1; i<=10; i++){
//            if(i>4 && i<9){
//                continue;
//            }
//            System.out.println(i);
//        }

        int i =1 , j=1;

        while (i<=3){
            System.out.println("outer loop" + i );

            while (j<=3){
                if(j==2){
                    j++;
                    continue;
                }
                System.out.println("Innner loop" + j );
                j++;
            }
            i++;
        }
    }
}
