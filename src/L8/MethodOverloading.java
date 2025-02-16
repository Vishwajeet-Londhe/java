package L8;

public class MethodOverloading  {

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
