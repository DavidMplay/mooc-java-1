
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye");
                break;
            } else if (command.equals("add")) {
                this.add();
            } else if (command.equals("search")) {
                System.out.println (this.search());
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public String search() {
        System.out.println("To be translated:");
        String word = scanner.nextLine();
        if(this.dictionary.translate(word) == null){
            return "Word " + word + " was not found";
        }
        return "Translation: " + this.dictionary.translate(word);
    }

    public void add() {
        System.out.println("Word: ");
        String word = scanner.nextLine();
        System.out.println("Translation: ");
        String translation = scanner.nextLine();
        this.dictionary.add(word, translation);
    }
}
