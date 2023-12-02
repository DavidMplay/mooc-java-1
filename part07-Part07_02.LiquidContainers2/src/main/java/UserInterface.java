
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private Container container1;
    private Container container2;

    public UserInterface() {
        this.scan = new Scanner(System.in);
        this.container1 = new Container();
        this.container2 = new Container();
    }

    public void start() {
        while (true) {

            String input = this.scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            if (command.equals("add") && amount >= 0) {
                container1.add(amount);
            } else if (command.equals("move") && amount >= 0) {
                if (container1.contains() == 0) {

                } else if (container1.contains() - amount >= 0){

                    container1.remove(amount);
                    container2.add(amount);
                } else{
                    int buffer = container1.contains();
                    this.container1.remove(amount);
                    this.container2.add(buffer);
                }
            } else if (command.equals("remove") && amount >= 0) {
                container2.remove(amount);
            }
        }

        System.out.println("First: " + container1);
        System.out.println("Second: " + container2);
    }

}
