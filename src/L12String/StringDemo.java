package L12String;

public class StringDemo {
    public static void main(String[] args) {
        //Char demo
        char [] name = {'v','i','s','h','w','a','j','e','e','t'};
        System.out.println(name);
        // arr demo
        int[] students = {12,25,15,15,56};
        System.out.println(students.length);

        // string litral
        System.out.println("-------String-------");
        String first = "python";
        String second = "java";
        String third = "CPP";
        String fourth = "35";
        String fifth = "java";

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);

        //String using new keyword
        // syntax: String StringName = new String("String_Value")
        System.out.println("----using key--------");
        String courseName = new String("AlgoCamp");
        System.out.println(courseName);

        System.out.println("-----StringOperation-------");
        //String Operations

        //1. Create String
        String greet = "Hello World";
        System.out.println("String:" + greet);

        //2. length of String
        System.out.println(greet.length());

        //3. join two string
        String joinedString = first.concat(second);
        System.out.println(joinedString);
    }
}
