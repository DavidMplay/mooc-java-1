
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Lname = "";
        int sum = 0;
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            sum += Integer.valueOf(parts[1]);
            count++;

            if (Lname.length() < parts[0].length()) {
                Lname = parts[0];
            }
        }
        System.out.println("Longest name: " + Lname);
        System.out.println("Age average: " + ((double) sum / count));

    }
}
