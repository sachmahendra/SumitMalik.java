public class L90AnyBaseProduct {

    public static int getProduct(int b, int n1, int n2){
        int rv=0;

        int p=1;
        while(n2>0){
            int d2= n2%10;
            n2=n2/10;
            // sprd= second product
            int sprd= getProductOneDigit(b, n1, d2);
            rv= getSum(b, rv, sprd*10);
            p=p*10;

        }

        return rv;
    }
    public static int getProductOneDigit(int b, int n1, int d2){
       int rv=0;
       int p=1;
       int c=0;
       while(n1>0){
        int d1=n1%10;
        n1=n1/10;
        int d= d1*d2 +c;
        c=d/b;
        d=d%b;

        rv= rv+d*p;
        p=p*10;
       }
        return rv;
    }

        public static int getSum(int b, int n1, int n2){
        int rv=0;
        int c=0;
        int p=1;
        while(n1>0 || n2>0 || c>0){
            int d1= n1%10;
            int d2 = n2%10;
            n1= n1/10;
            n2=n2/10;

            int d= d1+d2+c;
            c= d/b;
            d= d%b;

            rv= rv+ d*p;
            p=p*10;
        }
        return rv;
    }

    public static void main(String[] args) {
        int b= 8;
        int n1= 236;
        int n2=754;
        System.out.println(getProduct(b,n1,n2));
    }
}
