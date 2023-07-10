import java.util.*;
public class L84AnyBaseToAnyBase {
    public static int getValue(int n, int b1,int b2){
        int dec= anyBaseTODecimal(n, b1);
        int any = decimalToAnyBase(dec,b2);
        return any;

    }


    public static int anyBaseTODecimal(int n,int b){
        int rv=0;
        int p=1;

        while(n>0){
            int dig= n%10;
            n=n/10;
            rv=rv+dig*p;
            p=p*b;
        }
        return rv;
    }

    public static int decimalToAnyBase(int n, int b){
         int rv=0;
        int p=1;
        while(n > 0){
            int dig= n%b;
            n=n/b;

             rv=rv+(dig*p);
             p=p*10;
        }
        return rv;

    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int b1= scn.nextInt();
         int b2= scn.nextInt();
        System.out.println(getValue(n, b1,b2));

    }
}

// check for input 172 , base 8 to base 2    ans is 1111010
