public class NewtonSQRT {

    // Newton Raphson Method to calculate square root!  
  public static void main(String[] args) {
    System.out.println(sqrt(5));
  }

  static double sqrt(double n) {
    double x = n;
    double root;
    while (true) {
      root = 0.5 * (x + (n / x));

      if (Math.abs(root - x) < 0.5 /* this the precision */) {
        break;
      }

      x = root;
    }
    return root;
  }
}
