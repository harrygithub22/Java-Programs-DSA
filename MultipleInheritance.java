// Multiple Inheritance using java

interface A {
  int a = 20;

  public void display();
}

interface B {
  int a = 30;

  public void display();
}

class C implements A, B {

  public void display() {
    System.out.println("C");
    System.out.println("value of a in interface A" + A.a);
    System.out.println("value of a in interface B" + B.a);
  }
}

public class MultipleInheritance {

  public static void main(String args[]) {
    C obj = new C();
    obj.display();
  }
}
