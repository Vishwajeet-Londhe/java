package L8;

public class Square {
    public static void main(String[] args) {

        for (int i=1; i<=10; i++){
            int result = getSquare(i);
            System.out.println("Square of" + i + "is:" + result);
        }
    }

    public static int getSquare(int X){
        return X * X;
    }
}
