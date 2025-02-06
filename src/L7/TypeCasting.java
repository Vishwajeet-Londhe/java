package L7;

public class TypeCasting {
    public static void main(String[] args) {

        byte by = 10;
        short sh = 10;
        int in = 10;
        long lo = 10;

//        by = sh;
//        by= in;
//        by=lo;

        sh=by;

//        sh=in;
//        sh=lo;

        in=by;
        in=sh;

//        in=lo;

        lo=by;
        lo=sh;
        lo=in;
    }
}
