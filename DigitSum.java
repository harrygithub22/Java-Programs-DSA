// Write a Java method to compute the sum of the digits in an integer.
// (Hint: Approach this question in the following way:
// a.Take a variable sum = 0
// b.Find the last digit of the number
// c.Add it to the sum
// d.Repeat a & b until the number becomes 0)
public class DigitSum {
  public static void DigitSum(int n) {
    int sum = 0;
    int temp=n;
    while (n > 0) {
      int lastDigit = n % 10;
      sum += lastDigit;
      n /= 10;
    }
    System.out.println("Sum of digits of " + temp + " is " + sum);
  }
  public static void main(String[] args) {
    DigitSum(123);
  }
}
