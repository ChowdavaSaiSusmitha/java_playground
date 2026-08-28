package beyond;

//importing the class modifier from inheritance package
import inheritance.Modifiers;

class Data extends Modifiers{
    protected String information="this ia a protected information";
    private String wifi="qwerty@2026#";

    //access private variable using getter 
    public String getWifi(){
        return this.wifi;
    }

    public void carengine() {
        super.carengine();
        //static variable
        System.out.println(Modifiers.rollno); 
    }
}

public class Access {
    public static void main(String[] args) {

        //accessing through object using public keyword
        Modifiers m = new Modifiers();
        System.out.println(m.name +"\n");
        
        //using protected keyword
        Data d=new Data();
        d.carengine();
        System.out.println(d.information +"\n");

        //using private keyword
        System.out.println("my college wifi password:" + d.getWifi() +"\n");
        
        //Accessing through static keyword directly without creating object(from inheritance package)
        System.out.println("name of the college is: " + Modifiers.college.toUpperCase() +"\n");

        //accessing the variable from same package without using static,public keywords
        //default character of default or normal variables
        SamePackage sm1=new SamePackage();
        System.out.println(sm1.default_variable);
        System.out.println(sm1.protected_Variable);
    }
}
