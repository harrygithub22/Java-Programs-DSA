public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n=25;
        boolean [] primes= new boolean[n+1];
        Sieve(n,primes);


    }
    //false in array means number is prim
    static void Sieve(int n, boolean[] primes){
        for (int i = 2; i*i <= n; i++) {
            if(!primes[i]){
                for (int j = i*2; j <= n ; j+=i) {
                    primes[j]=true;
                    
                }

            }
            
        }
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                System.out.print(i+ "  ");
            }
        }
    }
}
