
public class callbyvalue {

    public static int mul(int a,int b) {
        int prod=a*b;
        return prod;
        
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int product=mul(a,b);
        System.out.print("a*b="+product);
        
    }
    
}
