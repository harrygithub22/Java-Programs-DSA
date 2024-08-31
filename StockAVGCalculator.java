import java.util.*;

public class StockAVGCalculator {

  public static void main(String[] args) {
    int initialShares = 160;
    double initialPrice = 125;
    double currPrice = 118;
    double desiredAvgPrice = 124;
    double initialInvestment = initialShares * initialPrice;

    double additionalInvestment =
      currPrice *
      (
        (desiredAvgPrice * initialShares - initialInvestment) /
        (currPrice - desiredAvgPrice)
      );
    System.out.println("additional investment reqd : " + additionalInvestment);
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the initial no of shares       :");
    // int initialShares = sc.nextInt();
    // System.out.println("Enter the initial price of shares    :");
    // double initialPrice = sc.nextDouble();
    // System.out.println("Enter the current price of share     :");
    // double currPrice = sc.nextDouble();
    // System.out.println("Enter the desired avg price of share : ");
    // double desiredAvgPrice = sc.nextDouble();
    // double initialInvestment = initialShares * initialPrice;

    // double additionalInvestment =
    //   currPrice *
    //   (
    //     (desiredAvgPrice * initialShares - initialInvestment) /
    //     (currPrice - desiredAvgPrice)
    //   );
    // System.out.println(
    //   "additional investment reqd             : " + additionalInvestment
    // );
  }
}
