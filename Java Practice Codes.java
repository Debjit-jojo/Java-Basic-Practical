
1. Person Class Program

class Person {
    String name;
    int age;

    // Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Person p1 = new Person("Rahul", 21);
        Person p2 = new Person("Anita", 23);

        p1.display();
        System.out.println();

        p2.display();
    }
}

2. Book and Library Class Program

import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        ISBN = i;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}

class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book Added.");
    }

    void removeBook(String isbn) {
        for (Book b : books) {
            if (b.ISBN.equals(isbn)) {
                books.remove(b);
                System.out.println("Book Removed.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void displayBooks() {
        System.out.println("Library Books:");
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java Basics", "James Gosling", "111");
        Book b2 = new Book("Python Guide", "Guido", "222");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayBooks();

        lib.removeBook("111");

        lib.displayBooks();
    }
}

3 CARRENTAL Class Program

import java.util.Scanner;

class CARRENTAL {

    int CarId;
    String CarType;
    float Rent;

    void GetCar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car ID: ");
        CarId = sc.nextInt();

        System.out.print("Enter Car Type (Small Car / Van / SUV): ");
        CarType = sc.next();
    }

    float GetRent() {

        if (CarType.equalsIgnoreCase("Small"))
            Rent = 1000;
        else if (CarType.equalsIgnoreCase("Van"))
            Rent = 800;
        else if (CarType.equalsIgnoreCase("SUV"))
            Rent = 2500;

        return Rent;
    }

    void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + GetRent());
    }

    public static void main(String[] args) {

        CARRENTAL c = new CARRENTAL();

        c.GetCar();
        c.ShowCar();
    }
}

4 Resort Class Program

import java.util.Scanner;

class Resort {

    int RNo;
    String Name;
    float Charges;
    int Days;
    float Amount;

    float Compute() {

        Amount = Days * Charges;

        if (Amount > 11000)
            Amount = (float)(1.02 * Amount);

        return Amount;
    }

    void Getinfo() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();

        System.out.print("Enter Customer Name: ");
        Name = sc.next();

        System.out.print("Enter Charges Per Day: ");
        Charges = sc.nextFloat();

        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    void DispInfo() {

        Compute();

        System.out.println("Room No: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges: " + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Total Amount: " + Amount);
    }

    public static void main(String[] args) {

        Resort r = new Resort();

        r.Getinfo();
        r.DispInfo();
    }
}




