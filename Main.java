import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    Core core = new Core();
    int input = 0;
    do {
      Presenter.mainList();
      input = scanner.nextInt();
      Presenter.clearScreen();
      try {
        if (input == 1) {
          Presenter.optionOneList();
          int input1 = scanner.nextInt();
          if (input1 == 1){
            core.createChequingAccount();
          }
          if (input1 == 2) {
            core.createSavingAccount();
          }
        }
        if (input == 2) {
          Presenter.optionTwoList();
          int input1 = scanner.nextInt();
          if (input1 == 1){
            core.showAccountList();
            Presenter.optionTwoSelection();
            int input2 = scanner.nextInt();
            if (core.validateInput(input2)) {
              System.out.print("valor a ser sacado:  ");
              Double value = scanner.nextDouble();
              core.makeWithdrawal(input2,value);
            }
          }
          if (input1 == 2) {
            core.showAccountList();
            Presenter.optionTwoSelection();
            int input2 = scanner.nextInt();
            if (core.validateInput(input2)) {
              System.out.print("valor a ser depositado:  ");
              Double value = scanner.nextDouble();
              core.makeDeposit(input2,value);
            }
          }
          if (input1 == 3) {
            core.showAccountList();
            Presenter.optionThreeAccoutFrom();
            int input2 = scanner.nextInt();
            if (core.validateInput(input2)) {
              core.showAccountList();
              Presenter.optionThreeAccoutTO();
              int input3 = scanner.nextInt();
              if (core.validateInput(input3)) {
                System.out.print("valor a ser transferido:  ");
                Double value = scanner.nextDouble();
                core.makeTransaction(input3,input2,value);
              }
            }
          }
        }
        if (input == 3){
          Presenter.clearScreen();
          Presenter.accountInformation();
          core.showAccountList();
        }

        if (input == 4){
          core.showAccountList();
          Presenter.optionFour();
          int input3 = scanner.nextInt();
          if (core.validateInput(input3)) {
            core.delete(input3);
          }
        }
      } catch (Exception e) {
      }
    } while (input != 5);
    Presenter.clearScreen();
    System.out.print("Sistema desligado");
  }
}