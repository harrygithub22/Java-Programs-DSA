
import java.util.*;
public class LoopPatterns {                                                          
    public static void main(String[] args) {
        //input the no. of rows and columns to fill with star

        Scanner sc = new Scanner(System.in);
        System.out.println("Rows:");
        int n= sc.nextInt();
        System.out.println("Columns :");
        int m= sc.nextInt();
        //outer loop
        for(int i=0; i<=n; i++){
            //inner loop
            for(int j=0; j<=m ;j++)
                System.out.print("*");
        System.out.println("");
     }
    }
}
