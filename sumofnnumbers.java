import java.util.*;
public class sumofnnumbers {
    public static void main(String[] args) {
        //Sum of numbers till n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
        
    }
    
}
