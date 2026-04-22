// import java.util.*;

// public class Functions {
// public static void PrintName() {
// System.out.println("Kailash Shiwagma");
// System.out.println("Kailash Shiwagma");
// System.out.println("Kailash Shiwagma");
// System.out.println("Kailash Shiwagma");
// System.out.println("Kailash Shiwagma");
// }

// public static void calculator() {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int sum = a + b;
// System.out.println(a + b);
// }

// public static int newCalculatore(int num1, int num2) {
// int sum = num1 + num2;
// return sum;
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int sum = newCalculatore(a, b);
// System.out.println("Sum Number : " + sum);
// }

// // // Call by Value

// public static void swap(int a, int b) {
// int temp = a;
// a = b;
// b = temp;
// System.out.println("a : " + a);
// System.out.println("b : " + b);
// }

// public static void main(String[] args) {
// int a = 8;
// int b = 5;
// swap(a, b);
// System.out.println("a : " + a);
// System.out.println("b : " + b);

// // int temp = a;
// // a = b;
// // b = temp;
// // System.out.println("a : " + a);
// // System.out.println("b : " + b);
// }

// // // Find product A or B
// public static int product(int a, int b) {
// int mult = a * b;
// return mult;
// }
// public static void main(String[] args) {
// int a = 8;
// int b = 8;
// int multi = product(a, b);
// System.out.println(multi);
// }

// // // Factorial of 4
// public static int Factoraial(int n) {
// int f = 1;
// for (int i = 1; i <= n; i++) {
// f = f * i;
// // System.out.println(f);
// }
// return f;
// }
// public static void main(String[] args) {
// System.out.println(Factoraial(7));
// }
// }

// // // Binomial Cofficeient
// public class Functions {

// public static int Factoraial(int n) {
// int f = 1;
// for (int i = 1; i <= n; i++) {
// f = f * i;
// // System.out.println(f);
// }
// return f;
// }

// public static int BinoCoff(int n, int r) {
// int fack_n = Factoraial(n);
// int fack_r = Factoraial(r);
// int twoBinomialCoff = (n - r);

// int totalCoffi = fack_n / (fack_r * twoBinomialCoff);

// return totalCoffi;
// }
// public static void main(String[] args) {
// // System.out.println(Factoraial(5));
// System.out.println(BinoCoff(7, 3));
// }
// }

// // // // // // // Function Overloading
// // // // Using Parameter
// public class Functions {
// // // function to calculate sum of 2 num
// public static int sum(int a, int b) {
// return a + b;
// }

// // // function to calculate sum of 3 num
// public static int sum(int a, int b, int c) {
// return a + b + c;
// }

// // // function to calculate sum of 4 num
// public static int sum(int a, int b, int c, int d) {
// return a + b + c + d;
// }

// // // // Using Data Type
// public class Functions {
// // // function to calculate int sum of 2 num
// public static int sum(int a, int b) {
// return a + b;
// }

// // // function to calculate Float sum of 3 num
// public static float sum(float a, float b, float c) {
// return a + b + c;
// }

// public static void main(String[] args) {
// System.out.println(sum(8, 5));
// System.out.println(sum(5.3f, 5.6f, 2.5f));
// // System.out.println(sum(3, 5, 9, 2));
// }
// }

// // // // // // Check if Number Prime Or Not
// public class Functions {
// public static boolean isPrime(int n) {
// boolean isPrime = true;
// for (int i = 2; i <= n - 1; i++) {
// if (n % i == 0) {
// isPrime = false;
// break;
// }
// }
// return isPrime;
// }

// // // // // Check Prime (Optimrsed)
// public class Functions {
// public static boolean isPrime(int n) {
// if (n == 2) {
// return true;
// }
// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// return false;
// }
// }
// return true;
// }
// public static void main(String[] args) {
// System.out.println(isPrime(10));
// }
// }

// // // // // Check Prime Number Renge
// public class Functions {
// public static boolean isPrime(int n) {
// if (n == 2) {
// return true;
// }
// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// return false;
// }
// }
// return true;
// }

// public static void primeRange(int n) {
// for (int i = 2; i <= n; i++) {
// if (isPrime(i)) {
// System.out.print(i + " ");
// }
// }
// }

// public static void main(String[] args) {
// primeRange(100);
// }
// }

// // // // Convert Binary to Decimal
// public class Functions {
// public static void binToDeci(int binNum) {
// int myNum = binNum;
// int pow = 0;
// int decNum = 0;
// while (binNum > 0) {
// int lastDigit = binNum % 10;
// decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
// pow++;
// binNum = binNum / 10;
// }
// System.out.println("Desimal " + myNum + " = " + decNum);
// }

// public static void main(String[] args) {
// binToDeci(110);
// }
// }

// // // // Convert Decimal to Binary
// public class Functions {
// public static void DeciToBin(int n) {
// int MyDecNum = n;
// int pow = 0;
// int BinNum = 0;
// while (n > 0) {
// int rem = n % 2;
// BinNum = BinNum + rem * (int) (Math.pow(10, pow));
// pow++;
// n = n / 2;
// }
// System.out.println("Decima " + MyDecNum + " = " + BinNum);
// }

// public static void main(String[] args) {
// DeciToBin(5);
// }
// }

// // // // // // Scope
// // // Method Scope

// // // // // // Q // // // // // // //
// Question 1 : Write a Java method to compute the average of three numbers..

// public class Functions {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("First number : ");
// int x = sc.nextInt();
// System.out.print("Second number : ");
// int y = sc.nextInt();
// System.out.print("Third number : ");
// int z = sc.nextInt();

// int total = (x + y + z) / 3;
// System.out.println("Total Avarage : " + total);
// }
// }

// // Question 2 : Write a method named isEven that accepts an int argument. The
// method should return true if the argument is even, or alse otherwise. Also
// write a program to test your method.

// public class Functions {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num;

// System.out.print("Enter a Integer : ");
// num = sc.nextInt();

// if (isEven(num)) {
// System.out.println("Number is Even");
// } else {
// System.out.println("Number is Not Even");
// }
// }
// public static boolean isEven(int number) {
// if (number % 2 == 0) {
// return true;
// } else {
// return false;
// }
// }
// }

// Question 3 : Write a Java program to check if a number is a palindrome in
// Java? ( 121 is a palindrome, 321 is not) A number is called a palindrome if
// the number is equal to the reverse of a number e.g., 121 is a palindrome
// because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321.

// public class Functions {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int palindrome = sc.nextInt();
// if (isPelindrom(palindrome)) {
// System.out.println("this is pelindrom : " + palindrome);
// } else {
// System.out.println("this is not pelindrom : " + palindrome);
// }
// }

// public static boolean isPelindrom(int number) {
// int palindrome = number;
// int reverse = 0;
// while (palindrome != 0) {
// int remender = palindrome % 10;
// reverse = reverse * 10 + remender;
// palindrome = palindrome / 10;
// }
// if (number == reverse) {
// return true;
// } else {
// return false;
// }
// }
// }