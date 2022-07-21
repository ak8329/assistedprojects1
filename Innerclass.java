class OuterClass {
  int x = 10;

  class InnerClass {
  int y=9;
  public int add()
  {
   int s=x+y;
   return s;
  }
  }
}

public class Innerclass {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.add());
  }
}
