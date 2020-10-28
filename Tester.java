public class Tester {
  public static void main(String[] args) {
    BankAccount myAccount = new BankAccount(1208, "pswd");
    System.out.println(myAccount.getBalance());
    System.out.println(myAccount.getAccountID());
    myAccount.setPassword("new pswd");
    System.out.println(myAccount.deposit(1000));
    System.out.println(myAccount.deposit(-1000));
    System.out.println(myAccount.getBalance());
    System.out.println(myAccount.withdraw(-999));
    System.out.println(myAccount.withdraw(1001));
    System.out.println(myAccount.withdraw(999));
    System.out.println(myAccount.getBalance());
    System.out.println(myAccount.toString());

    BankAccount b1 = new BankAccount(1000001, "abc123");
      BankAccount b2 = new BankAccount(1000231, "abcasdg23");

      System.out.println("Account b1:");
      b1.deposit(3000.0);
      b2.deposit(1234.0);
      System.out.println(b1);
      System.out.println("Account b2:");
      System.out.println(b2);
      System.out.println();


      double cashAmount = 300.0;
      while(cashAmount < 3000){
        System.out.println("Attempt to move $"+cashAmount+" from the b1 to b2 account:");
        if(b1.withdraw(cashAmount) ){
          if(b2.deposit(cashAmount)){
            System.out.println(b1);
            System.out.println(b2);
            System.out.println();

          }else{
            //This should never happen.
            //Error message provided to make sure that is the case
            System.out.println("CRITICAL ERROR! $"+cashAmount +
                               " withdrawn from Account #" +  b1.getAccountID() +
                               "Failed to add to Account #"+b2.getAccountID());
          }
        }else{
          System.out.println("Transfer Failed");
        }

        cashAmount *= 2;
      }

  }
}
