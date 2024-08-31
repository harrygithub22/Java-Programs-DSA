import java.util.*;

public class incometaxcalc {
    public static void main(String[] args) {
        //calculate income tax with the given conditions
        Scanner sc= new Scanner(System.in);
        int income=sc.nextInt();
        int tax;

        if (income<500000){
            tax=0;
        }
        else if (income>500000 && income<1000000){
            tax=(int)(income*0.2); //Typecasting double to integer
        }
        else{
            tax=(int) (income*0.3);
        }
        System.out.println("Your Tax is :"+ tax);
    }
    
}
