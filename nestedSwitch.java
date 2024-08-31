import java.util.Scanner;   
public class nestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empid = sc.nextInt();
        String department = sc.next();

        switch(empid){
            case 1:
                System.out.println("Lord Booby");
                break;
            case 2:
                System.out.println("Ranvijay");
                break;
            case 3:
                System.out.println("Varun");
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department Allotted");
                        break;
                }
            default:
                System.out.println("Enter correct EmpId");
        }


        //Using Enhanced Switch case
        switch(empid){
            case 1 -> System.out.println("Lord Booby");
            case 2 -> System.out.println("Ranvijay");
            case 3 -> {
                System.out.println("Varun");
                switch(department){
                    case "IT" ->System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department Allotted");
                }
        }
        default -> System.out.println("Enter correct emp id");
    }
    
}
}
