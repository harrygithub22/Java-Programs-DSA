public class countnums {
    // Program to count the number of occurence of a digit in a number
    public static void main(String[] args) {
        int n=53336543;
        int count=0;
        while (n>0) {
            int rem=n%10;
            if (rem==3){
                count++;
            }
            n=n/10;         
        }
        System.out.println(count);
    }
    
}
