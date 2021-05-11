
public class Account{
  private int accountNumber;
  private Double balance;

  Account(int accountNumber){
    this.accountNumber = accountNumber;
    this.balance = 0.0;
  }

  public double getBalance() {
    return this.balance;
  }

  public void withdrawal(Double amount) throws InsufficientBalance{
    if (amount > balance){
      throw new InsufficientBalance();
    }else{
      balance = balance - amount;
      System.out.println("-------------------");
      System.out.print("conta: ");
      System.out.print(accountNumber);
      System.out.print("  novo saldo: ");
      System.out.println(balance);
      System.out.println("-------------------");
    }
  }

  public void deposit(Double amount){
      balance = balance + amount;
      System.out.println("-------------------");
      System.out.print("conta: ");
      System.out.print(accountNumber);
      System.out.print("  novo saldo: ");
      System.out.println(balance);
      System.out.println("-------------------");
  }

  public int getAccountNumber(){
    return accountNumber;
  }
}