
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(6);
    }

    public static void printFromNumberToOne(int number) {
        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }
}
