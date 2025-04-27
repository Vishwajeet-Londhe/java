package Leetcode;

public class ValidParantheses20 {
    public static void main(String[] args) {
        String s= "()";
        String s1= "()[]{}";
        String s2=  "(]";
        String s3 = "([])";

        System.out.println(isValid(s));
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }
    public static boolean isValid(String s) {

        while(true){

            if(s.contains("()")){
                s=s.replace("()","");
            }
            else if(s.contains("{}")){
                s=s.replace("{}","");
            }
            else if(s.contains("[]")){
                s=s.replace("[]","");
            }
            else{
                return s.isEmpty();
            }

        }
    }
}
