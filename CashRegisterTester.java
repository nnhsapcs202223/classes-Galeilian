/**
   A class to test the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();

      register.recordPurchase(29.50);
      register.recordPurchase(9.25);
      register.receivePayment(50);

      double change = register.giveChange();

      System.out.println(change);      
      System.out.println("Expected: 11.25");          
   }
}

/*
 * Register
 * purchase         payment     change      system.out
 * 0                0
 * 29.5             0
 * 38.75            0
 * 38.75            50
 * 0                0           11.25
 * 0                0           11.25       Expect: 11.25
 * 
 * 
 */