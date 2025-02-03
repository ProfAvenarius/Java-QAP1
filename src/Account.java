public class Account {
    //As per UML 3 attributes
    private String id;
    private String name;
    private int balance = 0;

    // 2 constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        }

    public Account(String id, String name, int bal) {
        this.id = id;
        this.name = name;
        this.balance = bal;
        }

    //Getters
    public String getId() {
        return id;
        }

    public String getName() {
        return name;
        }

    public int getBalance() {
        return balance;
        }

    //Methods
    public int credit(int amount) {
            balance += amount;
            return balance;
        }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        }else {
            System.out.println ("Amount requested exceeds balance.");
            }
        return balance;
        }

    public int transfer(Account toAccount, int amount) {
        if (amount <= balance) {
            this.debit(amount); // This was the most challenging part, made a mess of this trying to call Balance
            // before asking ChapGPT if there was a better way... Use the method you already have...
            toAccount.credit(amount);
        }else {
            System.out.println ("Amount requested exceeds balance.");
        }
        return balance;
    }
    //String method
    public String toString() {
        return ("\n" + "AccountID: " + getId() +"\n" + "Name: " + getName() + "\n" + "Balance: " + getBalance());
    }
}