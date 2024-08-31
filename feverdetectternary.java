public class feverdetectternary {
    public static void main(String[] args) {
        //detect fever using ternaary operator  
        double temp=103.5;
        String type= (temp>100) ? "You have a fever" : "You don't have a fever";
        System.out.println(type);
        
    }
    
}
