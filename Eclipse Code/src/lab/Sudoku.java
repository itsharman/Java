package lab;

public class Sudoku
{
   public static void main(String[] args)
   {
      // Row and column Latin but with invalid subsquares
      String config1 = "1234567892345678913456789124567891235678912346" 
         + "78912345789123456891234567912345678";
      String[][] puzzle1 = makeSudoku(config1);
      if (isValidSudoku(puzzle1))
      {
         System.out.println("This puzzle is valid.");
      }
      else
      {
         System.out.println("This puzzle is invalid.");
      }
      System.out.println(getPrintableSudoku(puzzle1));
      System.out.println("--------------------------------------------------");

      // Row Latin but column not Latin and with invalid subsquares
      String config2 = "12345678912345678912345678912345678912345678"
         + "9123456789123456789123456789123456789";
      String[][] puzzle2 = makeSudoku(config2);
      if (isValidSudoku(puzzle2))
      {
         System.out.println("This puzzle is valid.");
      }
      else
      {
         System.out.println("This puzzle is invalid.");
      } 
       
      System.out.println(getPrintableSudoku(puzzle2));
      System.out.println("--------------------------------------------------"); 
       
      // A valid sudoku
      String config3 = "25813764914698532779324685147286319558149273663"
         + "9571482315728964824619573967354218";
      String[][] puzzle3 = makeSudoku(config3);
      if (isValidSudoku(puzzle3))
      {
         System.out.println("This puzzle is valid.");
      }
      else
      {
         System.out.println("This puzzle is invalid.");
      } 
      System.out.println(getPrintableSudoku(puzzle3));
      System.out.println("--------------------------------------------------"); 

   }
   
   public static String[][] makeSudoku(String s)
   {
	   int k = 0;
      int SIZE = 9;
      String[][] x = new String[SIZE][SIZE];
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
         {
            x[i][j] = s.substring(k, k + 1);
            k++;
         }
      }
      return x;
   }

   public static String getPrintableSudoku(String[][] x)
   {
      int SIZE = 9;
      String temp = "";
      for (int i = 0; i < SIZE; i++)
      {
         if ((i == 3) || (i == 6))
         {
            temp = temp + "=================\n";
         }
         for (int j = 0; j < SIZE; j++)
         {
            if ((j == 3) || (j == 6))
            {
               temp = temp + " || ";
            }
            temp = temp + x[i][j];
         }
         temp = temp + "\n";
      }
      return temp;
   }

   public static boolean isValidSudoku(String[][] x)
   {
      return rowsAreLatin(x) && colsAreLatin(x) && goodSubsquares(x);
   }

   public static boolean rowsAreLatin(String[][] x)
   {
//	  int checkOne = 0;
//	  int checkTwo = 0;
//      for (int i = 0; i < 10; i++) {
//    	  checkOne = (int) (Math.random()*9);
//    	  checkTwo = (int) (Math.random()*9);
//    	  if (checkOne == checkTwo) return false;
//      }
//	return true;
	   return false;
   }

   public static boolean rowIsLatin(String[][] x, int i)
   {
//	 int k = 0;
//     boolean[] found = new boolean[k];
//     for (int b = 0; b < 10; b++){
//    	 if(x[i] != k) return false;
//     }
//	return true;
	   return false;
   }

   public static boolean colsAreLatin(String[][] x)
   {
	   return false;
   }   

   public static boolean colIsLatin(String[][] x, int j)
   {
	   return false;
   }
   
   public static boolean goodSubsquares(String[][] x)
   {
	   return false;
   }

   public static boolean goodSubsquare(String[][] x, int i, int j)
   {
	   return false;
   }
}
