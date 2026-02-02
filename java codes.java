# Basic Codes of java   


## 1. Derived Class with Constructor

```java
class Cube {
    protected double height, width, depth;

    Cube() {
        System.out.println("inside default Constructor:CUBE");
    }

    double volume() {
        return height * width * depth;
    }
}

class CubeWeight extends Cube {
    double weight;

    CubeWeight(double h, double w, double d, double m) {
        System.out.println("inside Constructor:CUBEWEIGHT");
        height = h;
        width = w;
        depth = d;
        weight = m;
    }
}

class CubeInherit {
    public static void main(String[] args) {
        CubeWeight cw1 = new CubeWeight(10, 10, 10, 20.5);
        CubeWeight cw2 = new CubeWeight(100, 100, 100, 200.5);

        System.out.println("cw1.volume()=" + cw1.volume());
        System.out.println("cw2.volume()=" + cw2.volume());
    }
}
```

---

## 2. Super Keyword – Calling Superclass Constructor

```java
class Cube {
    protected double height, width, depth;

    Cube(double h, double w, double d) {
        System.out.println("Constructor:CUBE");
        height = h;
        width = w;
        depth = d;
    }

    double volume() {
        return height * width * depth;
    }
}

class CubeWeight extends Cube {
    double weight;

    CubeWeight(double h, double w, double d, double m) {
        super(h, w, d); // call superclass constructor
        System.out.println("Constructor:CUBEWEIGHT");
        weight = m;
    }
}

class CubeInheritSuper {
    public static void main(String[] args) {
        CubeWeight cw1 = new CubeWeight(10, 10, 10, 20.5);
        CubeWeight cw2 = new CubeWeight(100, 100, 100, 200.5);

        System.out.println("cw1.volume()=" + cw1.volume());
        System.out.println("cw1.weight=" + cw1.weight);
        System.out.println("cw2.volume()=" + cw2.volume());
        System.out.println("cw2.weight=" + cw2.weight);
    }
}
```

---

## 3. Using super to Access Members (Variable)

```java
class A {
    int i;
}

class B extends A {
    int i, k;

    B(int a, int b) {
        super.i = a;
        this.i = b;
    }

    void show() {
        System.out.println("super.i=" + super.i);
        System.out.println("this.i=" + this.i);
    }
}

class SuperMemberDemo {
    public static void main(String[] args) {
        B b = new B(12, 56);
        b.show();
    }
}
```

---

## 4. Method Overriding (Runtime Polymorphism)

```java
class Shape {
    void draw() {
        System.out.println("Draw Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Draw Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Draw Square");
    }
}

class OverrideDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();

        Square sq = new Square();
        sq.draw();

        Shape sh = new Shape();
        sh.draw();
    }
}
```

---

## 5. Method Overriding with super.draw()

```java
class Shape {
    void draw() {
        System.out.println("Draw Shape");
    }
}

class Circle extends Shape {
    void draw() {
        super.draw();
        System.out.println("Draw Circle");
    }
}

class Square extends Shape {
    void draw() {
        super.draw();
        System.out.println("Draw Square");
    }
}

class OverrideDemo2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();

        Square sq = new Square();
        sq.draw();
    }
}
```

---

## 6. Abstract Class Example

```java
abstract class Car {
    public abstract double getAverage();
}

class Swift extends Car {
    public double getAverage() {
        return 22.5;
    }
}

class Baleno extends Car {
    public double getAverage() {
        return 23.2;
    }
}

public class MyAbstractDemo {
    public static void main(String[] args) {
        Swift s = new Swift();
        Baleno b = new Baleno();

        System.out.println(s.getAverage());
        System.out.println(b.getAverage());
    }
}
```

---

## 7. Simple Abstract Method Demonstration

```java
abstract class A {
    abstract void callme();

    void callmetoo() {
        System.out.println("This is a concrete method");
    }
}

class B extends A {
    void callme() {
        System.out.println("B's implementation of callme");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.callme();
        obj.callmetoo();
    }
}

```


