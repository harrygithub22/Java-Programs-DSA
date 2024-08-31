public class factorialn {

  public static int fact(int n) {
    int f=1;
    for (int i = 1; i <= n; i++) {
      f = f * i;
    }
    return f;
  }
  public static int binomial(int n, int r) {
    //nCr=n!/r!*(n-r)!
    int n_fact=fact(n);
    int r_fact=fact(r);
    int nmr_fact=fact(n-r);
    
    int binCoeff= n_fact/(r_fact*nmr_fact); 

    return binCoeff;

    
  }

  public static void main(String[] args) {
    int n = 5;
    System.out.println(fact(n));
    System.out.println(binomial(5,2));
    
  }
}
