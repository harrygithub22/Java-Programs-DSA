import java.util.*;
public class positivenegternary {
    public static void main(String[] args) {
        //find if a number is postive or negative using ternary operator
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        String type= (n>=0)?"Positive" :"Negative";
        System.out.println(type);
    }
}
