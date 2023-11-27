
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        int i = 0;
        int biggest = list.get(0);
        while (i <= list.size() - 1) {
            if (list.get(i) > biggest) {
                biggest = list.get(i);
            }
            i++;

        }
        System.out.println(biggest);

    }
}
