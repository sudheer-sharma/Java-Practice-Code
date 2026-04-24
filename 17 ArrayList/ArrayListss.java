
import java.util.ArrayList;

// public class ArrayListss {
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
//
public class ArrayListss {

    public static void sawp(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(0);
        list.add(6);
        list.add(14);
        list.add(4);

        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        sawp(list, idx1, idx2);
        System.out.println(list);
    }
}
