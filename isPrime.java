public class isPrime {

  public static boolean isPrime(int n) {
    boolean isPrime = true;
    //obvious cases
    if (n==0 || n==1 || n<0){
        isPrime=false;  
    }
    for (int i = 2; i < n - 1; i++) {
      if (n % i == 0) {//completely dividing
        // isPrime = false;
        return false;
      }
    }
    return isPrime;
  }
  //Optimised
  public static boolean isPrimeO(int n) {
    if (n==2){
      return true;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if(n%i==0){
        return false;
      }      
    }
    return true;
  }

  public static void PrimeRange(int n) {
    for (int i = 2; i <= n; i++) {
      if (isPrimeO(i)){//true
        System.out.print(i+" ");
      }     
    }
    System.out.println();
    
  }
  public static void main(String[] args) {
    int num=1 ;
    System.out.println(isPrime(-1));
    PrimeRange(100);
  }
} 

