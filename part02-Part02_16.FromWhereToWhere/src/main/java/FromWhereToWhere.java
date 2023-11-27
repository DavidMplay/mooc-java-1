
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to");
        int j = Integer.valueOf(scanner.nextLine());
        System.out.println("where from");
        for(int i = Integer.valueOf(scanner.nextLine()); i <= j; i++){
            System.out.println(i);
        }
        // Write your program here
    }
}
