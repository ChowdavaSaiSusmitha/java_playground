package oops;

class Employee{
    String name;
    long id;
    String designation;
    Double salary;
    boolean promotion_status;

    public Employee(String name,long id,String designation,Double salary){
        this.name=name;
        this.id= id;
        this.designation= designation;
        this.salary= salary;
    }

    //constructor overloading
    public Employee(String name,long id,String designation,Double salary,boolean promotion_status){
        this.name=name;
        this.id= id;
        this.designation= designation;
        this.salary= salary;
        this.promotion_status=promotion_status;
    }

    void employeedetails(){
        System.out.println("name:" + name);
        System.out.println("id:" + id);
        System.out.println("designation:" + designation.toUpperCase());
        System.out.println("salary:" + salary);
        System.out.println("eligible for promotion:" + (promotion_status ? "yes" : "no") + "\n");
    }
}
public class Cadre_of_Employee {
    public static void main(String[] args) {
        System.out.println("cadre:Entry level");
        Employee e1=new Employee("sahithi",12454657L,"interns",15000d);
        e1.employeedetails();
         System.out.println("cadre:mid-level");
        Employee e2=new Employee("meghana",3434567889L,"Data scientist",23454650d,true);
        e2.employeedetails() ;
        System.out.println("cadre:executive level");
        Employee e3=new Employee("sangeetha",32452943,"Director",243654670d,false);
        e3.employeedetails();
    }
}
