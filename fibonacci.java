import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // int n = sc.nextInt();
        // int a=0;
        // int b=1;
        // int count=2;

        // while(count<=n){
        //     int temp=b;
        //     b+=a;
        //     a=temp;
        //     count++;
        // }
        // System.out.println(b);
        System.out.println(fibo(7));
    }

    static int fibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fibo(n-2)+fibo(n-1);
    }
    
}
