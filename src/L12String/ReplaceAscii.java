package L12String;

public class ReplaceAscii {
    public static void main(String[] args) {
        System.out.println(ReplaceAsciiFunction("cdEFG"));
        System.out.println(ReplaceAsciiFunction("dd"));
    }

    public static String ReplaceAsciiFunction(String str){
        StringBuilder sb = new StringBuilder(str);

        for (int i=0; i< sb.length();i++){
            char ch = sb.charAt(i);

            if(i%2 == 0){
                ch =(char) (ch +1);
                sb.setCharAt(i,ch);
            }else {
                ch=(char)(ch-1);
                sb.setCharAt(i,ch);
            }
        }
        return sb.toString();
    }
}
