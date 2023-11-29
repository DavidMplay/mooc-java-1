
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> list = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identif = scanner.nextLine();

            if (identif.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Archive item = new Archive(identif, name);

            if (list.contains(item)) {
                continue;
            } else {
                list.add(item);
            }
        }
        System.out.println("==Items==");
        for (Archive item : list) {
            System.out.println(item.getIdentif() + ": " + item.getName());
        }

    }
}
