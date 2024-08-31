import java.util.*;
public class calculator {
    public static void main(String[] args) {
        //calculator program using switch case
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a        :");
        int a=sc.nextInt();
        System.out.print("Enter operator :");
        char op=sc.next().charAt(0);
        System.out.print("Enter b        :");
        int b=sc.nextInt();

        switch(op){
            case '+' :System.out.println(a+b);
                        break;
            case '-' :System.out.println(a-b);
                        break;
            case '*' :System.out.println(a*b);
                        break;
            case '/':System.out.println(a/b);
                        break;
            case '%':System.out.println(a%b);
                        break;
            default:System.out.println("Invalid operator");
                        break;

                    
        }
        
    }
}
