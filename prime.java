//Prime Number
import java.util.*;
public class prime {
    public static void main(String[] args) {
        //check whether the number is prime or not
        System.out.print("Enter any number to check prime or not :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 0;
        if (num==0 || num==1)
            System.out.println("Num is non prime");
        else if (num<0)
            System.out.println("Enter number greater than 0");
        else
        {
            for (int i=2; i<=num/2; i++){
                if (num%i==0)
                    temp++;
            }
            if (temp==0)
                System.out.println("num is prime");
            else
                System.out.println("num is not prime");
        }
        // if (((n*n)-1)%24==0)
        //     System.out.println("prime");
        // else
        //     System.out.println("non prime");
    }
    
}
