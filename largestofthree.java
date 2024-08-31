import java.util.*;
public class largestofthree {
    public static void main(String[] args) {
        //find largest of three numbers
        // APP1
        int a=12,b=0,c=2;
        if (a>b && a>c){
            System.out.println("a is largest");
        }
        else if (b>=c){
            System.out.println("b is largest");

        }
        else{
            System.out.println("c is largest");
        }

        // APP2
        // int max=a;
        // if (b>max){
        //     max=b;
        // }
        // if (c>max){
        //     max=c;
        // }
        // System.out.println(max);

        // APP3
        int max=0;
        max=Math.max(c,Math.max(a,b));
        System.out.println(max);

        
    }
    
}
