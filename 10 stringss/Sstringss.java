
// import java.util.*;

// public class Sstringss {
//     public static void printLatter(String fulName) {
//         for (int i = 0; i < fulName.length(); i++) {
//             System.out.print(fulName.charAt(i) + " ");
//         }
//     }
//     public static void main(String[] args) {
//         // char arr[] = {'a', 'b', 'c', 'd', 'e', 'f'};
//         // String str1 = "Kailash";
//         // String str2 = new String("Shiwagma Kailash@123456");
//         // Scanner sc = new Scanner(System.in);
//         // String name;
//         // name = sc.nextLine();
//         // System.out.println(name);
//         // // // 
//         // String fullName = "Sudheer kaislah";
//         // System.out.println(fullName.length());
//         // //
//         // // Concatenation
//         String firstName = "Kailash";
//         String lastName = "Shiwagma";
//         String fulName = firstName + " " + lastName;
//         // System.out.println(fulName);
//         // System.out.println(firstName + " " + lastName);
//         // //
//         // System.out.println(firstName.charAt(3));
//         // // 
//         printLatter(fulName);
//     }
// }
//
//
//
// // // // // Pelindrome
// public class Sstringss {
//     public static boolean checkPelindrom(String str) {
//         for (int i = 0; i < str.length() / 2; i++) {
//             int n = str.length();
//             if (str.charAt(i) != str.charAt(n - i - 1)) {
//                 System.out.println("This is not pelindrome (" + str + ")");
//                 return false;
//             }
//         }
//         System.out.println("This is pelindrome (" + str + ")");
//         return true;
//     }
//     public static void main(String[] args) {
//         String str = "noons";
//         System.out.println(checkPelindrom(str));
//     }
// }
//
//
//
// public class Sstringss {
//     public static void sortedPath(String path) {
//         int x = 0, y = 0;
//         for (int i = 0; i < path.length(); i++) {
//             // System.out.print(path.charAt(i) + " ");
//             char dir = path.charAt(i);
//             // South
//             if (dir == 'S') {
//                 y--;
//                 // Nourth    
//             } else if (dir == 'N') {
//                 y++;
//                 // East    
//             } else if (dir == 'E') {
//                 x++;
//                 // West    
//             } else if (dir == 'W') {
//                 x--;
//             }
//         }
//         System.out.println(x);
//         System.out.println(y);
//         int ans = ((x * x) + (y * y));
//         System.out.println(ans);
//         System.out.println(Math.sqrt(ans));
//     }
//     public static void main(String[] args) {
//         // String path = "WNEENESENNN";
//         String path = "NS";
//         sortedPath(path);
//     }
// }
//
//
//
// public class Sstringss {
//     public static void main(String[] args) {
//         String s1 = "kailash";
//         String s2 = "kailash";
//         String s3 = new String("kailash");
//         System.out.println(s1 == s2);
//         System.out.println(s1 == s3);
//         System.out.println(s1.equals(s3));
//     }
// }
//
//
//
// public class Sstringss {
//     public static void substringSort(String str, int si, int ei) {
//         String allChar = "";
//         for (int i = si; i < ei; i++) {
//             allChar += str.charAt(i);
//         }
//         System.out.println(allChar);
//     }
//     public static void main(String[] args) {
//         String str = "calligraphy";
//         System.out.println(str.substring(5, 8));
//         // substringSort(str, 2, 5);
//         substringSort(str.comp);
//     }
// }
//
//
//
// public class Sstringss {
//     public static void main(String[] args) {
//         String fruits[] = {"apple", "mango", "banana"};
//         String largest = fruits[0];
//         for (int i = 0; i < fruits.length; i++) {
//             if (largest.compareToIgnoreCase(fruits[i]) < 0) {
//                 largest = fruits[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }
//
//
//
// // // // String Builder
// public class Sstringss {
//     public static void main(String[] args) {
//         StringBuilder str = new StringBuilder("");
//         for (char ch = 'A'; ch <= 'Z'; ch++) {
//             str.append(ch);
//         }
//         System.out.println(str);
//         System.out.println(str.length());
//     }
// }
//
//
//
// // // // "hi i am kailash"  it's string of first letter convert to capital letter
// public class Sstringss {
//     public static void toUpperCase(String str) {
//         StringBuilder sb = new StringBuilder("");
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for (int i = 1; i < str.length(); i++) {
//             if (str.charAt(i) == ' ' && i < str.length() - 1) {
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             } else {
//                 sb.append(str.charAt(i));
//             }
//         }
//         System.out.println(sb);
//     }
//     public static void main(String[] args) {
//         String str = "hi, am kailash and you";
//         toUpperCase(str);
//     }
// }
//
//
// // // // String Compression  "aaabbcccdd" to "a3b2c3d2"
// public class Sstringss {
//     public static String compress(String str) {
//         String newStr = "";
//         for (int i = 0; i < str.length(); i++) {
//             Integer count = 1;
//             System.out.print(str.charAt(i));
//             while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//                 count++;
//                 i++;
//             }
//             newStr += str.charAt(i);
//             if (count > 1) {
//                 newStr += count.toString();
//             }
//         }
//         return newStr;
//     }
//     public static void main(String[] args) {
//         String str = "aaabbcccdd";
//         System.out.println(compress(str));
//     }
// }
//
//// // // solve from StringBuilder
// public class Sstringss {
//     public static void compresss(String str) {
//         StringBuilder newStr = new StringBuilder("");
//         for (int i = 0; i < str.length(); i++) {
//             // System.out.print(str.charAt(i));
//             Integer count = 1;
//             while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//                 count++;
//                 i++;
//             }
//             newStr.append(str.charAt(i));
//             if (count > 1) {
//                 newStr.append(count.toString());
//             }
//         }
//         System.out.println(newStr);
//     }
//     public static void main(String[] args) {
//         String str = "aaabbcccdd";
//         compresss(str);
//     }
// }
//
//
// // Question 1 : Count how many times lowercase vowels occurred in a String entered by the user.
// public class Sstringss {

//     public static void main(String[] args) {
//         String str = new Scanner(System.in).next();
//         int count = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 count++;
//             }
//         }
//         System.out.println("Count of vowels : " + count);
//     }
// }
//
//
// // Question 2 : What will be the output of the following code?
// public class Sstringss {

//     public static void main(String args[]) {
//         String str = "ShradhaDidi";
//         String str1 = "ApnaCollege";
//         String str2 = "ShradhaDidi";
//         System.out.println(str.equals(str1) + " " + str.equals(str2));
//     }
// }
//
//
// // Question 3 : What will be the output of the following code?
// public class Sstringss {

//     public static void main(String args[]) {
//         String str = "ApnaCollege".replace("l", "");
//         System.out.println(str);
//     }
// }
//
//
// // Question 4 : Determine if 2 Strings are anagrams of each other. What are anagrams?
// If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider race and care. In this case, race's characters can be formed into a study, or care's characters can be formed into race. Below is a java program to check if two strings are anagrams or not.
// public class Sstringss {

//     public static void main(String[] args) {
//         String str1 = "earth";
//         String str2 = "heart";
// //Convert Strings to lowercase. Why? so that we don't have to check separately for ower & uppercase.
//         str1 = str1.toLowerCase();
//         str2 = str2.toLowerCase();
// // First check - if the lengths are the same
//         if (str1.length() == str2.length()) {
// // convert strings into char array
//             char[] str1charArray = str1.toCharArray();
//             char[] str2charArray = str2.toCharArray();
// // sort the char array
//             Arrays.sort(str1charArray);
//             Arrays.sort(str2charArray);
// // if the sorted char arrays are same or identical then the strings are anagram
//             boolean result = Arrays.equals(str1charArray, str2charArray);
//             if (result) {
//                 System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
//             } else {
//                 System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
//             }
//         } else {
// // case when lengths are not equal
//             System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
//         }
//     }
// }
