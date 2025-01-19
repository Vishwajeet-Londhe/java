package Input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        //create an object of scanner Class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer value : ");

        //take input from user
        int number = input.nextInt();

        System.out.println("You entered "  +  number);
    }
}
