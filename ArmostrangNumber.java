public class ArmostrangNumber {
     public static void main(String[] args){
        int n=143;
        int digit=0;
        int temp=n;
        int sum=0;
        while(temp>0){
            int r=temp%10;
            digit++;
            temp=temp/10;
        }
         temp=n;
        while(temp>0){
            int r1=temp%10;
            sum +=Math.pow(r1, digit);
            temp=temp/10;
        }
        if(n==sum){
            System.out.println("Armostrang number");
        }
        else{
            System.out.println("not armastrong");
        }

     }
}
