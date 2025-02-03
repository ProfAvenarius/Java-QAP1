


public class TestAccount {
    public static void main(String[] args) {
        //Define the 2 account
        Account Acc1 =new Account("Acc1","Nelson", 5000);
        Account Acc2 =new Account("Acc2","Napoleon", 4000);
        //Balances before and after transfer.
        System.out.println("");
        System.out.println("Initial Balances:");
        System.out.println("Account 'Acc1' Balance: " + "$" + Acc1.getBalance());
        System.out.println("Account 'Acc2' Balance: " + "$" + Acc2.getBalance());
        System.out.println("");
        System.out.println("Transfer of $1000 between Acc1 and Acc2.");
        System.out.println("");
        Acc1.transfer(Acc2, 1000);
        System.out.println("Balances After Transfer:");
        System.out.println("Account 'Acc1' Balance: " + "$" + Acc1.getBalance());
        System.out.println("Account 'Acc2' Balance: " + "$" + Acc2.getBalance());
        //Keep output limited to what UML specified.
    }
}
