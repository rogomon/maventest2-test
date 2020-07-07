package Loops;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/* Write a program that prompts the user to input a positive integer. 
		 * It should then print the multiplication table of that number. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número positivo e inteiro entre 1 e 10: ");
		
		int num = scan.nextInt();
		scan.close();
		
		int i = 1;
		
		for (i=1; i <= 10; i++)
		{
			System.out.println(num + " x " + i + " = " + (num * i));
		}

		
		
	}

}
