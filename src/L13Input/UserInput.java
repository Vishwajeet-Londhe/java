package L13Input;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Interger:");
        int num = input.nextInt();
        System.out.println("You Entered:" + num);

        System.out.println("Enter Text:");
        String mystring = input.next();
        System.out.println("You Entered:" + mystring);

        input.close();
    }
}
