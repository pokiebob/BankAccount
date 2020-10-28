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
  }
}
