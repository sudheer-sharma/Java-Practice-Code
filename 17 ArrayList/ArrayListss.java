
// import java.util.ArrayList;
// import java.util.Collections;
//
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> List2 = new ArrayList<>();
//         ArrayList<Boolean> List3 = new ArrayList<>();
//         // Add Opration
//         // list.add(1);
//         // list.add(2);
//         // list.add(3);
//         // list.add(4);
//         // list.add(5);
//         // list.add(6);
//         // list.add(7);
//         // list.add(8);
//         // list.add(9);
//         // first indest numaber hai and second value hai
//         // list.add(2, 90);
//         // System.out.println(list);
//         // System.out.println(list.size());
//         for (int i = 0; i < list.size(); i++) {
//             // System.out.print(list.get(i) + " ");
//         }
//         //
//         //
//         List2.add("Kailash");
//         List2.add("Shiwagma");
//         List2.add("Manti");
//         List2.add("Mwali");
//         // System.out.println(List2);
//         // Get Opration
//         // int element = list.get(3);
//         // System.out.print(element);
//         //
//         //
//         // remove Opration
//         // list.remove(3);
//         // System.out.println(list);
//         //
//         //
//         // set Opration
//         // list.set(3, 4);
//         // System.out.println(list);
//         //
//         //
//         // contains Opration
//         // System.out.println(list.contains(1));
//         // System.out.println(list.contains(15));
//         //
//         //
//         //Reverce Print number
//         for (int i = list.size() - 1; i >= 0; i--) {
//             // System.out.print(list.get(i) + " ");
//         }
// // //
// // //
// // Find Maximun Number
//         list.add(8);
//         list.add(2);
//         list.add(1);
//         list.add(5);
//         list.add(9);
//         list.add(7);
//         list.add(0);
//         list.add(6);
//         list.add(14);
//         list.add(4);
//         int maxNum = Integer.MIN_VALUE;
//         int minNum = Integer.MAX_VALUE;
//         for (int i = 0; i < list.size(); i++) {
//             // if (maxNum < list.get(i)) {
//             //     maxNum = list.get(i);
//             // }
//             maxNum = Math.max(maxNum, list.get(i));
//             minNum = Math.min(minNum, list.get(i));
//         }
//         System.out.print("Max Element this = " + maxNum);
//         System.out.println();
//         System.out.print("Min Element this = " + minNum);
//     }
//
//
//   }
// }
//
//
// // // // Find Maximun Number
// public class ArrayListss {
//     public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp);
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(8);
//         list.add(2);
//         list.add(1);
//         list.add(5);
//         list.add(9);
//         list.add(7);
//         list.add(0);
//         list.add(6);
//         list.add(14);
//         list.add(4);
//         int idx1 = 2, idx2 = 8;
//         System.out.println(list);
//         swap(list, idx1, idx2);
//         System.out.println(list);
//     }
// }
// 
// 
//
// // //  Sorting in ArrayList
// public class ArrayListss {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(8);
//         list.add(2);
//         list.add(1);
//         list.add(5);
//         list.add(9);
//         list.add(7);
//         list.add(0);
//         list.add(6);
//         list.add(14);
//         list.add(4);
// //
// // Sort in Asending order
//         System.out.println(list);
//         Collections.sort(list);
//         System.out.println(list);
//         //
// // Sort in Desending order
//         Collections.sort(list, Collections.reverseOrder());
//         System.out.println(list);
//     }
// }
//
//
//
// // // // Multi-dimensional ArrayList
// // 
// public class ArrayListss {
//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>();
//         // // First type
//         //
//         // list1.add(1);
//         // list1.add(2);
//         // list1.add(3);
//         // list2.add(1);
//         // list2.add(2);
//         // list2.add(3);
//         // list3.add(1);
//         // list3.add(2);
//         // list3.add(3);
//         // mainList.add(list1);
//         // mainList.add(list2);
//         // mainList.add(list3);
//         // // System.out.println(mainList);
//         // // System.out.println(list1);
//         // // System.out.println(list2);
//         // // System.out.println(list3);
//         // for (int i = 0; i < mainList.size(); i++) {
//         //     ArrayList<Integer> currentList = mainList.get(i);
//         //     // System.out.print(mainList.get(i));
//         //     for (int j = 0; j < currentList.size(); j++) {
//         //         System.out.print(currentList.get(j) + " ");
//         //     }
//         //     System.out.println();
//         // }
//         // System.out.println(mainList);
//         //
//         // // Scond Type
//         for (int i = 1; i <= 5; i++) {
//             list1.add(i * 1);
//             list2.add(i * 2);
//             list3.add(i * 3);
//         }
//         // System.out.println(list1);
//         // System.out.println(list2);
//         // System.out.println(list3);
//         //
//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);
//         //
//         // System.out.print(mainList);
//         //
//         for (int i = 0; i < mainList.size(); i++) {
//             // System.out.print(mainList.get(i) + " ");
//             ArrayList<Integer> currList = mainList.get(i);
//             for (int j = 0; j < currList.size(); j++) {
//                 System.out.print(currList.get(j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }
//
//
// // Container with most water
public class ArrayListss {

    public static void main(String[] args) {

    }
}
