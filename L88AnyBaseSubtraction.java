public class L88AnyBaseSubtraction {
    public static int getSub( int b,int n1 , int n2 ){
       int rv=0;
       int c= 0;
int p=1;

       while(n2>0){
        int d1=n1%10;
        n1=n1/10;
        int d2= n2%10;
        n2= n2/10;
        //int c=0;
        int d=0;
         d2= d2+c;
        if(d2>=d1){
            d= d2-d1;
        }else{
            c=-1;
            d=d2+8-d1;
        }
        rv=rv+d*p;
        p=p*10;
       }


        return rv;
    }
    public static void main(String[] args) {
        int b= 8;
        int n1=256;
        int n2=1212;
        
        System.out.println(getSub( b,n1 ,  n2 ));
    }
}
