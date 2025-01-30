package L5;

import java.util.Scanner;

public class Big4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();

        if(a>=b && a>=c && a>=d){
            System.out.println(a);
        } else if (b>=a && b>=c && b>=d) {
            System.out.println(b);
        } else if(c>=a && c>=b && c>=d){
            System.out.println(c);
        }else {
            System.out.println(d);
        }
    }

}
