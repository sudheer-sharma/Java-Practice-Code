
import java.util.ArrayList;

public class ArrayListss {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> List2 = new ArrayList<>();
        ArrayList<Boolean> List3 = new ArrayList<>();

        // Add Opration
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        // System.out.print(list);

        List2.add("Kailash");
        List2.add("Shiwagma");
        List2.add("Manti");
        List2.add("Mwali");
        // System.out.println(List2);

        // Get Opration
        int element = list.get(3);
        System.out.print(element);
    }
}
