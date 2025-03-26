package L14HeapStack;

public class StackMemDemo {
//    public static void main(String[] args) {
//        System.out.println("Hello THere !");
//        greetings();
//        askQuery();
//    }
//    public static void greetings(){
//        System.out.println("Hope! You are well");
//    }
//    public static void askQuery(){
//        System.out.println("How may I help you");
//    }

    //ex2

    public static void main(String[] args) {
        System.out.println("Hello there!");

        int defaultval = 2;
        defaultval=multiplyFour(defaultval);
        defaultval=multiplyTwo(defaultval);

        System.out.println(defaultval);
    }
    private static int multiplyFour(int val){
        val *= 4;
        return val;
    }
    private static int multiplyTwo(int val){
        val *= 2;
        return val;
    }
}
