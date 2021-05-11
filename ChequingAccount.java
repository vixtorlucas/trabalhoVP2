public class ChequingAccount extends Account{
  
  private AccountType type = AccountType.Corrente;

  ChequingAccount(int accountNumber){
    super(accountNumber);
  }

  public String getType(){
    return type.name();
  }
}