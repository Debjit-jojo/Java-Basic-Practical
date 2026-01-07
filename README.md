# Java-Basic-Practical 
1.
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

2.
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
