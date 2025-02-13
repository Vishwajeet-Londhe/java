package L8;

public class FunctionsDemo {
    public static void main(String[] args) {

        System.out.println("Let's get started");

        //calling a function
        greetingCustomers();
        System.out.println("see you again");
        addNumbers(50,5);
    }

    //Declaring a function
    public static void greetingCustomers(){
        System.out.println("Hello to You!");
        System.out.println("Hope You're having a good day");
    }

    public static void addNumbers(int val1, int val2){
        int sum = val1 + val2;
        System.out.println(sum);
    }
}
