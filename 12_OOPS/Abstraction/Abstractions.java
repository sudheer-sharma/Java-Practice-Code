// // // // Abstract Classes
// public class Abstractions {

//     public static void main(String[] args) {
//         // Horse h = new Horse();
//         // h.eat();
//         // h.walk();
//         // System.out.println(h.color);
//         //
//         Mantang m1 = new Mantang();
//         //
//         // Cheeken c = new Cheeken();
//         // c.eat();
//         // c.walk();
//         // c.changeColor();
//     }
// }
// abstract class Animals {
//     String color;
//     Animals() {
//         // color = "brown";
//         System.out.println("ANimal Constructor colled!");
//     }
//     void eat() {
//         System.out.println("eating anything");
//     }
//     abstract void walk();
// }
// class Horse extends Animals {
//     Horse() {
//         System.out.println("Hourse Constructor colled!");
//     }
//     void changeColor() {
//         color = "Black hourse";
//         // System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
//     }
//     void walk() {
//         System.out.println("horse Four lags");
//     }
// }
// class Mantang extends Horse {
//     Mantang() {
//         System.out.println("Mantang Constructor colled!");
//     }
// }
// class Cheeken extends Animals {
//     void changeColor() {
//         color = "Wite hen";
//     }
//     void walk() {
//         System.out.println("cheeken 2 lags");
//     }
// }
//
//
//
// // // // Interfaces
// public class Abstractions {
//     public static void main(String[] args) {
//         // Queen Q = new Queen();
//         // Q.moves();
//         // Root R = new Root();
//         // R.moves();
//         // King K = new King();
//         // K.moves();
//         //
//         Bear b = new Bear();
//         b.eat();
//         b.eats();
//     }
// }
// interface Harnivol {
//     void eat();
// }
// interface Carnivol {
//     void eats();
// }
// class Bear implements Harnivol, Carnivol {
//     public void eat() {
//         System.out.println("Grass");
//     }
//     public void eats() {
//         System.out.println("Meet");
//     }
// }
// interface ChessPlayer {
//     void moves();
// }
// class Queen implements ChessPlayer {
//     public void moves() {
//         System.out.println("Up, Down, Left, Right, Diagonal (in all 4 dirns)");
//     }
// }
// class Root implements ChessPlayer {
//     public void moves() {
//         System.out.println("Up, Down, Left, Right");
//     }
// }
// class King implements ChessPlayer {
//     public void moves() {
//         System.out.println("Up, Down, Left, Right, Diagonal (by 1 step)");
//     }
// }
//
//
//
// // // // Static Keyword
// public class Abstractions {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.schoolName = "VM School";
//         System.out.println(s1.schoolName);
//         Student s2 = new Student();
//         System.out.println(s2.schoolName);
//         Student s3 = new Student();
//         s3.schoolName = "Kailash";
//         System.out.println(s3.schoolName);
//     }
// }
// class Student {
//     String name;
//     int rollno;
//     static String schoolName;
//     void setName(String name) {
//         this.name = name;
//     }
//     String getName() {
//         return this.name;
//     }
// }
//
//
// // // // // Super KeyWords
// public class Abstractions {
//     public static void main(String[] args) {
//         Hourse h = new Hourse();
//         System.out.println(h.color);
//     }
// }
// class Animals {
//     String color;
//     Animals() {
//         System.out.println("Animals is A called");
//     }
// }
// class Hourse extends Animals {
//     Hourse() {
//         super.color = "Black";
//         System.out.println("Hourse is called");
//     }
// }
//
//
//
// // // // Practice Questions
// public class Abstractions {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.name = "Kailash Shiwagma";
//         System.out.println(s.name);
//     }
// }
// class Student {
//     String name;
//     int marks;
// }
//
//
// // // // Practice Questions
// public class Abstractions {
//     public static void main(String[] args) {
//         Vehical obj1 = new Car();
//         obj1.print();
//         Vehical obj2 = new Vehical();
//         obj2.print();
//     }
// }
// class Vehical {
//     void print() {
//         System.out.println("Super class");
//     }
// }
// class Car extends Vehical {
//     void print() {
//         System.out.println("Derived calss");
//     }
// }
//
//
//
// public class Abstractions {
//     public static void main(String[] args) {
//         Vehical obj1 = new Car();
//         obj1.print1(); // Wrong
//         Vehical obj2 = new Vehical();
//         obj2.print();
//     }
// }
// class Vehical {
//     void print() {
//         System.out.println("Super class");
//     }
// }
// class Car extends Vehical {
//     void print1() {
//         System.out.println("Derived calss");
//     }
// }
//
//
// // // // // Practice Questions
// public class Abstractions {
//     public static void main(String[] args) {
//         System.out.print(Book.count + " ");
//         Book b1 = new Book(105);
//         Book b2 = new Book(250);
//         System.out.println(Book.count);
//     }
// }
// class Book {
//     int price;
//     static int count;
//     public Book(int price) {
//         this.price = price;
//         count++;
//     }
// }
//
//
// // // // // Practice Questions
// // // // // Which line has error ?
// public class Abstractions {
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.set_marks(46);
//         System.out.println(Test.marks);
//     }
// }
// class Test {
//     static int marks;
//     void set_marks(int marks) {
//         this.marks = marks;
//     }
// }
//
//
//
// // // // Practice Questions
// // // // what would be the output of the following code ? 
// public class Abstractions {

//     public static void main(String[] args) {
//         Test t = new Test();
//         t.changeB();
//         System.out.println(Test.a + Test.b);
//     }
// }

// class Test {

//     static int a = 10;
//     static int b;

//     static void changeB() {
//         b = a * 3;
//     }
// }
