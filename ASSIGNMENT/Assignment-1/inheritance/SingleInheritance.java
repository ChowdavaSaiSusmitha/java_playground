package inheritance;

//single level inheritance
class hello{
    String show(){
        return "Hello";
    }
}
class World extends hello{
    String show(){
        return  super.show()+ " World";
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        World w = new World();
        String s = w.show();
        System.out.println(s);
    }
}
