import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        //find if a number is even or odd
        // Scanner sc = new Scanner(System.in);
        // int n =sc.nextInt();

        // if (n%2==0){
        //     System.out.println("Even "+n);
        // }
        // else{
        //     System.out.println("Odd "+n);
        // }

        int n=69;
        System.out.println(isOdd(n));
        
        
    }

    //Using Bit Manipulation
    private static boolean isOdd(int n){
        return (n & 1)==1;
    }

}
