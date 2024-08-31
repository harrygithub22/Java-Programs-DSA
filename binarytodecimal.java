public class binarytodecimal {

  public static void bintoDec(int binNum) {
    int pow = 0;
    int decimal = 0;
    int temp = binNum;
    while (binNum > 0) {
      int lastDigit = binNum % 10;
      decimal = decimal + (lastDigit * (int) Math.pow(2, pow));
      pow++;
      binNum /= 10;
    }
    System.out.println("Decimal of " + temp + " = " + decimal);
  }

  public static void dectoBin(int n) {
    int pow = 0;
    int binNum = 0;
    int temp = n;
    while (n > 0) {
      int rem = n % 2;
      binNum = binNum + (rem * (int) Math.pow(10, pow));
      pow++;
      n /= 2;
    }
    System.out.println("Binary of " + temp + " = " + binNum);
  }

  public static void main(String[] args) {
    bintoDec(111);
    dectoBin(7);
  }
}
