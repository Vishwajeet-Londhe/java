package L8;

public class FunctionsDemo {

    //M-1
//    public static void main(String[] args) {
//
//        System.out.println("Let's get started");
//
//        //calling a function
//        greetingCustomers();
//        System.out.println("see you again");
//        addNumbers(50,17);
//        addNumbers(43,17);
//        addNumbers(50,1);
//    }
//
//    //Declaring a function
//    public static void greetingCustomers(){
//        System.out.println("Hello to You!");
//        System.out.println("Hope You're having a good day");
//    }
//
//    public static void addNumbers(int val1, int val2){
//        int sum = val1 + val2;
//        System.out.println(sum);
//    }

    //M-2

    public static void main(String[] args) {

        System.out.println("Let's get started");

        //calling a function
        greetingCustomers();
        System.out.println("see you again");

        int res = addNumbers(25,10,10,10);
        System.out.println(res);
    }

    //Declaring a function
    public static void greetingCustomers(){
        System.out.println("Hello to You!");
        System.out.println("Hope You're having a good day");
    }

    public static int addNumbers(int val1, int val2, int val3, int val4){
        int sum = val1 + val2 + val3 + val4;
        return sum;
    }
}
