public class VariableTest {
  public static void main(String[] args) {
  int itemPrice = 250000;
  double discount = 2.5;
  boolean isTrue = true;
  long yourMoney = 1000000;
  short counter = 0;
    System.out.println("Test5 :");
    System.out.println(itemPrice);
    System.out.println(discount);
    System.out.println(yourMoney);
    System.out.println(isTrue);

    yourMoney = yourMoney-itemPrice;
    System.out.println("Test6: " +yourMoney);

    yourMoney = 1000000;
    yourMoney = (long) (yourMoney-(itemPrice-(itemPrice/ 100 * discount)));
    System.out.println("Test7: " +yourMoney);

    System.out.println("Test8: " +counter++);
    System.out.println("Test9: " + ++counter);

    boolean notTrue = !isTrue;
    System.out.println("Test10: " +notTrue);

  }

}
