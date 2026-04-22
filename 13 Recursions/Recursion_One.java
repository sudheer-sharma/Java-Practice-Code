// // // // Decreasing Order
// public class Recursion_One {

//     public static void printDc(int n) {
//         if (n == 1) {
//             System.out.println(1);
//             return;
//         }
//         System.out.print(n + " ");
//         printDc(n - 1);
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         printDc(n);
//     }
// }
//
//
// // // // // Increasing Order
// public class Recursion_One {
//     public static void increasingOrd(int n) {
//         if (n == 1) {
//             System.out.print(n + " ");
//             return;
//         }
//         increasingOrd(n - 1);
//         System.out.print(n + " ");
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         increasingOrd(n);
//     }
// }
// // // // // Factorial
// public class Recursion_One {
//     public static int printDec(int n) {
//         if (n == 1) {
//             return 1;
//         }
//         int fn = n * printDec(n - 1);
//         return fn;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(printDec(n));
//     }
// }
// //
// //
// //
// // // // // Print Sum Natural Number
// public class Recursion_One {
//     public static int sumNaturalNum(int n) {
//         if (n == 1) {
//             return 1;
//         }
//         int fn = n + sumNaturalNum(n - 1);
//         return fn;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(sumNaturalNum(n));
//     }
// }
//
//
//
// // // // Fibonachi sieres
// public class Recursion_One {
//     public static int febunachi(int n) {
//         if (n == 0 || n == 1) {
//             return n;
//         }
//         int fn1 = febunachi(n - 1);
//         int fn2 = febunachi(n - 2);
//         int fn = fn1 + fn2;
//         return fn;
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println(febunachi(n));
//         // System.out.println(febunachi(23));
//         // System.out.println(febunachi(24));
//         // System.out.println(febunachi(25));
//         // System.out.println(febunachi(26));
//         // System.out.println(febunachi(27));
//     }
// }
//
// 
// // // Check given array sorted or not
// public class Recursion_One {
//     public static boolean sortesdArr(int arr[], int i) {
//         if (i == arr.length - 1) {
//             return true;
//         }
//         if (arr[i] > arr[i + 1]) {
//             return false;
//         }
//         return sortesdArr(arr, i + 1);
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5, 6};
//         System.out.println(sortesdArr(arr, 0));
//     }
// }
// 
//
//
// // // // // sort first Occurence
// public class Recursion_One {
//     public static int firstOccurence(int arr[], int key, int i) {
//         if (i == arr.length - 1) {
//             return -1;
//         }
//         if (arr[i] == key) {
//             return i;
//         }
//         return firstOccurence(arr, key, i + 1);
//     }
//     public static void main(String[] args) {
//         int arr[] = {8, 3, 6, 9, 4, 10, 2, 5, 3, 8, 1, 5};
//         int key = 5;
//         System.out.println(firstOccurence(arr, key, 0));
//     }
// }
//
//
//
// // // // sort Last Occurence
// public class Recursion_One {
//     public static int lastOccurence(int arr[], int key, int i) {
//         if (i == arr.length) {
//             return -1;
//         }
//         int isFound = lastOccurence(arr, key, i + 1);
//         if (isFound == -1 && arr[i] == key) {
//             return i;
//         }
//         // if (arr[i] == key) {
//         //     return i;
//         // }
//         return isFound;
//     }
//     public static void main(String[] args) {
//         int arr[] = {8, 3, 6, 9, 4, 10, 2, 5, 3, 8, 1, 5, 3, 7, 6};
//         int key = 5;
//         System.out.println(lastOccurence(arr, key, 0));
//     }
// }
//
//
// // // // // sort Last Occurence
// public class Recursion_One {
//     public static int power(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         // int xmn1 = power(x, n - 1);
//         // int fn = x * xmn1;
//         // return fn;
//         return x * power(x, n - 1);
//     }
//     public static void main(String[] args) {
//         System.out.println(power(8, 10));
//     }
// }
//
//
//
// // // // Print x^n in O(log N)
// public class Recursion_One {

//     public static int optimizedeCode(int a, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         int halfPower = optimizedeCode(a, n / 2);
//         int halfPowerSqr = halfPower * halfPower;

//         if (n % 2 != 0) {
//             halfPowerSqr = a * halfPowerSqr;
//         }
//         return halfPowerSqr;
//     }

//     public static void main(String[] args) {
//         int a = 2;
//         int n = 10;
//         System.out.println(optimizedeCode(a, n));
//     }
// }
