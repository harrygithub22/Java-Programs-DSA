public class Armstrong {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            if (isArmstrong(i)){
                System.out.println(i);
            }
            
        }
        
    }
    static boolean isArmstrong(int n){
        int temp=n;
        int result=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            result+= rem*rem*rem;
        }

        return temp==result;


    }
    
}
