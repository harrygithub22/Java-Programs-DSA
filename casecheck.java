import java.util.Scanner;
public class casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println(sc.next().trim());
        // String word=sc.next();
        char ch= sc.next().trim().charAt(0);
        if (ch>='a' && ch<='z'){
                System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    
    }
    
}
