import java.util.Arrays;

public class VarArgs {//Variable Length Arguments always at the end

    public static void main(String[] args) {
        fun(2,3,4,5,6);
        multiple(2,4,"hardik","karan","bb");

        
    }
    static void multiple(int a, int b, String ...v){

    }
    static void fun(int ...x){//x is declared as an array of integers
        System.out.println(Arrays.toString(x));
    }
    
}
