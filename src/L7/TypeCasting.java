package L7;

public class TypeCasting {
    public static void main(String[] args) {

        //case1

        byte by = 10;
        short sh = 10;
        int in = 10;
        long lo = 10;

//        by = sh;
//        by = in;
//        by = lo;

        sh = by;
//        sh = in;
//        sh = lo;

        in = by;
        in = sh;
//        in = lo;

        lo = by;
        lo = sh;
        lo = in;

        //case 2

        by = 100;

        for (byte b = 0; b<=126; b++){
            System.out.println("typecasting");
        }

        // case 3

        float f = 5.6f;
        double d = 6.7;

        //f=d;  invalid
        d=f;


        //case 4

        //in = f;       invalid, float is big so

        in = (int)f;

        byte b = (byte) 383;
        System.out.println(b);

        //Case5

        char ch = 'a';

        in = ch ;
        System.out.println(in);
        System.out.println(ch);
        System.out.println((int)ch);


        //Case6
        ch = 70;

        System.out.println(ch);
        System.out.println((int)200) ;

        ch = (char)(ch+1);
        System.out.println(ch);

        //Case7

        ch = 'a' + '1';
        ch = (char)('a' + ch);
        System.out.println(ch);

        //case8

        ch = 'a' + 'a';
        ch = (char)('a' + ch);
        System.out.println(ch);

        //Case9

        System.out.println(10 + 20 + "Hello" + 10 + 20);
        System.out.println(2+' '+5);
        System.out.println(2+" "+5);
        System.out.println("Hello" + '\t' + "World");
        System.out.println(2 + '\t' + 3);
    }
}
