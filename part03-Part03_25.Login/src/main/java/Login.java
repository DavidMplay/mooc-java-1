
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass2 = "sunshine";
        String pass1 = "haskell";
        String user1 = "emma";
        String user2 = "alex";
        System.out.println("Enter username: ");
        String userInput = scanner.nextLine();
        System.out.println("Enter password: ");
        String passInput = scanner.nextLine();
        if(userInput.equals(user1)){
            if (passInput.equals(pass1)) {
                System.out.println("You have successfully logged in!");
            }
        } else if (userInput.equals(user2)) {
            if (passInput.equals(pass2)) {
                System.out.println("You have successfully logged in!");
            }
        } else{
            System.out.println("Incorrect username or password!");
        }
    }
}
