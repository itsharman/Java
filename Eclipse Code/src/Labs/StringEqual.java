package labs;

public class StringEqual
{
   public static void main(String[] args)
   {
      String str1 = "abcd";
      String str2 = "abcdefg";
      String str3 = str1 + "efg";
      System.out.println("str2 = " + str2);
      System.out.println("str3 = " + str3);
      if (str2 == str3)
      {
         System.out.println("The strings are equal");
      }
      else
      {
         System.out.println("The strings are not equal");
      }
      //This program is an example of a general coding mistake. By using the "==" relational operator, the computer is testing to see if 
      //str2 and str3 are located in the same location in the computer's memory. It says they are not equal because they are located at different
      //locations in the memory.
      }
}