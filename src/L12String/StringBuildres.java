package L12String;

public class StringBuildres {
    public static void main(String[] args) {

        String str = "Hello";

        StringBuilder sb = new StringBuilder("abc");
        StringBuilder sb1 = new StringBuilder(str);

        //length of string
        System.out.println(sb);
        System.out.println(sb.length());

        System.out.println(sb1);
        System.out.println(sb1.length());

        //append

        sb1.insert(0,"vaibhavi ");
        System.out.println(sb1);

        sb1.insert(sb1.length()," who are u");
        System.out.println(sb1);

        //setCharAt()
        //before that insert in sb
        sb.insert(0,'c');
        System.out.println(sb);

        sb.setCharAt(2,'M');
        System.out.println(sb);

        //way to convert stringbuilder to sting
        String str1 = sb.toString();
    }
}
