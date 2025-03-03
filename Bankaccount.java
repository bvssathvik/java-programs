// Declaring the class
public class Bankaccount {
    // Declaring variables
    String name;
    int Accno;
    double Balance;

    // Constructor to initialize the account details
    Bankaccount(String name, int Accno, double Balance) {
        this.name = name;
        this.Accno = Accno;
        this.Balance = Balance;
        System.out.println("The details are: " + name + ", " + Accno + ", " + Balance + ".");
    }

    // Method for withdrawal
    public void withdrawal(double withdrawal) {
        System.out.println("The withdrawal amount is: " + withdrawal);
        if (withdrawal < Balance) {
            Balance = Balance - withdrawal;
            System.out.println("The current balance is: " + Balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method for deposit
    public void Deposit(double Deposit) {
        Balance = Deposit + Balance;
        System.out.println("The deposit amount is: " + Deposit);
        System.out.println("The balance after depositing is: " + Balance);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        System.out.println("Bvs sathvik");
        System.out.println("AV.SC.U4CSE24029");
        System.out.println("CSE-A");

        // Creating an object of BankAcc class
       Bankaccount customer = new Bankaccount("Harshi", 12345, 10000);
        
        // Performing transactions
        customer.Deposit(15000);
        customer.withdrawal(30000);
    }
}
