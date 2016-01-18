package lab;

public class PercentagePrinter
{
   public static void main(String[] args)
   {
      double probability = 8.70;
      int percentage = (int) (100 * probability);
      percentage = percentage + 1;
      System.out.println(percentage);
   }
}
