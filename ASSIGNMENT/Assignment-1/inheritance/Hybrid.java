package inheritance;
//hybrid inheritance

interface I{
    void getI();//abstract method
}

class A{
    void getA(){
        System.out.println("A");
    }
}
//single inheritance
class B extends A{
    void getB(){
        System.out.println("B");
    }
}
//hierachial inheritance (multiple inheritance)
class C extends A implements I{
    void getC(){
        System.out.println("C");
    }
    @Override
    public void getI(){
        System.out.println("I");
    }
}


public class Hybrid {
    public static void main(String[] args) {
        //creting objects for class b and c
        
        B b=new B();
        b.getB();
        b.getA();

        C c=new C();
        c.getI();
        c.getC();

    }
}

