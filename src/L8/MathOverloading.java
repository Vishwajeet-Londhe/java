package L8;

public class MathOverloading {

    //method to add two numbers
    public static int add(int a,int b){
        return a+b;
    }

    //overloaded method to add two
    public static int add(int a, int b, int c){
        return a + b +c;
    }

    //overloaded method to add two
    public static double add(double a,double b){
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(add(34,23));
        System.out.println(add(45,54,75));
        System.out.println(add(35.6,56.6));
    }

}
