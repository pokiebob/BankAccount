public class BankAccount {

  double balance;
  int accountID;
  String password;

  void newAccount(int newID, String newPassword) {
    accountID = newID;
    password = newPassword;
    balance = 0;
  }

  public static void main(String[] args) {
    BankAccount myAccount = new BankAccount();
    myAccount.newAccount(221153448, "pswd");
    System.out.println(myAccount.balance);
  }
}
