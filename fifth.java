// Print sum of n natural numbers
import java.util.*;
public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no. :");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum +=i;
        }
        System.out.print("Sum of first n no.s :");
        System.out.println(sum);
    }
}
