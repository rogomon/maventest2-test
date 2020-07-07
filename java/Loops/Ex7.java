package Loops;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		char escolha;
		int totali = 0;
		int totalp = 0;
		
		do
		{
			System.out.println("Digite um número inteiro:");
			numero = scan.nextInt();
			
			if (numero % 2 == 0)
			{
				totalp += numero;
			}
			else
			{
				totali += numero;
			}
			
			System.out.println("Deseja continuar? (Y / N)");
			escolha = scan.next	().charAt(0);
			
			scan.close();
			
		}while (escolha == 'y' || escolha == 'Y');
		
		System.out.println("Soma de números pares: " + totalp);
		System.out.println("Soma de números ímpares: " + totali);

	}

}
