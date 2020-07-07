package Loops;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/* 
		 * Two numbers are entered through the keyboard. 
		 * Write a program to find the value of one number raised to the power of another.
		 * (Do not use Java built-in method)
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro e positivo para servir de base:");
		int base = scan.nextInt();
		
		System.out.println("Digite um número inteiro e positivo para servir de expoente:");
		int expoente = scan.nextInt();
		
		scan.close();
		
		int result = 1;
		int i = 1;
		
		for (i = 1; i <= expoente; i++)
		{
			result *= base; 
		}
		
		System.out.println("Resultado: " + result);

	}

}
