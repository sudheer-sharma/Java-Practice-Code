/*
 * public class JavaBasic {
 * public static void main(String args[]) {
 * // System.out.print("Kailash Shiwagma");
 * // System.out.print("Kailash Kher");
 * // System.out.println("Kailash Shiwagma");
 * // System.out.println("Kailash Kher");
 * // System.out.print("Kailash Shiwagma\n");
 * // System.out.print("Kailash Kher\n");
 * 
 * // System.out.print("* * * * \n* * * \n* * \n*");
 * }
 * }
 */

// Variable
/*
 * public class JavaBasic {
 * public static void main(String args[]) {
 * int a = 10;
 * int b = 5;
 * System.out.println(a + b);
 * 
 * // a = 50;
 * a = b;
 * System.out.print(a);
 * }
 * }
 */

/*
 * // Data Type
 * public class JavaBasic {
 * public static void main(String args[]) {
 * byte a = 8;
 * System.out.println(a);
 * 
 * char ch = 'S';
 * System.out.println(ch);
 * 
 * int number = 50;
 * System.out.println(number);
 * 
 * long numbers = 78426;
 * System.out.println(numbers);
 * 
 * float price = 10.5f;
 * System.out.println(price);
 * 
 * double num = 797.48;
 * System.out.println(num);
 * }
 * }
 */

// Sum
/*
 * public class JavaBasic {
 * public static void main(String args[]) {
 * // int a = 10;
 * // int b = 20;
 * // int c = a + b;
 * // System.out.println(c);
 * 
 * // long a = 10;
 * // long b = 20;
 * // long c = a + b;
 * // System.out.println(c);
 * }
 * }
 */

// Input in java
/*
 * import java.util.*;
 * 
 * public class JavaBasic {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * // String input = sc.next();
 * // System.out.println(input);
 * 
 * // String input = sc.nextLine();
 * // System.out.println(input);
 * 
 * // int intval = sc.nextInt();
 * // System.out.println(intval);
 * 
 * // long intval = sc.nextLong();
 * // System.out.println(intval);
 * 
 * // float flt = sc.nextFloat();
 * // System.out.println(flt);
 * 
 * // double dob = sc.nextDouble();
 * // System.out.println(dob);
 * 
 * // Boolean bel = sc.nextBoolean();
 * // System.out.println(bel);
 * 
 * // Short str = sc.nextShort();
 * // System.out.println(str);
 * }
 * }
 */

// import java.util.*;

// public class JavaBasic {
// public static void main(String[] args) {
// Scanner sudheer = new Scanner(System.in);
// String input = sudheer.nextLine();
// System.out.println(input);
// sudheer.close();
// }
// }

// import java.util.*;

// public class JavaBasic {
// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);

// int a = scn.nextInt();
// int b = scn.nextInt();
// int c = a + b;
// System.out.println(c);

// scn.close();
// }
// }

// import java.util.*;
// public class JavaBasic {
// public static void main(String[] args) {
// Scanner sk = new Scanner(System.in);
// int a = sk.nextInt();
// int b = sk.nextInt();
// int c = a * b;

// System.out.println(c);
// }
// }

// import java.util.*;

// public class JavaBasic {
// public static void main(String[] args) {
// Scanner csk = new Scanner(System.in);
// float area = csk.nextFloat();
// float ans = 3.14f * area * area;
// System.out.println(ans);
// }
// }

// // Type Conversion
// public class JavaBasic {
// public static void main(String[] args) {
// byte byt = 85;
// short sort = byt;
// int nt = sort;
// float flot = nt;
// long lng = (long) flot;
// double dbl = lng;
// System.out.println(dbl);
// }
// }

// // Type Casting
// public class JavaBasic {
// public static void main(String[] args) {
// // float flt = 45.18f;
// // int nt = (int) flt;
// // System.out.println(nt);

// char kr = 'a';
// int numbr = kr;
// System.out.println(numbr);
// }
// }

// // Type Promotion in Exression

// public class JavaBasic {
// public static void main(String[] args) {
// // char a = 'a';
// // char b = 'b';
// // int num = a + b;
// // // char num = a - b;
// // System.out.println(a);
// // System.out.println(b);
// // System.out.println(num);

// // short a = 25;
// // byte b = 8;
// // char c = 'a';
// // byte bt = (byte) (a + b + c);
// // System.out.println(bt);

// // int a = 15;
// // float b = 25.12f;
// // long c = 36;
// // double d = 12;

// // // int ans = (int) (a + b + c + d);
// // // int ans = a + b + c + d; // X
// // // double ans = a + b + c + d;
// // System.out.println(ans);

// // // // Wrong
// // byte b = 15;
// // b = b * 2;
// // System.out.println(b);

// // // // Right
// byte b = 15;
// b = (byte) (b * 2);
// System.out.println(b);
// }
// }

// // // // // // // Q //////////////////////////////////////

///// Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers. (Hint : Average of N numbers is sum of those numbers divided by N)

// import java.util.*;

// public class JavaBasic {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();
// // int d = sc.nextInt();
// int e = (a + b + c) / 3;
// System.out.println("Avaree : " + e);
// }
// }

///// Question 2: In a program, input the side of a square. You have to output the area of the square. (Hint : area of a square is (side x side))
// public class JavaBasic {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int d = a * a;
// System.out.println("Squire : " + d);
// }
// }

///// Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill. (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

// public class JavaBasic {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int pancile = sc.nextInt();
// int pen = sc.nextInt();
// int eraser = sc.nextInt();
// int total = pancile + pen + eraser;
// System.out.println("Bill is Total : " + total);

// ///// Add on - with 18% tax
// float newTotal = total + 0.18f * total;

// System.out.println("Add GST : " + newTotal);
// }
// }

////// Question 4: What will be the type of result in the following Java code?

// public class JavaBasic {

// public static void main(String[] args) {
// byte b = 4;
// char c = 'a';
// short s = 512;
// int i = 1000;
// float f = 3.14f;
// double d = 99.9954;

// System.out.println("Result : " + ((f * b) + (i % c) - (d * s)));
// }
// }

// // // // Question 5: (Advanced) Will the following statement give any error
// in Java? int $ = 24;

// public class JavaBasic {

// public static void main(String[] args) {
// int $ = 21;
// System.out.println($);
// }
// }
