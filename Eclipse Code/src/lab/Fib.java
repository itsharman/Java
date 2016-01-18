package lab;

public class Fib {
	
	public static void main(String[] args) {
		
		public static boolean isFib(int n) {
			
			System.out.println(isFib(5));
			System.out.println(isFib(30));
			
			long fib1 = 1;
			long fib2 = 1;
			
			for(int i = 0; i < 10; i++)
			{
				//System.out.println(fib1);
				long newFib = fib1 + fib2;
				fib1 = fib2;
				fib2 = newFib;
				if (fib1 == n) return true;
				if (fib1 > n) break;
				
			}
			
			return;
			
		}

		
	}

	
}
