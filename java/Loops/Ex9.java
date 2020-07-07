package Loops;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		/*
		 * Write a program to calculate HCF of Two given number.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int dividend, divisor;
		int remainder, hcf = 0;
               
        System.out.print("Enter the first number ");
        dividend = scan.nextInt();
                
        System.out.print("Enter the second number ");
        divisor = scan.nextInt();   
		
        scan.close();
        
        do
        {
        	remainder = dividend % divisor;
		
			if(remainder == 0)
			{
				hcf = divisor;
			}	
			else
			{
				dividend = divisor;
				divisor = remainder;
			}
			
        }while (remainder != 0);
        	
		System.out.println("HCF: " + hcf);	
	}
}