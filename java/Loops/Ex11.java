package Loops;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 * Write a program to enter the numbers till the user wants.
		 * At the end it should display the count of positive, negative and zeros entered.
		 */
		
		Scanner console = new Scanner(System.in);
		
		int numero;
		char resp;
		int positivo = 0;
		int negativo = 0;
		int zero = 0;
		
		do
		{
			System.out.println("Digite um número");
			numero = console.nextInt();
			
			if (numero == 0)
			{
				zero++; 
			}
			else if (numero > 0)
			{
				positivo++;
			}
			else if (numero < 0)
			{
				negativo++;
			}
		
			System.out.println("Gostaria de digitar outro número? (S/N)"); 
			resp = console.next().charAt(0);
		
		}while (resp == 'S' || resp == 's');
		
		if (resp == 'N' || resp == 'n')
		{
			System.out.println("Zeros: " + zero);
			System.out.println("Positivos: " + positivo);
			System.out.println("Negativos: " + negativo);
		}
			
		console.close();
		
	}

}
