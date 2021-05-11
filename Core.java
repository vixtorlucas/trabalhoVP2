import java.util.*;
public class Core{
  List<ChequingAccount> listOfAccsChequing;
  List<SavingAccount> listOfAccsSaving;
  List<Account> accList;
  Core(){
     listOfAccsChequing = new ArrayList<ChequingAccount>();
     listOfAccsSaving = new ArrayList<SavingAccount>();
     accList = new ArrayList<Account>();
  }

  public void createChequingAccount(){
    ChequingAccount cc = new ChequingAccount(accList.size());
    listOfAccsChequing.add(cc);
    accList.add(cc);
    Presenter.clearScreen();
    System.out.println("-------------------");
    System.out.format("Conta corrente de numero %d criada com successo\n",cc.getAccountNumber());
    System.out.println("-------------------\\");
  }

  public void createSavingAccount(){
    SavingAccount cc = new SavingAccount(accList.size());
    listOfAccsSaving.add(cc);
    accList.add(cc);
    Presenter.clearScreen();
    System.out.println("-------------------");
    System.out.format("Conta poupança de numero %d criada com successo\n",cc.getAccountNumber());
    System.out.println("-------------------");
  }

  public void showAccountList(){
    for(int i = 0; i< listOfAccsChequing.size(); i++){
      System.out.print("| Conta ");
      System.out.print(listOfAccsChequing.get(i).getType());
      System.out.print(" numero:");
      System.out.print(listOfAccsChequing.get(i).getAccountNumber());
      System.out.print(" saldo:");
      System.out.print(listOfAccsChequing.get(i).getBalance());
      System.out.print("|\n");
    }
    for(int i = 0; i< listOfAccsSaving.size(); i++){
      System.out.print("| Conta ");
      System.out.print(listOfAccsSaving.get(i).getType());
      System.out.print(" numero:");
      System.out.print(listOfAccsSaving.get(i).getAccountNumber());
      System.out.print(" saldo:");
      System.out.print(listOfAccsSaving.get(i).getBalance());
      System.out.print("|\n");
    }
  }

  public boolean validateInput(int value){
    if (value > accList.size() - 1) {
      System.out.println("-------------------");
      System.out.println("Conta nao existe");
      System.out.println("-------------------");
      return false;
    }else{
      return true;
    }
  }

  public void makeWithdrawal(int number,Double value){

        try{
          accList.get(number).withdrawal(value);  
          System.out.println("-------------------");
          System.out.println("Saque realizado com successo");
          System.out.println("-------------------");
        }catch(Exception e){
          System.out.println("-------------------");
          System.out.println(e);
          System.out.println("-------------------");
        }
  }
  public void makeDeposit(int number,Double value){

          accList.get(number).deposit(value);  
          System.out.println("-------------------");
          System.out.println("deposito realizado com successo");
          System.out.println("-------------------");

  }

  public void makeTransaction(int accTo, int accFrom, Double value){
    try{
      accList.get(accFrom).withdrawal(value);  
        accList.get(accTo).deposit(value);
        System.out.println("-------------------");
        System.out.println("Transferencia realizada com sucesso");
        System.out.println("-------------------");
      }catch(Exception e){
        System.out.println("-------------------");
        System.out.println(e);
        System.out.println("-------------------");
      }
  }

  public void delete(int acc){
    accList.remove(acc);
    for(int i = 0; i< listOfAccsChequing.size(); i++){
      if (listOfAccsChequing.get(i).getAccountNumber() == acc){
          listOfAccsChequing.remove(i);
      }
    }
    for(int i = 0; i< listOfAccsSaving.size(); i++){
      if (listOfAccsSaving.get(i).getAccountNumber() == acc){
          listOfAccsSaving.remove(i);
      }
    }

    System.out.println("-------------------");
    System.out.println("Conta Deletada");
    System.out.println("-------------------");

    showAccountList();
  }
}