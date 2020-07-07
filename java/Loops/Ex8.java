package Loops;

import java.util.Scanner;

public class Ex8
{

	public static void main(String[] args) {
		/*
		 * Write a program that prompts the user to input a positive integer.
		 * It should then output a message indicating whether the number is a prime number. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro e positivo");
		int numero = scan.nextInt();
		scan.close();
		
		boolean flag = true;
		
		for (int i=2; i < numero; i++)
		{
			if (numero % i == 0)
			{
				flag = false;
				break;
			}
		}	
		
		if (flag && numero > 1)
		{
			System.out.println("É número primo");
		}
		else
		{
			System.out.println("Não é número primo");
		}
	}

}
