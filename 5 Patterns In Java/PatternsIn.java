// *
// * *
// * * *
// * * * *
// public class PatternsIn {
// public static void main(String[] args) {
// for (int i = 1; i <= 25; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("+ ");
// }
// System.out.println();
// }
// }
// }

// * * * *
// * * *
// * *
// *
// public class PatternsIn {
// public static void main(String[] args) {
// for (int i = 10; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }
// A
// B C
// D E F
// G H I J
// public class PatternsIn {
// public static void main(String[] args) {
// char ch = 'A';
// int n = 1;
// for (int i = 0; i <= 6; i++) {
// for (int j = 0; j <= i; j++) {
// // System.out.print(ch);
// System.out.print(n);
// // ch++;
// n++;
// }
// System.out.println();
// }
// }
// }
// // * * * * * *
// // * / / / / *
// // * / / / / *
// // * * * * * *
// public class PatternsIn {
// public static void hollo_patterns(int tolRows, int tolCols) {
// // // tolRows
// for (int i = 1; i <= tolRows; i++) {
// // // tolCols
// for (int j = 1; j <= tolCols; j++) {
// if (i == 1 || i == tolRows || j == 1 || j == tolCols) {
// System.out.print(" *");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// hollo_patterns(10, 10);
// }
// }
// // * * * * * * * * * *
// // * - * - - - - * - *
// // * * * * * * * * * *
// // * - * - - - - * - *
// // * - * - - - - * - *
// // * - * - - - - * - *
// // * - * - - - - * - *
// // * * * * * * * * * *
// // * - * - - - - * - *
// // * * * * * * * * * *
// public class PatternsIn {
// public static void hollo_patterns(int tolRows, int tolCols) {
// // // tolRows
// for (int i = 1; i <= tolRows; i++) {
// // // tolCols
// for (int j = 1; j <= tolCols; j++) {
// if (i == 1 || i == tolRows || j == 1 || j == tolCols) {
// System.out.print(" *");
// } else if (i == 3 || i == tolRows - 2 || j == 3 || j == tolCols - 2) {
// System.out.print(" *");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// hollo_patterns(10, 10);
// }
// }
// ----*
// ---**
// --***
// -****
// *****
// public class PatternsIn {
// public static void PatternsInjava(int n) {
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// PatternsInjava(5);
// }
// }
// * * * * *
// - * * * *
// - - * * *
// - - - * *
// - - - - *
// public class PatternsIn {
// public static void PatternsInjava(int n) {
// for (int i = n; i >= 1; i--) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// PatternsInjava(5);
// }
// }
// // ------* * * * * *
// // -----* * * * * *
// // ----* * * * * *
// // ---* * * * * *
// // --* * * * * *
// // -* * * * * *
// // * * * * * *
// public class PatternsIn {
// public static void PatternsInjava(int n, int b) {
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= b; j++) {
// System.out.print(" *");
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// PatternsInjava(10, 7);
// }
// }
// ------* * * * * *
// -----* - - - - *
// ----* - - - - *
// ---* - - - - *
// --* - - - - *
// -* - - - - *
// * * * * * *
// public class PatternsIn {
// public static void PatternsInjava(int n, int b) {
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= b; j++) {
// if (i == 1 || i == n || j == 1 || j == b) {
// System.out.print(" *");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// PatternsInjava(10, 7);
// }
// }
// ------*
// ---- * *
// --- * * *
// -- * * * *
// - * * * * *
// -* * * * * *
// - * * * * *
// -- * * * *
// ---- * *
// ------*
// public class PatternsIn {
//     public static void PatternsInjava(int n) {
// // First Patterns
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" "); // Space
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" *"); // Stars
//             }
//             System.out.println(); // Next Line
//         }
// // Second Patterns
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" "); // Space
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" *"); // Stars
//             }
//             System.out.println(); // Next Line
//         }
//     }
//     public static void main(String[] args) {
//         PatternsInjava(550);
//     }
// }
//
//
//
//
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
// public class PatternsIn {
// public static void newPatternIn(int n) {
// for (int i = n; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// newPatternIn(50);
// }
// }
//
//
//
//
//
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14
// public class PatternsIn {
// public static void newPatternIn(int n) {
// int counter = 1;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(counter + " ");
// counter++;
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// newPatternIn(5);
// }
// }
//
//
//
//
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
// 0 1 0 1 0 1
// public class PatternsIn {
// public static void newPatternIn(int n) {
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// if ((i + j) % 2 == 0) {
// System.out.print("1 ");
// } else {
// System.out.print("0 ");
// }
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// newPatternIn(7);
// }
// }
//
//
//
//
// * ------- *
// ** ----- **
// *** --- ***
// **** - ****
// ***********
// ***********
// **** - ****
// *** --- ***
// ** ----- **
// * ------- *
// public class PatternsIn {
//     public static void butterfly(int n) {
// // 1 First half
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
// // 2 second half
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         butterfly(550);
//     }
// }
//
//
//
//
// public class PatternsIn {
//     public static void patternPrint(int n) {
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         patternPrint(n);
//     }
// }
public class PatternsIn {

    public static void patternPrint(int n) {
    }

    public static void main(String[] args) {
        for (int row = 10; row > 0; row--) {
            for (int col = row; col < 10; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
