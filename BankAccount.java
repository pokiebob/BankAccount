public class BankAccount {

  double balance;
  int accountID;
  String password;

  void newAccount(int newID, String newPassword) {
    accountID = newID;
    password = newPassword;
    balance = 0;
  }

  double getBalance() {
    return balance;
  }

  int getAccountID() {
    return accountID;
  }

  public static void main(String[] args) {
    BankAccount myAccount = new BankAccount();
    myAccount.newAccount(1208, "pswd");
    System.out.println(myAccount.getBalance());
    System.out.println(myAccount.getAccountID());
  }
}
