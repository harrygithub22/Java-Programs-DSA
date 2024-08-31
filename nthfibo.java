public class nthfibo {
    public static void main(String[] args) {
        //System.out.println(fibo(10));
        // for (int i = 0; i < 21; i++) {
        //     System.out.println(fiboformula(i));
            
        // }
        System.out.println(fiboformula(100));
    }
    
    static int  fiboformula(int n){
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)- Math.pow((1-Math.sqrt(5))/2, n))/Math.sqrt(5));
        }

    static int fibo(int n){
        //base condition
        if (n>2){
            return n;
        }
        return fibo(n-1) +fibo(n-2);
    }

}
