package Labs;

public class VendingMachineTester
{
   public static void main(String[] args)
   {
      VendingMachine machine = new VendingMachine();
      machine.initialize();
      machine.fillUp(10);
      machine.addToken();
      machine.addToken();
      System.out.println("Token count: " + machine.getTokenCount());
      System.out.println("Expected: 12");
      System.out.println("Can count: " + machine.getCanCount()); 
      System.out.println("Expected: 8");
   } 
}
