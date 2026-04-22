// // // Class and Object
// public class ObjectOriented_Programming {

//     public static void main(String[] args) {
//         // Pen p1 = new Pen();
//         // p1.setColor("Kailash Colors");
//         // System.out.println(p1.color);
//         // // p1.setColor("Shiwagma Color");
//         // p1.color = "Shiwagma Color";
//         // System.out.println(p1.color);
//         // p1.setTip(5);
//         // System.out.println(p1.tip);
//         //
//         Student s1 = new Student();
//         s1.calcPerce(45, 78, 92, 65);
//         // System.out.println(s1.percentage + "%");
//         //
//         // A.main(args);
//         //
//     }
// }
//
// class A {
//     public static void main(String[] args) {
//         System.out.println("Main of A");
//     }
// }
// class Pen {
//     String color;
//     int tip;
//     void setColor(String newColor) {
//         color = newColor;
//     }
//     void setTip(int newTip) {
//         tip = newTip;
//     }
// }
// class Student {
//     String name;
//     int age;
//     float percentage;
//     void calcPerce(int phy, int math, int chem, int engli) {
//         percentage = (phy + math + chem + engli) / 3;
//     }
// }
//
//
// // // Access Modifiers
// public class ObjectOriented_Programming {
//     public static void main(String[] args) {
//         BankAccount myAcc = new BankAccount();
//         myAcc.username = "Kailash Shiwagma";
//         // myAcc.Passsword = "Kailash Shiwagma";  // // This is not access
//         myAcc.setPasssword("kailashShiwagma");
//     }
// }
// class BankAccount {
//     public String username;
//     private String Passsword;
//     public void setPasssword(String pwd) {
//         Passsword = pwd;
//     }
// }
//
//
// // // Getter & setter
// public class ObjectOriented_Programming {
//     public static void main(String[] args) {
//         // Pen p1 = new Pen();
//         // p1.color = "Kailash";
//         // System.out.println(p1.color);
//         // p1.tip = 56;
//         // System.out.println(p1.tip);
//         //
//         // Pen p1 = new Pen();
//         // p1.color = "Kailash";
//         // System.out.println(p1.color);
//         // p1.tip = 56;
//         // System.out.println(p1.tip);
//         //
//         Pen p1 = new Pen();
//         p1.setColor("Kailash");
//         System.out.println(p1.getClass());
//         p1.setTip(56);
//         System.out.println(p1.getTip());
//     }
// }
// class Pen {
//     // String color;
//     // int tip;
//     private String color;
//     private int tip;
//     String getColor() {
//         return this.color;
//     }
//     int getTip() {
//         return this.tip;
//     }
//     void setColor(String newColor) {
//         color = newColor;
//     }
//     // void setTip(int newTip) {
//     //     tip = newTip;
//     // }
//     void setTip(int tip) {
//         this.tip = tip;
//     }
// }
//
//
// // // Constructors
// public class ObjectOriented_Programming {
//     public static void main(String[] args) {
//         // Student s1 = new Student("Kilsha Shiwagma");
//         Student s1 = new Student();
//         // System.out.println(s1.name);
//     }
// }
// class Student {
//     String name;
//     int rollNo;
//     // Student(String name) {
//     //     this.name = name;
//     //     System.out.println("Constructer is a colled!");
//     // }
//     Student() {
//         System.out.println("Constructer is a colled!");
//     }
// }
//
//
//
// // //  Type of Contructore
// public class ObjectOriented_Programming {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         //
//         Student s2 = new Student("Sudher kiamskd");
//         System.out.println(s2.name);
//         //
//         Student s3 = new Student(123);
//         System.out.println(s3.rollNo);
//         //
//         // Student s3 = new Student("Shiwagma", 123); // // Error
//         //
//     }
// }
// class Student {
//     String name;
//     int rollNo;
// // No Parametrized
//     Student() {
//         System.out.println("Kailash Shiwagma");
//     }
// // Parameterized
//     Student(String name) {
//         this.name = name;
//     }
//     Student(int rollNo) {
//         this.rollNo = rollNo;
//     }
// }
//
//
// // // Copy Contructore
// public class ObjectOriented_Programming {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "Kailsh";
//         s1.rollNo = 1234;
//         s1.password = "qwertyuio";
//         s1.marks[0] = 50;
//         s1.marks[1] = 65;
//         s1.marks[2] = 60;
//         //
//         // System.out.println(s1.name + " " + s1.rollNo + " " + s1.password);
//         //
//         Student s2 = new Student(s1);
//         s2.password = "zxcvbnm";
//         s1.marks[2] = 100;
//         for (int i = 0; i < 3; i++) {
//             System.out.println(s2.marks[i]);
//         }
//     }
// }
// class Student {
//     String name;
//     int rollNo;
//     String password;
//     int marks[];
//     Student(Student s1) {
//         marks = new int[3];
//         this.name = s1.name;
//         this.rollNo = s1.rollNo;
//         this.marks = s1.marks;
//     }
//     Student() {
//         marks = new int[3];
//         System.out.println("Constructore is colled!");
//     }
//     Student(String name) {
//         marks = new int[3];
//         this.name = name;
//     }
//     Student(int rollNo) {
//         marks = new int[3];
//         this.rollNo = rollNo;
//     }
// }
//
//
// public class ObjectOriented_Programming {
//     public static void main(String[] args) {
//         Kailash kk1 = new Kailash();
//         // Kailash kk2 = new Kailash("AAAAAAAAAA");
//         // Kailash kk3 = new Kailash(4567899);
//         // System.out.println(kk2.name + "    " + kk3.rollNo);
// //
//         kk1.passwword = "eeeeeeeeeeeeeeeeee";
//         System.out.println(kk1.passwword);
// //
//         kk1.name = "SSSSS";
//         kk1.rollNo = 789456;
//         // System.out.println(kk1.name + "      " + kk1.rollNo);
//         kk1.marks[0] = 45;
//         kk1.marks[1] = 65;
//         kk1.marks[2] = 55;
//         Kailash kk2 = new Kailash(kk1);
//         kk2.passwword = "DDDDDDDDDDDDDDDDDDD";
//         System.out.println(kk2.passwword);
//         //
//         for (int i = 0; i < 3; i++) {
//             System.out.println(kk1.marks[i]);
//         }
//     }
// }
// class Kailash {
//     String name;
//     int rollNo;
//     String passwword;
//     int marks[];
//     Kailash(Kailash kk1) {
//         marks = new int[3];
//         this.name = kk1.name;
//         this.rollNo = kk1.rollNo;
//         this.passwword = kk1.passwword;
//         this.marks = kk1.marks;
//     }
//     Kailash() {
//         this.marks = marks;
//         // this.name = k1.name;
//         // System.out.println("SSSSSSSSSSSSSSSSSSSSSS");
//     }
//     Kailash(String name) {
//         this.name = name;
//     }
//     Kailash(int rollNo) {
//         this.rollNo = rollNo;
//     }
// }
//
//
// 
// // // // Shallow and Deep Copy
// public class ObjectOriented_Programming {
//     public static void main(String[] args) {
//         Shiwagma ss1 = new Shiwagma();
//         ss1.name = "SSSSSSSSSSS";
//         ss1.rollNo = 123456;
//         ss1.password = "ppppppppp";
//         ss1.marks[0] = 45;
//         ss1.marks[1] = 40;
//         ss1.marks[2] = 100;
//         Shiwagma ss2 = new Shiwagma(ss1);
//         System.out.println(ss2.name = "mmmmmmmmmmm");
//         ss1.marks[2] = 80;
//         for (int i = 0; i < 3; i++) {
//             System.out.println(ss2.marks[i]);
//         }
//     }
// }
// class Shiwagma {
//     String name;
//     int rollNo;
//     String password;
//     int marks[];
//     //
//     // // Shallow Copy
//     // Shiwagma(Shiwagma ss1) {
//     //     marks = new int[3];
//     //     this.name = ss1.name;
//     //     this.rollNo = ss1.rollNo;
//     //     this.password = ss1.password;
//     //     this.marks = ss1.marks;
//     // }
//     //
//     // // Deep Copy
//     Shiwagma(Shiwagma ss1) {
//         marks = new int[3];
//         this.name = ss1.name;
//         this.rollNo = ss1.rollNo;
//         for (int i = 0; i < marks.length; i++) {
//             this.marks[i] = ss1.marks[i];
//         }
//     }
//     Shiwagma() {
//         marks = new int[3];
//     }
// }
//
//
// // // // Destructors
public class ObjectOriented_Programming {

    public static void main(String[] args) {

    }
}
