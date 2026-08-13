// LibraryManagementSystem.java

// Part A & B: Classes, Objects, Constructors, Encapsulation
class Book {
    private int bookId;
    private String bookName;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        bookId = 0;
        bookName = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    public Book(int bookId, String bookName, String author, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayBook() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author    : " + author);
        System.out.println("Price     : " + price);
        System.out.println();
    }
}

// Part C: Inheritance
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Student extends Person {
    private String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public void displayStudent() {
        displayPerson();
        System.out.println("Course : " + course);
        System.out.println();
    }
}

class Faculty extends Person {
    private String department;

    public Faculty(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayFaculty() {
        displayPerson();
        System.out.println("Department : " + department);
        System.out.println();
    }
}

// Part D: Method Overloading
class Area {
    public double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    public int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}

// Part D: Method Overriding
class Vehicle {
    public void display() {
        System.out.println("This is a Vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    public void display() {
        System.out.println("This is a Car.");
    }
}

class Bike extends Vehicle {
    @Override
    public void display() {
        System.out.println("This is a Bike.");
    }
}

// Part E: Abstraction
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Part E: Interface
interface Printable {
    void print();
}

class Report implements Printable {
    @Override
    public void print() {
        System.out.println("Printing Library Report");
    }
}

// Main Class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        System.out.println("===== PART A & B: Book Class =====");

        Book b1 = new Book();
        Book b2 = new Book(101, "Java Programming", "James Gosling", 650.50);

        b1.displayBook();
        b2.displayBook();

        // Using Setters
        b1.setBookId(102);
        b1.setBookName("Data Structures");
        b1.setAuthor("Mark Allen");
        b1.setPrice(500);

        System.out.println("Updated Book Details:");
        b1.displayBook();

        System.out.println("===== PART C: Inheritance =====");

        Student s = new Student("Rahul", 20, "B.Tech CSE");
        Faculty f = new Faculty("Dr. Sharma", 45, "Computer Science");
        s.displayStudent();
        f.displayFaculty();
        System.out.println("===== PART D: Method Overloading =====");
        Area area = new Area();
        System.out.println("Area of Circle = " + area.calculateArea(5.0));
        System.out.println("Area of Rectangle = " + area.calculateArea(10, 5));
        System.out.println("Area of Triangle = " + area.calculateArea(10.0, 8.0));
        System.out.println();
        System.out.println("===== PART D: Method Overriding =====");
        Vehicle v;
        v = new Vehicle();
        v.display();
        v = new Car();
        v.display();
        v = new Bike();
        v.display();
        System.out.println();
        System.out.println("===== PART E: Abstraction =====");
        Shape c = new Circle();
        Shape r = new Rectangle();
        c.draw();
        r.draw();
        System.out.println();

        System.out.println("===== PART E: Interface =====");

        Printable report = new Report();
        report.print();
    }
}
