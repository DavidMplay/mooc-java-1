
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsOdd = new Statistics();
        Statistics statisticsEven = new Statistics();
        System.out.println("Enter numbers: ");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            statistics.addNumber(number);

            if (number % 2 == 0) {
                statisticsEven.addNumber(number);
            } else {
                statisticsOdd.addNumber(number);
            }

        }
        System.out.println("Sum: "+ statistics.sum());
        System.out.println("Sum of the even numbers: " + statisticsEven.sum());
        System.out.println("Sum of the odd numbers: " + statisticsOdd.sum());
    }
}
