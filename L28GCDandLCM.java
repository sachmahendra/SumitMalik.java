public class L28GCDandLCM {
    public static void main(String[] args) {
        int n1=36;
        int n2= 24;
        int on1= n1;  // on1= original n1
        int on2= n2;
        while(n1 % n2 !=0){
            int rem= n1%n2;
            n2=rem;
            n1=n2;

        }
        int gcd= n2;
        int lcm = (on1*on2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
