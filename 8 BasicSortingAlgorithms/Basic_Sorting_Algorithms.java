// import java.util.*;
// // // Bubble Sorting
// public class Basic_Sorting_Algorithms {
//     public static void bubbleSort(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }
//     public static void printsort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {9, 5, 4, 1, 3, 2, 7, 3, 4, 0};
//         bubbleSort(arr);
//         printsort(arr);
//     }
// }
//
//
//
// // Selection Sort
// public class Basic_Sorting_Algorithms {
//     public static void selectioSort(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             int firstSort = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[firstSort] < arr[j]) {
//                     firstSort = j;
//                 }
//             }
//             int temp = arr[firstSort];
//             arr[firstSort] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void printSelectionSort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {9, 10, 5, 4, 1, 3, 2, 6, 7, 3, 4, 0};
//         selectioSort(arr);
//         printSelectionSort(arr);
//     }
// }
//
//
//
// // Insertion Sort
// public class Basic_Sorting_Algorithms {
//     public static void insortionSort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             int curr = arr[i];
//             int prev = i - 1;
//             while (prev >= 0 && arr[prev] > curr) {
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
//             arr[prev + 1] = curr;
//         }
//     }
//     public static void printInsertion(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {9, 10, 5, 4, 1, 3, 2, 6, 7, 3, 4, 0};
//         insortionSort(arr);
//         printInsertion(arr);
//     }
// }
//
//
//
// // Array method from sort
// import java.util.Arrays;
// public class Basic_Sorting_Algorithms {
// // // // // // Asending Order
//     // public static void printArr(int arr[]) {
//     //     for (int i = 0; i < arr.length; i++) {
//     //         System.out.print(arr[i] + " ");
//     //     }
//     // }
//     // public static void main(String[] args) {
//     //     int arr[] = {9, 10, 5, 4, 1, 3, 2, 6, 7, 3, 4, 0};
//     //     Arrays.sort(arr);
//     //     // Arrays.sort(arr, 0, 6);
//     //     printArr(arr);
//     // }
//     //
//     //
//     //
//     // // // // // // Desending Order
//     public static void printArr(Integer arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         Integer arr[] = {9, 10, 5, 4, 1, 3, 2, 6, 7, 3, 4, 0};
//         Arrays.sort(arr, Collections.reverseOrder());
//         // Arrays.sort(arr, 0, 6, Collections.reverseOrder());
//         printArr(arr);
//     }
// }
//
//
//
// // // // // Counting Sort
// public class Basic_Sorting_Algorithms {
//     public static void countingSort(int arr[]) {
//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             largest = Math.max(largest, arr[i]);
//             // System.out.print(largest + " ");
//         }

//         int count[] = new int[largest + 1];
//         for (int i = 0; i < arr.length; i++) {
//             count[arr[i]]++;
//         }
//         // // sorting
//         int j = 0;
//         for (int i = 0; i < count.length; i++) {
//             while (count[i] > 0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }
//     public static void printCount(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {0, 9, 10, 6, 5, 4, 1, 3, 2, 9, 6, 7, 3, 4, 0, 3, 1, 2};
//         countingSort(arr);
//         printCount(arr);
//     }
// }
//
//
//
//
//
// // // // // // // // BASIC SORTING QUESTIONS
// // // // //  QUESTIONS PRACTICE
// // // // A. Bubble Sort
// public class Basic_Sorting_Algorithms {
//     public static void bubbleSort(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - 1 - i; j++) {
//                 if (arr[j] < arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }
//     public static void printbublesort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {0, 9, 10, 6, 5, 4, 1, 3, 2, 9, 6, 7, 3, 4, 0, 3, 1, 2};
//         bubbleSort(arr);
//         printbublesort(arr);
//     }
// }
//
//
//
//
// // // // // B. Selection Sort
// public class Basic_Sorting_Algorithms {
//     public static void selectionSort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             int firstSort = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[firstSort] < arr[j]) {
//                     firstSort = j;
//                 }
//             }
//             int temp = arr[firstSort];
//             arr[firstSort] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void printSelectionSort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {0, 9, 10, 6, 5, 4, 1, 3, 2, 9, 6, 7, 3, 4, 0, 3, 1, 2};
//         selectionSort(arr);
//         printSelectionSort(arr);
//     }
// }
//
//
//
//
// // // // // C. Insertion Sort
// public class Basic_Sorting_Algorithms {
//     public static void insertionSort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             int curr = arr[i];
//             int prev = i - 1;
//             while (prev >= 0 && arr[prev] >= curr) {
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
//             arr[prev + 1] = curr;
//         }
//     }
//     public static void perintInsertionSort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {0, 9, 10, 6, 5, 4, 1, 3, 2, 9, 6, 7, 3, 4, 0, 3, 1, 2};
//         insertionSort(arr);
//         perintInsertionSort(arr);
//     }
// }
//
//
//
//
//
// // // // // // // D. Counting Sort
// public class Basic_Sorting_Algorithms {
//     public static void countingSort(int arr[]) {
//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             largest = Math.max(largest, arr[i]);
//         }
//         int count[] = new int[largest + 1];
//         for (int i = 0; i < arr.length; i++) {
//             count[arr[i]]++;
//         }
//         int j = 0;
//         for (int i = 0; i < count.length; i++) {
//             while (count[i] > 0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }
//     public static void printCountingSort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {0, 9, 10, 6, 5, 4, 1, 3, 2, 9, 6, 7, 3, 4, 0, 3, 1, 2};
//         countingSort(arr);
//         printCountingSort(arr);
//     }
// }
//
//
//
//
//
//
// import java.util.Arrays;
// // import java.util.Collections;

// public class Basic_Sorting_Algorithms {

//     public static void mathodArrayShort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {0, 9, 10, 6, 5, 4, 1, 3, 2, 9, 6, 7, 3, 4, 0, 3, 1, 2};
//         Arrays.sort(arr);
//         // // Arrays.sort(arr, 0, 10);
//         mathodArrayShort(arr);
//     }
// }
