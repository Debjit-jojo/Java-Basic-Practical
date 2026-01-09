# Java-Basic-Practical 
This are the basic code for Learning the basic function of class and identifiers of the java script

**1. Basic code for storing the Detail of a person**
class person{
String name;
int age;
}
class myprogramperson {
public static void main(String[] args){
person p1=new person();
person p2=new person();
p1.name="Rahul";
p1.age=71;
p2.name="Gandhi";
p2.age=80;
System.out.println("p1.name="+p1.name);
System.out.println("p2.name="+p2.name);
System.out.println("p1.age="+p1.age);
System.out.println("p2.age="+p2.age);
}
}

**2.Basic code for storing Details of Bank**

class MyAccount{
int accNo;
double balance;
MyAccount(){
}
}
class MyBank{
public static void main(String[] args){
MyAccount ma= new MyAccount();
System.out.println("balance"+ma.balance);
}
}

**3. Basic code for calculating area of rectangle Box**

class Box{
double width;
double height;
double depth;
}
class Boxdemo2{
public static void main(String args[])
{
Box mybox1 = new Box();
Box mybox2 = new Box();
double vol;
mybox1.width=10;
mybox1.height=20;
mybox1.depth=15;

mybox2.width=3;
mybox2.height=6;
mybox2.depth=9;

vol=mybox1.width*mybox1.height*mybox1.depth;
System.out.println("Volume is"+ vol);
vol=mybox2.width*mybox2.height*mybox2.depth;
System.out.println("Volume is"+ vol);
}	
}




