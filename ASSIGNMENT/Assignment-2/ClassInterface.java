package inheritance;

import java.util.Scanner;

class C1 {
    void c1method(){
        System.out.println("this is from class c1");
    }
}
//single inheritance(class to class) -1:
class C2 extends C1{
    void c2method(){
        System.out.println("this is from class c2 which is inherited from c1");
    }
}

//C1 extends C2, C3 this is not possible (multiple inheritance) -2
//interface(default abstract methods)
interface I1 {
    void I1method();
}

interface I2 {
    void I2method();
}

//. C1 implements I1 -3
class CI1 implements I1{
    @Override
    public void I1method(){
        System.out.println("this is from class CI1 which is inherited from I1");
    }
}

//  C1 implements I1, I2  -4
class CI2 implements I1,I2{
    //must be overriden for all interface methods(abstract methods only exists in interface)

    @Override
    public void I1method(){
        System.out.println("this is from class CI2 which is inherited from I1");
    }
    @Override
    public void I2method(){
        System.out.println("this is from class CI2 which is inherited from I2");
    }
}

// C1 implements C2 extends I1 -5
//MULTIPLE INHERITANCE
class CI3 extends C1 implements I1{
    @Override
    public void I1method(){
        System.out.println("this is from class CI3 which is inherited from I1");
    }

    public void CI3method(){
        System.out.println("this is from class CI3 which is inherited from I1 and C1");
    }
}

// I1 extends I2 -6
interface In1{
    void In1method();
}

interface In2 extends In1{
    void In2method();
}

class CI4 implements In2{
    @Override
    public void In1method(){
        System.out.println("this is from class CI4 which is inherited from In2 (in1 method)");
    }

    @Override
    public void In2method(){
        System.out.println("this is from class CI4 which is inherited from In2");
    }
} 


// I1 implements C1 -7
//An interface cannot implement or extend a class. 
//static interface   I3 implements C1{
    //interface cannot inherit class because class is a complete where interface is incomplete 
// }


// I1 extends I2, I3   -8
//multiple inheritance
interface I3 extends I2,I1{
    void I3method();
}
//interfaces must be inherited to class to override methods which are incomplete
class CI321 implements I3{
    @Override
    public void I1method(){
        System.out.println("this is from class CI321 which is inherited from I1");
    }

    @Override
    public void I2method(){
        System.out.println("this is from class CI321 which is inherited from I2");
    }

    @Override
    public void I3method(){
        System.out.println("this is from class CI321 which is inherited from I3");
    }
}

public class ClassInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. C1 extends C2\n2. C1 extends C2, C3\n3. C1 implements I1\n4. C1 implements I1, I2\n5. C1 implements C2 extends I1\n6. I1 extends I2\n7. I1 implements C1\n8. I1 extends I2, I3");
        System.out.println("Enter a number from 1 to 8:");
        int choice = scanner.nextInt();
        //creating objects for required classes and accessing them (related to the given inheritances) using variable choice

        switch (choice) {
            case 1:
                System.out.println("1. C1 extends C2");
                C2 c2 = new C2();
                c2.c1method();
                c2.c2method();
                break;
            case 2:
                System.out.println("2. C1 extends C2, C3");
                System.out.println("C1 cannot extend both C2 and C3 because Java does not support multiple class inheritance.");
                break;
            case 3:
                System.out.println("3. C1 implements I1");
                CI1 ci1 = new CI1();
                ci1.I1method();
                break;
            case 4:
                System.out.println("4. C1 implements I1, I2");
                CI2 ci2 = new CI2();
                ci2.I1method();
                ci2.I2method();
                break;
            case 5:
                System.out.println("5. C1 implements C2 extends I1");
                CI3 ci3 = new CI3();
                ci3.c1method();
                ci3.I1method();
                ci3.CI3method();
                break;
            case 6:
                System.out.println("6. I1 extends I2");
                CI4 ci4 = new CI4();
                ci4.In1method();
                ci4.In2method();
                break;
            case 7:
                System.out.println("7. I1 implements C1");
                System.out.println("An interface cannot extend or implement a class such as C1.");
                break;
            case 8:
                System.out.println("8. I1 extends I2, I3");
                CI321 ci321 = new CI321();
                ci321.I1method();
                ci321.I2method();
                ci321.I3method();
                break;
            default:
                System.out.println("Invalid choice. Try again(1-8).");
        }

        scanner.close();
    }

}
