
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matsAcc = new Account("Matthews account", 1000.0);
        Account myAcc = new Account("My account", 0.0);
        matsAcc.withdrawal(100.0);
        myAcc.deposit(100.0);
        System.out.println(matsAcc);
        System.out.println(myAcc);
    }
}
