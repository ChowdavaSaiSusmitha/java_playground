package basics;

class Animal{
    String name;
    String place;
    String food;
    String sound;

    public Animal(String name, String place, String food, String sound){
        this.name=name;
        this.place=place;
        this.food=food;
        this.sound=sound;
    }

   void showAnimaldetails(){
    System.out.println("Animal:" + name);
    System.out.println("place:" + place);
    System.out.println("eats:" +food);
    System.out.println("sound:" + sound.toUpperCase() + "\n");
   } 
}

public class FarmAnimals {
    public static void main(String[] args) {
        Animal  cow=new Animal("cow","shed", "grass","amba" );
        cow.showAnimaldetails();
        Animal  pig=new Animal("pig","mudd","corn","oink");
        pig.showAnimaldetails();
        Animal  horse=new Animal("horse","shed","grass","neighhh");
        horse.showAnimaldetails();
    }
}
