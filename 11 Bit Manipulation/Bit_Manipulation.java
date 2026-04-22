
// public class Bit_Manipulation {
//     public static void main(String[] args) {
//         // Binary to AND = &
//         // System.out.println((5 & 6));
//         //
//         // Binary to OR = |
//         // System.out.println((5 | 6));
//         //
//         // Binary to XOR = ^
//         // System.out.println((5 ^ 6));
//         //
//         // Binary One's Complement = ~
//         // System.out.println((~5));
//         // System.out.println((~0));
//         // System.out.println((~1));
//         // System.out.println((~10));
//         //
//         // Binary Left Shift = <<
//         System.out.println((5 << 2));
//     }
// }
//
//
// // // // Check Odd and Even
// public class Bit_Manipulation {
//     public static void bitMainpulation(int n) {
//         int BitMainp = 1;
//         if ((n & BitMainp) == 0) {
//             System.out.println("Evenr number");
//         } else {
//             System.out.println("Odd Number");
//         }
//     }
//     public static void main(String[] args) {
//         bitMainpulation(2);
//         bitMainpulation(10);
//         bitMainpulation(11);
//         bitMainpulation(7);
//     }
// }
//
//
//
//  // // // // Get Ith bit
// public class Bit_Manipulation {
//     public static int getBits(int n, int i) {
//         int bitMass = (1 << i);
//         if ((n & bitMass) == 0) {
//             return 0;
//         } else {
//             return 1;
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(getBits(10, 2));
//     }
// }
//
//
// // // // Set Ith bit
// public class Bit_Manipulation {
//     public static int setBits(int n, int i) {
//         int bitMass = (i << 1);
//         return n | bitMass;
//     }
//     public static void main(String[] args) {
//         System.out.println(setBits(9, 2));
//     }
// }
//
//
// // // // // Clear Ith bit
// public class Bit_Manipulation {
//     public static int clearBits(int n, int i) {
//         int bitMass = ~(1 << i);
//         return n & bitMass;
//     }
//     public static void main(String[] args) {
//         System.out.println(clearBits(10, 2));
//     }
// }
//
//
// // // // Update ith Bit
// public class Bit_Manipulation {
//     // // // Set Bit
//     public static int setIthBit(int n, int i) {
//         int bitMass = (i << 1);
//         return n | bitMass;
//     }
//     // // // clear Bit
//     public static int clearBit(int n, int i) {
//         int bitMass = ~(i << 1);
//         return n & bitMass;
//     }
//     // // // Update Bit
//     public static int updateBit(int n, int i, int newBit) {
//         // if (newBit == 0) {
//         //     return clearBit(n, i);
//         // } else {
//         //     return setIthBit(n, i);
//         // }
//         //
//         //
//         // // // Second type Update Bit 
//         n = clearBit(n, i);
//         int bitMass = newBit << i;
//         return n | bitMass;
//     }
//     public static void main(String[] args) {
//         // System.out.println(setIthBit(10, 2));
//         // System.out.println(clearBit(10, 3));
//         System.out.println(updateBit(10, 2, 1));
//     }
// }
//
//
// // // Clear last ith bit
// public class Bit_Manipulation {
//     public static int clearLastBit(int n, int i) {
//         int bitMass = ~(0) << i;
//         return n & bitMass;
//     }
//     public static void main(String[] args) {
//         System.out.println(clearLastBit(15, 2));
//     }
// }
//
//
// // // // Clear Eange of Bits
// public class Bit_Manipulation {
//     public static int clearBitsRange(int n, int i, int j) {
//         int a = ((~0) << (j + 1));
//         int b = (1 << i) - 1;
//         int bitMass = a | b;
//         return n & bitMass;
//     }
//     public static void main(String[] args) {
//         System.out.println(clearBitsRange(100111, 2, 4));
//     }
// }
//
//
// // // Check a number is a power of 2 or not
// public class Bit_Manipulation {
//     public static boolean isPowerOfTwo(int n) {
//         return (n & (n - 1)) == 0;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPowerOfTwo(16));
//     }
// }
//
//
// // // Count set Bits in a Number
// public class Bit_Manipulation {
//     public static int countBitsNumber(int n) {
//         int count = 0;
//         while (n > 0) {
//             if ((n & 1) != 0) {
//                 count++;
//             }
//             n = n >> 1;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         System.out.println(countBitsNumber(15));
//     }
// }
//
//
// // // Fast Exponentiation
// public class Bit_Manipulation {
//     public static int fastExpo(int a, int n) {
//         int ans = 1;
//         while (n > 0) {
//             if ((n & 1) != 0) {
//                 ans = ans * a;
//             }
//             a = a * a;
//             n = n >> 1;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         System.out.println(fastExpo(15, 5));
//     }
// }
//
//
// public class Bit_Manipulation {

//     public static void main(String[] args) {
//         int x = 3, y = 4;
//         System.out.println("Before swap: x = " + x + " and y = " + y);
// //swap using xor
//         x = x ^ y;
//         y = x ^ y;
//         x = x ^ y;
//         System.out.println(x + " and " + y);
//         // System.out.println("After swap: x = " + x + " and y = " + y);
//     }
// }
