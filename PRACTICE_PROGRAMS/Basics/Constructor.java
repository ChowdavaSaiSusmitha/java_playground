package oops;
class Example{
    void showdata(){
        System.out.println("this is a showdata method");
    }
}
class Para{
    public Para(int a,int b){
       int x=a;
       int y=b;
       System.out.println("sum:" + (x+y));
       System.out.println("this is a constructor with parameters");
    }
}

public class Constructor {

        int rollno;
        String name; 
        
        public Constructor(){
        this.rollno=12455;
        this.name="prabhash";
        System.out.println("varriables are ready");
        } 

        void showdetails(){
            System.out.println("roll no is " + rollno);
            System.out.println("rebelstar is " + name);
        }

    public static void main(String[] args) {
        int x=2,y=3;
        System.out.println("resuit is " + x+y);
        Example e = new Example();
		e.showdata();
        Constructor d=new Constructor();
        d.showdetails();

        Para p=new Para(32,8);
        

    }
}
