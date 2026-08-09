package basics;

class Book {
    private int bookId;
    private String bookname;
    private String author;
    private int price;

    public Book(int id, String name, String author, double price) {
        this.bookId = id;
        this.bookname = name;
        this.author = author;
        this.price = (int) price;
    }

    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }

    public String getBookname() { return bookname; }
    public void setBookname(String bookname) { this.bookname = bookname; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public void displayDetails() {
        System.out.println(bookId + " " + bookname + " " + author + " " + price);
    }
}

class Person {
    String name;
    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String course;
    void display() {
        super.display();
        System.out.println("Course: " + course);
    }
}

class Faculty extends Person {
    String department;
    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

// Polymorphism
class AreaCalculator {
    double area(double radius) {
        return 3.14 * radius * radius;
    }
    double area(double l, double b) {
        return l * b;
    }
    double area(double bs, double h, boolean tri) {
        return 0.5 * bs * h;
    }
}

class Vehicle {
    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a car");
    }
}

class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a bike");
    }
}

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("This is a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Draw a rectangle");
    }
}

interface Printable {
    void print();
}

class Report implements Printable {
    public void print() {
        System.out.println("Printing report...");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println("Book Details:");
        Book b = new Book(123, "Java Programming", "Santosh Kumar P", 500);
        b.displayDetails();

        System.out.println("In Inheritance: ");
        Student s = new Student();
        s.name = "Prabhash";
        s.course = "AIML";
        s.display();

        Faculty f = new Faculty();
        f.name = "Dr. Santosh";
        f.department = "Engineering";
        f.display();

        System.out.println("In Polymorphism: ");
        AreaCalculator ac = new AreaCalculator();
        System.out.println("Circle area: " + ac.area(10));
        System.out.println("Rectangle area: " + ac.area(6, 10));
        System.out.println("Triangle area: " + ac.area(3, 7, true));

        Vehicle v = new Vehicle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        v.display();
        car.display();
        bike.display();

        System.out.println("Abstraction & Interfaces: ");
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();

        Report report = new Report();
        report.print();
    }
}
