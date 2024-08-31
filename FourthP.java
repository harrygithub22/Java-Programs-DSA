// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

import java.util.*;

public class FourthP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no.  :");
        int a = sc.nextInt();
        System.out.print("Enter the second no. :");
        int b = sc.nextInt();
        System.out.print("Enter any operation  :");
        char op = sc.next().charAt(0);
        switch (op) {
                case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid op");
        }

    }

}
