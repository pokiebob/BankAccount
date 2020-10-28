public class BankAccount {

  double balance;
  int accountID;
  String password;

  public BankAccount(int accountID, String password) {
    this.accountID = accountID;
    this.password = password;
    this.balance = 0;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String newPass) {
    password = newPass;
  }

  public boolean deposit(double amount) {
    if (amount >= 0) {
      balance += amount;
      return true;
    }
    return false;
  }

  public boolean withdraw(double amount) {
    if (amount >= 0 && balance >= amount) {
      balance -= amount;
      return true;
    }
    return false;
  }

  public String toString() {
    return String.format("%d\t%f", accountID, balance);
  }

  public static void main(String[] args) {
    BankAccount myAccount = new BankAccount(1208, "pswd");
    System.out.println(myAccount.getBalance());
    System.out.println(myAccount.getAccountID());
    myAccount.setPassword("new pswd");
    System.out.println(myAccount.password);
    System.out.println(myAccount.deposit(1000));
    System.out.println(myAccount.deposit(-1000));
    System.out.println(myAccount.getBalance());
    System.out.println(myAccount.withdraw(-999));
    System.out.println(myAccount.withdraw(1001));
    System.out.println(myAccount.withdraw(999));
    System.out.println(myAccount.getBalance());
    System.out.println(myAccount.toString());
  }
}
