import java.util.Scanner;
public class enhancedSwitch { // Syntax For Enhanced Switch 
    //For multiline in cases just add {}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String fruit= sc.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("A sweet red fruit");            
            case "Grapes" -> System.out.println("A small green fruit");            
            case "Dragon" -> System.out.println("Expensive fruit");      
            default -> System.out.println("Please enter a valid fruit");      

        }

        int day = sc.nextInt();
        //Importance of break statememt 
        //Display day name between 1-7 as weekday or weekend
        
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("WEEKDAY");
                    break;
            case 6:
            case 7: System.out.println("WEEKEND");
                    break;

        }

        //Using Enhanced Switch

        switch(day){
            case 1,2,3,4,5 ->System.out.println("WEEKDAY");
            case 6,7 -> System.out.println("WEEKEND");
        }
    }
    
}
