# Java-Basic-Practical 
This are the basic code for Learning the basic use of java for developing a project.

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

**2.Basic code for controling the data of Bank**

package q540;

import java.util.Scanner;

class Account {
    int acc_no;
    String name;
    double balance;

    Account(int acc_no, String name, double balance) {
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }

    String deposit(double amount) {
        if (amount <= 0) {
            return "Invalid Deposit Amount";
        }
        balance += amount;
        return "Deposit Successful";
    }

    String withdraw(double amount) {
        if (amount <= 0) {
            return "Invalid Withdraw Amount";
        }
        if (amount > balance) {
            return "Insufficient Balance";
        }
        balance -= amount;
        return "Withdraw Successful";
    }

    double getBalance() {
        return balance;
    }
}

public class Practical1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Create one account with opening balance of 5000
        Account acc = new Account(101, "Rahul", 5000);

        // Program expects exactly 5 operations
        for (int i = 1; i <= 5; i++) {
            int choice = sc.nextInt();      // 1 for deposit, 2 for withdraw
            double amount = sc.nextDouble();
            String result = "";

            if (choice == 1) {
                result = acc.deposit(amount);
            } else if (choice == 2) {
                result = acc.withdraw(amount);
            } else {
                result = "Invalid Choice";
            }

            System.out.println(result + " | Balance: " + acc.getBalance());
        }

        sc.close();
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




