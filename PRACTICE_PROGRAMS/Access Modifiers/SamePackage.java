package beyond;
import beyond.Access;

public class SamePackage {
    public String intro="hello java";
    protected String protected_Variable="protected, Welcome to home!";
    String default_variable="default characters";
        public static void main(String[] args) {            
        SamePackage sm=new SamePackage();
        //accessing directly in the same class
        System.out.println(sm.intro);

        //it is object for data class (which is in Access file);
        Data data = new Data();
        //protected variable
        System.out.println(data.information);



        System.out.println(sm.default_variable);
    }
}
