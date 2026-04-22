// import java.util.*;

// public class Conditional_Statements {
// public static void main(String[] args) {
// int age = 15;

// if (age <= 18) {
// System.out.println("You are Adult");
// }
// if (age > 13 && age < 16) {
// System.out.println("You are Teanser");
// } else {
// System.out.println("You are not adult");
// }
// }
// }

// /// /// Odd and Even

// public class Conditional_Statements {
// public static void main(String[] args) {
// int a = 4;
// if (a % 2 == 0) {
// System.out.println("Odd Number");
// }
// if (a % 2 != 0) {
// System.out.println("Even NUmber");
// }
// }
// }

// public class Conditional_Statements {
// public static void main(String[] args) {
// int age = 15;
// if (age >= 18) {
// System.out.println("Adult");
// } else if ((age >= 13) && (age <= 16)) {
// System.out.println("Teanaser");
// } else {
// System.out.println("Old main");
// }
// }
// }

// public class Conditional_Statements {
// public static void main(String[] args) {
// Scanner scane = new Scanner(System.in);
// int maney = scane.nextInt();
// int tax = 0;

// if (maney <= 500000) {
// System.out.println(maney);
// } else if ((maney >= 500000) && (maney <= 1000000)) {
// tax = (int) (maney * 0.2);
// } else {
// tax = (int) (0.30f * maney);

// }
// System.out.println("Your tax is :" + tax);

// scane.close();
// }
// }

// // // // Find Largest Number
// public class Conditional_Statements {
// public static void main(String[] args) {
// int a = 8;
// int b = 3;
// int c = 6;
// if ((a > b) && (a > c)) {
// System.out.println("A, is a largest Number");
// } else if (b > c) {
// System.out.println("B, is a largest Number");
// } else {
// System.out.println("C, is a largest Number");
// }
// }
// }

// public class Conditional_Statements {
// public static void main(String[] args) {
// Scanner scnr = new Scanner(System.in);
// int marks = scnr.nextInt();

// if (marks >= 90) {
// System.out.println("You are Excellent, A+");
// } else if ((marks < 90) && (marks >= 70)) {
// System.out.println("You are Best, A");
// } else if ((marks < 70) && (marks >= 50)) {
// System.out.println("You are Good, B+");
// } else if ((marks < 50) && (marks >= 30)) {
// System.out.println("You are Pass, c");
// } else if ((marks < 30) && (marks >= 20)) {
// System.out.println("You are Gress");
// } else if (marks < 20) {
// System.out.println("You are Fail");
// }
// }
// }

// // // // Ternary Oparatore

// public class Conditional_Statements {
// public static void main(String[] args) {
// int number = 87;
// String type = (number % 2 == 0) ? "EVEN" : "ODD";
// System.out.println(type);
// }
// }

// public class Conditional_Statements {
// public static void main(String[] args) {
// int valuse = (5 > 3) ? 5 : 8;
// System.out.println(valuse);
// }
// }

// public class Conditional_Statements {
// public static void main(String[] args) {
// int marks = 29;
// String value = marks >= 30 ? "Pass" : "Fail";
// System.out.println(value);
// }
// }

// /// /// /// Switch Statement
// public class Conditional_Statements {
// public static void main(String[] args) {
// Scanner scnr = new Scanner(System.in);
// int days = scnr.nextInt();
// switch (days) {
// case 1:
// System.out.println("Sunday");
// break;
// case 2:
// System.out.println("Monday");
// break;
// case 3:
// System.out.println("Teusday");
// break;
// case 4:
// System.out.println("Wensday");
// break;
// case 5:
// System.out.println("Thrustday");
// break;
// case 6:
// System.out.println("Friday");
// break;
// default:
// System.out.println("Sturday");
// break;
// }
// }
// }

// // // Calculatore
// public class Conditional_Statements {
// public static void main(String[] args) {
// Scanner scnr = new Scanner(System.in);
// int num1 = scnr.nextInt();
// int num2 = scnr.nextInt();
// char oparatore = scnr.next().charAt(0);
// switch (oparatore) {
// case '+':
// System.out.println(num1 + num2);
// break;
// case '-':
// System.out.println(num1 - num2);
// break;
// case '*':
// System.out.println(num1 * num2);
// break;
// case '/':
// System.out.println(num1 / num2);
// break;
// case '%':
// System.out.println(num1 % num2);
// break;
// default:
// System.out.println("Wrong Guess Please try again");
// break;
// }
// }
// }
