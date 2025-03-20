package L12String;

public class StringBuildres {
    public static void main(String[] args) {

        String str = "Hello";

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(str);

        //length of string
        System.out.println(sb);
        System.out.println(sb.length());

        System.out.println(sb1);
        System.out.println(sb1.length());
    }
}
