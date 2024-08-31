// Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.
// (Hint : use do-while loop but think & understand why)



import java.util.*;

public class LoopQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter a number (0 or 1) : ");
            n= sc.nextInt();
            if(n==1){
                System.out.print("Enter the marks of the student :");
                int x=sc.nextInt();
                if (x>100){
                    System.out.println("Enter marks between 0 to 100 .");
                }else if(x >= 90){
                    System.out.println("This is Good");
                }else if(x>=60){
                    System.out.println("This is also Good");
                }else if(x>=0){
                    System.out.println("This is Good as well");
                } else{
                    System.out.println("Enter a valid number .");
                }
            }
            else if (n==0){
                System.out.println("Program Ended\nThank You");
            }
            else{
                System.out.println("Enter either 1 or 0 .");
            }
        }while(n!=0);
        }
    }



