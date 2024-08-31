class A extends Thread {
    public void run(){
        for (int i=0;i<5;i++) {
            if(i%2==0)
                System.out.println("Even Value: "+i);
        }
    }    
}

class B extends Thread{
    public void run(){
        for (int i=0;i<5;i++) {
            if(i%2!=0)
                System.out.println("Odd Value: "+i);
            
        }
    }
}

class C {
    public static void main(String[] args) {
        new A().start();
        new B().start();
    }
}