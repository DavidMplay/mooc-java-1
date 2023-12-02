
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int num : array) {
            if (smallest > num) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmall = 0;
        int index = 0;
        int smallest = array[0];
        while (index < array.length) {
            if (smallest > array[index]) {
                smallest = array[index];
                indexOfSmall = index;
            }
            index++;
        }
        return indexOfSmall;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmall = startIndex;
        int index = startIndex;
        int smallest = table[startIndex];
        while (index < table.length) {
            if (smallest > table[index]) {
                smallest = table[index];
                indexOfSmall = index;
            }
            index++;
        }
        return indexOfSmall;
    }

    public static void swap(int[] array, int index1, int index2) {
        int buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }

    public static void sort(int[] array) {
        int index = 0;
        System.out.println(Arrays.toString(array));

        while (index < array.length) {

            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));

            index += 1;
        }

    }
}
