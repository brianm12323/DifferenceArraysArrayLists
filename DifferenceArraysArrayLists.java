import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceArraysArrayLists {

    public static void main(String[] args) {
        // array
        int[] array = new int[10]; // array list of 10 max
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);

        // output for original arrays
        System.out.println("Array Elements: " + Arrays.toString(array));
        System.out.println("ArrayList Elements: " + arrayList);

        // modification of arrays
        array[6] = 34; // update for array element
        arrayList.set(3, 76); // update for ArrayList element

        // output for the modifications
        System.out.println("Modified Array Elements: " + Arrays.toString(array));
        System.out.println("Modified ArrayList Elements: " + arrayList);
    }
}