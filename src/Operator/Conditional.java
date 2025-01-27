package Operator;

public class Conditional {
    public static void main(String[] args) {
//        boolean primeSubs = false;
//
//        if(primeSubs == true){
//            System.out.println("welcome to prime Amazon");
//        }else {
//            System.out.println("take prime");
//        }

//        int num=10;
////
////        if (num<0){
////            System.out.println("it is positive number");
////        }
////
////        System.out.println("it is negative number");

        String movie = "line of duty";

        boolean primeSubs = false;
        boolean acorn = false;
        boolean amc = false;

        if(primeSubs){
            if(acorn || amc) {
                System.out.println("yes , you can watch");
            }else {
                System.out.println("request to buy");
            }
        }else{
            System.out.println("cannot watch the movie . you don not buy");
        }

    }
}
