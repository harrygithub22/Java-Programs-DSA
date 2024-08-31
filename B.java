import mypack.pack;

public class B {

  public void show() {
    System.out.println("this is class B");
  }

  public static void main(String args[]) {
    B obj = new B();
    pack obj1 =new pack();
    obj.show();
    obj1.display();
  }
}
