# 5 Employee Class

class Employee {
    int empno;
    String ename;
    float basic, hra, da;
    float netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata(int no, String name, float b, float h, float d) {
        empno = no;
        ename = name;
        basic = b;
        hra = h;
        da = d;
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println("Emp No: " + empno);
        System.out.println("Name: " + ename);
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.havedata(101, "Rahul", 20000, 5000, 3000);
        e.dispdata();
    }
}

6. Rectangle Area

class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int Area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);

        System.out.println("Area of Rectangle 1: " + r1.Area());
        System.out.println("Area of Rectangle 2: " + r2.Area());
    }
}

7. Abstraction Example 

abstract class Shape {
    abstract double calculate_area();

    void display_info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculate_area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle1 extends Shape {
    double length, width;

    Rectangle1(double l, double w) {
        length = l;
        width = w;
    }

    double calculate_area() {
        return length * width;
    }
}

public class TestShape {
    public static void main(String[] args) {
        // Shape s = new Shape(); // ❌ ERROR (cannot instantiate abstract class)

        Circle c = new Circle(5);
        Rectangle1 r = new Rectangle1(4, 6);

        c.display_info();
        System.out.println("Circle Area: " + c.calculate_area());

        r.display_info();
        System.out.println("Rectangle Area: " + r.calculate_area());
    }
}

8.  Interface Filterable

interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to image");
    }

    public void reset_filter() {
        System.out.println("Resetting image filters");
    }
}

class DataAnalyzer implements Filterable {
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to data");
    }

    public void reset_filter() {
        System.out.println("Resetting data filters");
    }
}

class TestFilter {
    public static void main(String[] args) {
        ImageProcessor img = new ImageProcessor();
        DataAnalyzer data = new DataAnalyzer();

        img.apply_filter("Blur");
        img.reset_filter();

        data.apply_filter("Noise Reduction");
        data.reset_filter();
    }
}

9. Method Overloading (Polymorphism)

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum (2 ints): " + calc.add(2, 3));
        System.out.println("Sum (3 ints): " + calc.add(2, 3, 4));
        System.out.println("Sum (2 doubles): " + calc.add(2.5, 3.5));
    }
}

10. Bank Interface

interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

class HDFC implements Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

class ICICI implements Bank {
    public double getInterestRate() {
        return 6.8;
    }
}

class TestBank {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI Interest Rate: " + b1.getInterestRate());
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate());
        System.out.println("ICICI Interest Rate: " + b3.getInterestRate());
    }
}
