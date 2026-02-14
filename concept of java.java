## 1 Parameterized Constructor


class Cube {
    double width, height, depth;

    Cube(double w, double h, double d) {
        System.out.println("Constructing cube");
        width = w;
        height = h;
        depth = d;
    }
}

class MyMain {
    public static void main(String[] args) {
        Cube c = new Cube(10, 10, 10);
    }
}




## 2 Parameterized Constructor with Method


class Cube {
    double width, height, depth;

    Cube(double w, double h, double d) {
        System.out.println("Constructing cube");
        width = w;
        height = h;
        depth = d;
    }

    void calVolume() {
        System.out.println("Volume=" + width * height * depth);
    }
}

class MyMain {
    public static void main(String[] args) {
        Cube c = new Cube(10, 10, 10);
        c.calVolume();
    }
}



## 3 Parameterized Constructor with Return Value Method

```java
class Cube {
    double width, height, depth;

    Cube(double w, double h, double d) {
        System.out.println("Constructing cube");
        width = w;
        height = h;
        depth = d;
    }

    double calVolume() {
        return width * height * depth;
    }
}

class MyMain {
    public static void main(String[] args) {
        double vol;
        Cube c = new Cube(10, 10, 10);
        vol = c.calVolume();
        System.out.println("Volume=" + vol);
    }
}



## 4 Copy Constructor Example



class Student {
    String name;
    int rollno;

    Student(String s_name, int s_roll) {
        System.out.println("Constructor Invoked");
        this.name = s_name;
        this.rollno = s_roll;
    }

    Student(Student s) {
        System.out.println("Copy Constructor Invoked");
        this.name = s.name;
        this.rollno = s.rollno;
    }

    public void display() {
        System.out.println("name=" + name);
        System.out.println("rollno=" + rollno);
    }
}

class MyProgramCopy {
    public static void main(String[] args) {
        Student s1 = new Student("darshan", 101);
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }
}


## 5 Constructor Overloading

```java
class Balance {
    int accNo;
    double bal;

    Balance() {
        System.out.println("inside const1");
        bal = 0;
    }

    Balance(double b) {
        System.out.println("inside const2");
        bal = b;
    }

    Balance(int a, double b) {
        System.out.println("inside const3");
        bal = b;
        accNo = a;
    }
}

class Account {
    public static void main(String[] args) {
        Balance b1 = new Balance();
        Balance b2 = new Balance(100);
        Balance b3 = new Balance(1201, 10000);

        System.out.println("b1.bal=" + b1.bal);
        System.out.println("b2.bal=" + b2.bal);
        System.out.println("b3.bal=" + b3.bal + " b3.accno=" + b3.accNo);
    }
}


## 6 Static Method – Rectangle Area


import java.util.*;

class Rectangle {
    static float height;
    static float width;

    static void calArea() {
        System.out.println("Area=" + height * width);
    }
}

class MyRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter height:");
        Rectangle.height = sc.nextFloat();
        System.out.print("enter width:");
        Rectangle.width = sc.nextFloat();

    }
}










