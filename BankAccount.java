public class BankAccount {

  double balance;
  int accountID;
  String password;

  public BankAccount(int newID, String newPassword) {
    accountID = newID;
    password = newPassword;
    balance = 0;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String newPassword) {
    password = newPassword;
  }

  public static void main(String[] args) {
    BankAccount myAccount = new BankAccount(1208, "pswd");
    System.out.println(myAccount.getBalance());
    System.out.println(myAccount.getAccountID());
    myAccount.setPassword("new pswd");
    System.out.println(myAccount.password);
  }
}
