//  class and object ia an encapsulation (without object we cannot access the class attributes or methods)
//Encapsulation 
class One {
    private  long rollno = 234463099L;
    private  String name;

    public One(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getRollno(){
        return rollno;
    }
}

class Two extends One {
    public Two(String name) {
        super(name);
    }
//Encapsulation
    private  void details() {
        System.out.println("Name: " + getName());
        System.out.println("Student roll number: " + getRollno());
    }

    public void showDetails() {
        details();
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Two t= new Two("Michael");
        t.showDetails();
    }
}

