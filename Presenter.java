public class Presenter{
  public static void mainList(){
    System.out.println("Digite a opção desejada:");
    System.out.println("1 - Abrir conta bancária");
    System.out.println("2 - Realizar transações financeiras");
    System.out.println("3 - Exibir informações da conta");
    System.out.println("0 - Sair do sistema");
    System.out.print("Sua opção: ");
  }
  public static void optionOneList(){
    System.out.println("1 - Conta Corrente");
    System.out.println("2 - Conta Poupança");
    System.out.print("Qual tipo de conta quer criar: ");
  }
  public static void optionTwoList(){
    System.out.println("1 - Saque ");
    System.out.println("2 - Depósito");
    System.out.println("3 - Transferênciaentre contas");
    System.out.print("Operação quer realizar: ");
  }

  public static void optionTwoSelection(){
    System.out.print("Selecione a conta que deseja fazer a operação: ");
  }

  public static void optionThreeAccoutFrom(){
    System.out.print("Selecione a conta de origem: ");
  }
  public static void optionThreeAccoutTO(){
    System.out.print("Selecione a conta de destino: ");
  }
  public static void optionFour(){
    System.out.print("Selecione a conta a ser deletada: ");
  }
  public static void accountInformation(){
    System.out.println("-------------------------------");
    System.out.println("----Informaçoes das contas-----");
    System.out.println("-------------------------------");
  }
  public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
  }  
}