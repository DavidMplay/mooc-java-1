
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int countEven = 0;
        int countOdd = 0;

        System.out.println("Give numbers:");

        while (true) {
            int inNum = Integer.valueOf(scanner.nextLine());
            
            if (inNum == -1) {
                break;
            }
            sum += inNum;
            count++;
            if (inNum % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
                

            }

        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (double) sum / count);
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
    }
}
