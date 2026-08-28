package oops;

class LuxuryCars{
    static String rating="5*stars";
    final String brand;
    public LuxuryCars(String brand){
        this.brand = brand;
    }
}

class CarModels extends LuxuryCars{
    String model;
    String brand;
    //String rating="4.555 stars";
    public CarModels(String brand,String model){
       super(brand);
       this.model=model;
       //this.brand="lamborgini"; 
    }
    void displaycardetails(){
        System.out.println("Model:" + model.toUpperCase());
        System.out.println("Brand:" + super.brand.toUpperCase());
        System.out.println("Rating :" + rating.toUpperCase() + "\n");//this.rating
    }
}

public class Super_This_Static_Final {
    public static void main(String[] args) {
        CarModels cm = new CarModels("Rolls_Royce", "phantom");
        cm.displaycardetails();
        CarModels cm1 = new CarModels("bmw", "i7");
        cm1.displaycardetails();
        CarModels cm2 = new CarModels("Mercedes_Maybach", "S-Class");
        cm2.displaycardetails();

    }
}
