package lab;

import java.util.Scanner;

public class Sequence {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number upto which Fibonacci series to print: ");
       long n = input.nextLong();
       int count = 1, c = 1, b = 1, a = 0;
       
       while(count <= n){      
           c = b + a;
           System.out.print(c + " ");
           a = b; b = c; count++;
           }
     }
}