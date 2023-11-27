
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int biggest = 0;
        if (number1 > number2) {
            if (number1 > number3) {
                biggest = number1;
            }
            if (number3 > number1) {
                biggest = number3;
            }
        }
        if (number2 > number1) {
            if (number2 > number3) {
                biggest = number2;

            }
            if (number3 > number2) {
                biggest = number3;
            }
        }
        if (number3 > number1) {
            if (number3 > number2) {
                biggest = number3;
            }
            if (number2 > number3) {
                biggest = number2;
            }
        } else {
            biggest = number1;
        }
        return biggest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
