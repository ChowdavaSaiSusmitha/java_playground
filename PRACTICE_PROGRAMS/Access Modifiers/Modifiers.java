package inheritance;
public class Modifiers {
    //public variable which can be access through any file or package
    public String name="Sai Susmitha";
    
    //directly access without creating an object 
    public static String college="Anil neerukonda institute of technology & sciences";

    //must be inherited to subclass for different packages
    protected static String rollno="A23BH222421";
    protected void carengine(){
        System.out.println("Engine is running smoothly");
    }
}
