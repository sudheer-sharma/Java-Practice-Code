// // // Max Subarray Sum

// public class ArraysIn2 {

//     public static void maxSubarraySum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         for (int i = 0; i < numbers.length; i++) {
//             int first = i;
//             for (int j = i; j < numbers.length; j++) {
//                 int last = j;
//                 currSum = 0;
//                 for (int k = first; k <= last; k++) {
// // subArray Sum
//                     currSum += numbers[k];
//                 }
//                 System.out.println(currSum);
//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("Max sum = " + maxSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {1, -2, 6, -1, 3};
//         maxSubarraySum(numbers);
//     }
// }

// // // // // Max Subarray Sum
// // Secont type Prefix Sum
// public class ArraysIn2 {
// public static void maxSubarraySum(int numbers[]) {
// int currSum = 0;
// int maxSum = Integer.MIN_VALUE;
// int prefix[] = new int[numbers.length];
// prefix[0] = numbers[0];
// // Calculate prefix array
// for (int i = 1; i < prefix.length; i++) {
// prefix[i] = prefix[i - 1] + numbers[i];
// }
// for (int i = 0; i < numbers.length; i++) {
// int start = i;
// for (int j = i; j < numbers.length; j++) {
// int end = j;
// currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
// if (maxSum < currSum) {
// maxSum = currSum;
// }
// }
// }
// System.out.println("Max sum = " + maxSum);
// }
// public static void main(String[] args) {
// int numbers[] = { 1, -2, 6, -1, 3 };
// maxSubarraySum(numbers);
// }
// }


// // Kadanes Algorithm
// public class ArraysIn2 {
// public static void kadanes(int numbers[]) {
// int cs = 0;
// int ms = Integer.MIN_VALUE;
// for (int i = 0; i < numbers.length; i++) {
// cs = cs + numbers[i];
// if (cs < 0) {
// cs = 0;
// }
// ms = Math.max(cs, ms);
// }
// System.out.println("Our max subarray sum is : " + ms);
// }
// public static void main(String[] args) {
// int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
// kadanes(numbers);
// }
// }
// // Trapping RainWater
// public class ArraysIn2 {
// public static int trapingRainWater(int numbers[]) {
// int n = numbers.length;
// if (n == 0) {
// return 0;
// }
// int ans = 0;
// int left = 0, right = n - 1;
// int leftMax = 0, rightMax = 0;
// while (left < right) {
// leftMax = Math.max(leftMax, numbers[left]);
// rightMax = Math.max(rightMax, numbers[right]);
// if (leftMax < rightMax) {
// ans += leftMax - numbers[left];
// left++;
// } else {
// ans += rightMax - numbers[right];
// right--;
// }
// }
// return ans;
// }
// public static void main(String[] args) {
// int numbers[] = { 4, 2, 0, 3, 2, 5 };
// int result = trapingRainWater(numbers);
// System.out.println("Trapping RainWater : " + result);
// }
// }
// // Buy & Shell Stock
// public class ArraysIn2 {
// public static int buyAndShellStock(int prices[]) {
// int buyPrice = Integer.MAX_VALUE;
// int maxProfit = 0;
// for (int i = 0; i < prices.length; i++) {
// if (buyPrice < prices[i]) { // Profit
// int profit = prices[i] - buyPrice; // today's profit
// maxProfit = Math.max(maxProfit, profit);
// } else {
// buyPrice = prices[i];
// }
// }
// return maxProfit;
// }
// public static void main(String[] args) {
// int prices[] = { 7, 1, 5, 3, 6, 4 };
// System.out.println("Profit Price : " + buyAndShellStock(prices));
// }
// }
