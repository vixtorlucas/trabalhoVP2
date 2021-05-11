public class SavingAccount extends Account{
  private AccountType type = AccountType.Poupança;

  SavingAccount(int accountNumber){
    super(accountNumber);
  }
  public String getType(){
    return type.name();
  }
}