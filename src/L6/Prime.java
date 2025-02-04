package L6;

public class Prime {
    public static void main(String[] args) {

        int n=7;
        int div=2;

        int flag = 0;
        while (div<=n-1){
            if(n%div == 0){
                flag=1;
                break;
            }
            div += 1;
        }

        if(flag==1){
            System.out.println("not prime");
        }else {
            System.out.println("prime");
        }
    }
}
