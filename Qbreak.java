// Keep entering numbers till user enters a multiple of 10
import java.util.*;
public class Qbreak {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.print("Enter your num :");
            int n =sc.nextInt();
            if (n%10==0){
                break;
            }
            System.out.println(n);
            
        }
    }   

}
    