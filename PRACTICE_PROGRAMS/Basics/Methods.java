package basics;

public class Methods {
  //with parameters without return
  void addition(int a,int b){
    System.out.println("sum of " + a + " and " + b + "is :" + (a+b));
  }

  //with parameters with return
  int substraction(int a,int b){
    return a-b;
  }

  //without parameters without return
  void product(){
    int a=23,b=67;
    System.out.println("product of " + a + " and " + b + "is :" + (a*b));
  }

  //without parameters with return
  int division(int a,int b){
   return a/b;
  }

  public static void main(String[] args) {
    Methods m=new Methods();
    m.addition(34, 680);
    int s=m.substraction(3, 4);
    System.out.println("substraction of two numbers is :" + s);
    m.product();
    int d=m.division(34, 4);
    System.out.println("division of two numbers :" + d);
  }
}
