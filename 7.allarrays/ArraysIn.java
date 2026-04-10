// import java.util.*;

// public class ArraysIn {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int marks[] = new int[100];
// System.out.println("Array lenght : " + marks.length);
// marks[0] = sc.nextInt(); // phy
// marks[1] = sc.nextInt(); // chemi
// marks[2] = sc.nextInt(); // math
// System.out.println("Phy : " + marks[0]);
// System.out.println("chemi : " + marks[1]);
// System.out.println("math : " + marks[2]);
// // marks[2] = 100;
// // System.out.println("math : " + marks[2]);
// // marks[2] = marks[2] + 1;
// // System.out.println("math : " + marks[2]);
// int totalAVG = (marks[0] + marks[1] + marks[2]) / 3;
// System.out.println("Total AVG : " + totalAVG + "%");
// }
// }
// // passing array as a argument
// public class ArraysIn {
// public static void updatemarks(int markss[]) {
// for (int i = 0; i < markss.length; i++) {
// markss[i] = markss[i] + 5;
// System.out.println(markss[i]);
// }
// }
// public static void main(String[] args) {
// int markss[] = { 45, 55, 65 };
// updatemarks(markss);
// for (int i = 0; i < markss.length; i++) {
// System.out.println(markss[i]);
// }
// }
// }
// // Linear Search
// public class ArraysIn {
// public static int linearSearch(int numbers[], int key) {
// for (int i = 0; i < numbers.length; i++) {
// if (numbers[i] == key) {
// return i;
// }
// }
// return -1;
// }
// public static void main(String[] args) {
// int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
// int key = 18;
// int index = linearSearch(numbers, key);
// if (index == -1) {
// System.out.println("Key is not found");
// } else {
// System.out.println("Key is of index : " + index);
// }
// }
// }
// // string type
// public class ArraysIn {
// public static int strinvau(String values[], String kay) {
// for (int i = 0; i < values.length; i++) {
// if (values[i].equals(kay)) {
// return i;
// }
// }
// return -1;
// }
// public static void main(String[] args) {
// String values[] = { "aaaaa", "bbbbb", "ccccc", "ddddd", "eeeee", "fffff",
// "ggggg" };
// String key = "eeeee";
// int index = strinvau(values, key);
// if (index == -1) {
// System.out.println("Not found");
// } else {
// System.out.println("kay od imdex : " + index);
// }
// }
// }
// // // Largest values
// public class ArraysIn {
// public static int getLargeVal(int numbers[]) {
// int largest = Integer.MIN_VALUE; // infinity
// for (int i = 0; i < numbers.length; i++) {
// if (largest < numbers[i]) {
// largest = numbers[i];
// }
// }
// return largest;
// }
// public static void main(String[] args) {
// int numbers[] = { 5, 45, 3, 67, 122, 4, 1, 4 };
// int nums = getLargeVal(numbers);
// System.out.println("larget values : " + nums);
// System.out.println("larget values : " + getLargeVal(numbers));
// }
// }
// // Baniry Search
// public class ArraysIn {
// public static int binarySearch(int bnrNum[], int kay) {
// int start = 0, end = bnrNum.length - 1;
// while (start <= end) {
// int mid = (start + end) / 2;
// // // Comparison
// if (bnrNum[mid] == kay) {
// return mid;
// }
// if (bnrNum[mid] < kay) {
// start = mid + 1; // Right
// } else { // Left
// end = mid - 1;
// }
// }
// return -1;
// }
// public static void main(String[] args) {
// int bnrNum[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
// int key = 18;
// System.out.println("index for key is : " + binarySearch(bnrNum, key));
// }
// }
// // // Reverse Array Number
// public class ArraysIn {
// public static void reveseNum(int numbers[]) {
// int start = 0, last = numbers.length - 1;
// while (start < last) {
// int temp = numbers[last];
// numbers[last] = numbers[start];
// numbers[start] = temp;
// start++;
// last--;
// }
// }
// public static void main(String[] args) {
// int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
// reveseNum(numbers);
// for (int i = 0; i < numbers.length; i++) {
// System.out.print(numbers[i] + " ");
// }
// System.out.println();
// }
// }
// // Reverse second Type Quesion
// public class ArraysIn {
// public static void reversNums(int numbers[]) {
// int start = 0, last = numbers.length - 1;
// while (start < last) {
// int temp = numbers[last];
// numbers[last] = numbers[start];
// numbers[start] = temp;
// start++;
// last--;
// }
// }
// public static void main(String[] args) {
// int numbers[] = new int[1000];
// for (int i = 0; i < 1000; i++) {
// numbers[i] = i + 1;
// }
// reversNums(numbers);
// for (int j = 0; j < numbers.length; j++) {
// System.out.print(numbers[j] + " ");
// }
// // System.out.println();
// }
// }
// // Pairs in an Array
// public class ArraysIn {
// public static void pairsNum(int numbers[]) {
// for (int i = 0; i < numbers.length; i++) {
// int curr = numbers[i];
// // System.out.print(curr + " ");
// for (int j = i; j < numbers.length; j++) {
// System.out.print("(" + curr + "," + numbers[j] + ")");
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// int numbers[] = { 2, 4, 6, 8, 10 };
// pairsNum(numbers);
// }
// }
// // // Print Subarrays
// public class ArraysIn {

//     public static void printSubarray(int numbers[]) {
//         for (int i = 0; i < numbers.length; i++) {
//             int first = i;
//             for (int j = i; j < numbers.length; j++) {
//                 int last = j;
//                 for (int k = first; k <= last; k++) {
//                     System.out.print(numbers[k] + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         printSubarray(numbers);
//     }
// }
