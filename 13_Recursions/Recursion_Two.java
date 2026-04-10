
// public class Recursion_Two {
//     public static int tilingProblem(int n) { //2 x n (floor size)
//         if (n == 0 || n == 1) {
//             return 1;
//         }
//         // Vertical 
//         int fnm1 = tilingProblem(n - 1);
//         // Horizontal
//         int fnm2 = tilingProblem(n - 2);
//         int fn = fnm1 + fnm2;
//         return fn;
//     }
//     public static void main(String[] args) {
//         System.out.println(tilingProblem(4));
//     }
// }
//
//
//
// // // Remove Duplicates is a String
// public class Recursion_Two {
//     public static void removeDuplicate(String str, int idx, StringBuilder newstr, boolean map[]) {
//         if (idx == str.length()) {
//             System.out.println(newstr);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if (map[currChar - 'a'] == true) {
//             removeDuplicate(str, idx + 1, newstr, map);
//         } else {
//             map[currChar - 'a'] = true;
//             removeDuplicate(str, idx + 1, newstr.append(currChar), map);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "appnnacollege";
//         removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
//     }
// }
//
//
//
// // // // // Friends Pairing
// public class Recursion_Two {
//     public static int friendsPairing(int n) {
//         if (n == 1 || n == 2) {
//             return n;
//         }
//         //choice
//         // single
//         int fnm1 = friendsPairing(n - 1);
//         // Pair
//         int fnm2 = friendsPairing(n - 2);
//         int newtway = (n - 1) * fnm2;
//         // totWays
//         int totways = fnm1 + newtway;
//         return totways;
//     }
//     public static void main(String[] args) {
//         System.out.println(friendsPairing(3));
//     }
// }
//
//
//
// // // // // Binary String Problem Code    Consecutive one
// public class Recursion_Two {
//     public static void printBinString(int n, int lastPlace, String str) {
//         if (n == 0) {
//             System.out.println(str);
//             return;
//         }
//         printBinString(n - 1, 0, str + "0");
//         if (lastPlace == 0) {
//             printBinString(n - 1, 1, str + "1");
//         }
//     }
//     public static void main(String[] args) {
//         printBinString(5, 0, "");
//     }
// }
//
// // // // // Binary String Problem Code    Consecutive zero
// public class Recursion_Two {

//     public static void printBinString(int n, int lastPlace, String str) {
//         if (n == 0) {
//             System.out.println(str);
//             return;
//         }

//         printBinString(n - 1, 1, str + "1");
//         if (lastPlace == 1) {
//             printBinString(n - 1, 0, str + "0");
//         }
//     }

//     public static void main(String[] args) {
//         printBinString(5, 0, "");
//     }
// }
