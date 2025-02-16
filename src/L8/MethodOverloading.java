package L8;

public class MethodOverloading  {

    public static void main(String[] args) {
        System.out.println(formatNumber(499));
        System.out.println(formatNumber(89.9933));
        System.out.println(formatNumber("87"));
    }

    public static String formatNumber(int value){
        return String.format("%d",value);
    }

    public static String formatNumber(double value){
        return String.format("%.3f", value);
    }

    public static String formatNumber(String value){
        return String.format("%.2f", Double.parseDouble(value));
    }

}
