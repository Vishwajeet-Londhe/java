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

        //4. compare two strings
        boolean res1 = first.equals(second);
        System.out.println(res1);

        boolean res2 = second.equals(fifth);
        System.out.println(res2);

        //with key both work totally different

        String name1 = new String("program1");
        String name2 = new String("program1");

        boolean result1 = (name1 == name2);
        boolean result2 = name1.equals(name2);
        System.out.println(result1+ " " + result2);

        //ex
        String n1 = new String("program 2");
        String n2 = n1;

        boolean r1 = (n1 == n2);
        boolean r2 = n1.equals(n2);
        System.out.println(r1+ " "+ r2);

        //this is a "very" important project

        String imp = "this is a \"very\" imp project";
        System.out.println(imp);

        //string are immutable

        String example1 = "hello";

        example1 = example1.concat(" world");
        System.out.println(example1);

        //To access particular element

        String besti = "Hemali";
        char ele = besti.charAt(0);
        System.out.println(ele);

        System.out.println(besti.charAt(1));

        System.out.println(besti.charAt(besti.length()-1));

        //SubString
        System.out.println("----SubString--------");
        System.out.println(besti.substring(1,4));
        System.out.println(besti.substring(0,6));
        System.out.println(besti.substring(1));

        //some more operations

        System.out.println(besti.lastIndexOf('a'));
        System.out.println(besti.startsWith("Hemali"));
        System.out.println(besti.startsWith("hemali"));

        //ex
        String s1 = "hello";
        String s2 = s1;
        String s3 = "hello";
        String s4 = new String("hello");

        System.out.println((s1==s2)+ "," + s1.equals(s2));
        System.out.println((s2==s3)+ "," + s1.equals(s3));
        System.out.println((s1==s4)+ "," + s1.equals(s4));


    }
}
