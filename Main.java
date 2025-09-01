class BankAcc {
    static String name = "SBI";
    static String address = "TPG";
    
    static double interestRate = 0.08;
    int balance = 2000;
    
    static void bankDet() {
        System.out.println("--Bank Details--");
        System.out.println("Name of the Bank : "+name);
        System.out.println("Address : "+address);
        System.out.println();
    }
    
    static void interestRatesDet() {
        System.out.println("--Interest Details--");
        System.out.println("Interest Rate is : "+(interestRate*100)+"%");
        System.out.println();
    }
    
    void checkBal() {
        System.out.println("--Your Balance--");
        System.out.println("your balance is : "+balance);
        System.out.println();
    }
    
    void deposit(int amount) {
        balance += amount;
        System.out.println(amount+" has been credited");
        System.out.println();
    }
    
    void withdraw(int amount) {
        if(amount<balance) {
        balance -= amount;
        System.out.println(amount+" has been debited");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
}
public class Main {
        public static void main(String[] args) {
            BankAcc.bankDet();
            BankAcc.interestRatesDet();
            
            BankAcc obj = new BankAcc();
            obj.checkBal();
            obj.withdraw(750);
            obj.deposit(1500);
            obj.checkBal();
        }
    }
