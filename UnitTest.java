import java.util.*;
public class UnitTest{

  public static void runTest(){
    creatingAccountToAList();
  }
  private static void creatingAccountToAList(){
    System.out.println("-------------------");
    System.out.println("CreatingAccountTest");
    List<Account> l1 = new ArrayList<Account>();
    Account acc1 = new Account(l1.size());
    l1.add(acc1);
    Account acc2 = new Account(l1.size());
    l1.add(acc2);
    Account acc3 = new Account(l1.size());
    l1.add(acc3);
    Account acc4 = new Account(l1.size());
    l1.add(acc4);
    Account acc5 = new Account(l1.size());
    l1.add(acc5);
    System.out.println(l1);
    System.out.println("-------------------");
  }
}