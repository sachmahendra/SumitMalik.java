import java.util.*;

public class L82AnyBaseToDecimal {
    public static int getValueInBase(int n, int b){
        int rv=0;
        int p=1;
        while(n > 0){
            int dig= n%10;
            n=n/10;

             rv=rv+(dig*p);
             p=p*b;
        }
        return rv;

    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int b= scn.nextInt();
        System.out.println(getValueInBase(n, b));
    }
}
