public class fibSeries {
    public static void main(String[] args) {
        fibS(1);
        
    }
    static void fibS(int n){
        //0 1 1 2 3 5 8 13
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int count=2;
        while(count<=n-1){
            int temp=b;
            b=b+a;
            System.out.println(b);
            a=temp;
            count++;
            
        }


    }
}
