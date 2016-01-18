package labs;

public class StringEqualFixed
{
   public static void main(String[] args)
   {
      String str1 = "abcd";
      String str2 = "abcdefg";
      String str3 = str1 + "efg";
      System.out.println("str2 = " + str2);
      System.out.println("str3 = " + str3);
      
      int result = str2.compareTo(str3);
      if (result == 0)
      {
         System.out.println("The strings are equal");
      }
      else
      {
         System.out.println("The strings are not equal");
      }
   }
}