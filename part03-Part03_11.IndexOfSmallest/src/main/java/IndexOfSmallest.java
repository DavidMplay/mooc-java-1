
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        int i = 0;
        int small = list.get(0);
        while (i <= list.size() - 1) {
            if (list.get(i) < small) {
                small = list.get(i);
            }
            i++;
        }
        System.out.println("Smallest number: " + small);
        i = 0;
        while (i <= list.size() - 1) {
            if (list.get(i) == small) {
                System.out.println("Found at index: " + i);
            }
            i++;
        }
    }
}
