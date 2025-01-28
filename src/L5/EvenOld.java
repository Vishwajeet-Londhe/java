package L5;

import java.util.Scanner;

public class EvenOld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int inp = scn.nextInt();

        if(inp%2 == 0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
    }
}
