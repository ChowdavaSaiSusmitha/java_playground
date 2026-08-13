package basics; 
//polymorphism
class A{
   void me(int x,int y){
   System.out.println("A class method" + (x+y)/100 +(1*x));
   }

   void something(String a){
      System.out.println("student name is :" + a);
   }
}

class B extends A{
    @Override
    void me(int x,int y){
    System.out.println("B class method" + (x-y)*100 +(1*x));
    }
    //Overload
    void something(String a,int b){
      System.out.println("student name is :" + a + "and rollno is" + b);
    }
}

class C extends B{
    @Override
    void me(int x,int y){
    System.out.println("C class method  " + ((x+y)-100 ) +" " + (1+x));
    return;
    }
    void something(String a,int b){
      System.out.println("student name is :" + a + " and rollno is" + b);
   }
}


class D extends B{
    //overload
    void me(int x,int y,int z){
    System.out.println("D class method  " + ((x+y*z)-100 ) +" " + (1+x));
    }
}

public class Inheritance {

  public static void main(String[] args) {
    A a=new A();
    a.something("susmitha");
    C c = new C();
    c.me(10,20);
    c.something("susmitha",10);
    D d = new D();
    d.me(10,20,30);
    }
}