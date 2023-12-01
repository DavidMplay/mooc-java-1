
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.equals("add")) {
                this.add();
            } else if (input.equals("list")) {
                this.list.print();
            } else if (input.equals("remove")) {
                System.out.println("Which one is removed? ");
                int num = Integer.valueOf(scanner.nextLine());
                this.list.remove(num);
            }
        }
    }

    public void add() {
        System.out.println("To add: ");
        String task = scanner.nextLine();
        this.list.add(task);
    }

}
