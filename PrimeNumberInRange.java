 
/* 
public class PrimeNumberInRange {
   public static int PrimeNo(int low, int high){
        for(int i=low; i<=high;i++){
            int count =0;
            for(int j=2;j*j<=high;j++){
                if(i % j==0)
                count++;
                break;
            }
            if(count ==0)
            System.out.println(i);
        }
        return 0;
    }
    public static void main(String[] args) {
        int low=2;
        int high = 15;
        PrimeNo(2,15);
    }
}

*/
  
public class PrimeNumberInRange {
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    static void printPrimeNumbers(int low, int high) {
        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        int low = 2;
        int high = 15;
        printPrimeNumbers(low, high);
    }
}


