
// import java.util.*;

// // // // // 2D Array
// public class arrays2dIn {
//     public static void main(String[] args) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length, m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//
// // // // Search 2D Array
// public class arrays2dIn {
//     public static boolean search(int matrix[][], int key) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == key) {
//                     System.out.println("Found cell (" + i + "," + j + ")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("Key not found");
//         return false;
//     }
//     public static void main(String[] args) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length, m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         search(matrix, 18);
//     }
// }
//
//
// // // // Spiral Matrix
// public class arrays2dIn {
//     public static void printSpiral(int matrix[][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length - 1;
//         int endCol = matrix[0].length - 1;
//         while (startRow <= endRow && startCol <= endCol) {
//             // // Top
//             for (int j = startCol; j <= endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }
//             // // Right
//             for (int i = startRow + 1; i <= endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }
//             // // Buttom
//             for (int j = endCol - 1; j >= startCol; j--) {
//                 if (startCol == endCol) {
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             }
//             // // Left
//             for (int i = endRow - 1; i >= startRow + 1; i--) {
//                 if (startRow == endRow) {
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol] + " ");
//             }
//             startRow++;
//             startCol++;
//             endRow--;
//             endCol--;
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//         printSpiral(matrix);
//     }
// }
//
//
//
// // // // Spiral Matrix Diagonal Sum
// public class arrays2dIn {
//     public static void diagonalSum(int matrix[][]) {
//         int sum = 0;
//         // for (int i = 0; i < matrix.length; i++) {
//         //     for (int j = 0; j < matrix[0].length; j++) {
//         //         if (i == j) {
//         //             sum += matrix[i][j];
//         //         } else if (i + j == matrix.length - 1) {
//         //             sum += matrix[i][j];
//         //         }
//         //     }
//         // }
//         for (int i = 0; i < matrix.length; i++) {
//             sum += matrix[i][i];
//             if (i != matrix.length - i - 1) {
//                 sum += matrix[i][matrix.length - i - 1];
//             }
//         }
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//         diagonalSum(matrix);
//     }
// }
//
//
//
// // // // // Search in sorted matrix
// public class arrays2dIn {
//     public static boolean searchStairMatrix(int matrix[][], int key) {
//         int row = 0, col = matrix[0].length - 1;
//         while (row < matrix.length && col >= 0) {
//             if (matrix[row][col] == key) {
//                 System.out.println("Found Value (" + row + "," + col + ")");
//                 return true;
//             } else if (key < matrix[row][col]) {
//                 col--;
//             } else {
//                 row++;
//             }
//         }
//         System.out.println("Key not found!");
//         return false;
//     }
//     public static void main(String[] args) {
//         int matrix[][] = {
//             {10, 20, 30, 40},
//             {15, 25, 35, 45},
//             {27, 29, 37, 47},
//             {32, 33, 39, 50}};
//         int key = 37;
//         searchStairMatrix(matrix, key);
//     }
// }
//
//
//
// // // // // // // Q Practice
// // Question 1 : Print the number of 7’s that are in the 2d array.
// public class arrays2dIn {
//     public static void searchArrayNumber(int matrix[][]) {
//         int countArray = 0;
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == 7) {
//                     countArray++;
//                 }
//             }
//         }
//         System.out.println("count number = " + countArray);
//     }
//     public static void main(String[] args) {
//         int matrix[][] = {{4, 7, 8}, {8, 8, 7}};
//         searchArrayNumber(matrix);
//     }
// }
//
//
// // Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
// public class arrays2dIn {
//     public static void main(String[] args) {
//         int nums[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
//         int sum = 0;
//         for (int i = 0; i < nums[0].length; i++) {
//             sum += nums[1][i];
//         }
//         System.out.println("Sum NUmber : " + sum);
//     }
// }
//
//
// // Question 3 : Write a program to Find Transpose of a Matrix.
// public class arrays2dIn {
//     public static void transposeMatrix(int matrix[][]) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int[][] matrix = {{4, 7, 8}, {8, 8, 7}};
//         transposeMatrix(matrix);
//         int row = 2, column = 3;
//         int displyaMatrix[][] = new int[column][row];
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < column; j++) {
//                 displyaMatrix[j][i] = matrix[i][j];
//             }
//         }
//         transposeMatrix(displyaMatrix);
//     }
// }
