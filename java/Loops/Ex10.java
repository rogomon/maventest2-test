package Loops;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * Write a do-while loop that asks the user to enter two numbers.
		 * The numbers should be added and the sum displayed.
		 * The loop should ask the user whether he or she wishes to perform the operation again.
		 * If so, the loop should repeat; otherwise it should terminate.
		 */
		
		Scanner console = new Scanner(System.in);
		
		int num1, num2;
		char resp;
		
		do
		{
		System.out.println("Digite um número");
		num1 = console.nextInt();
		
		System.out.println("Digite outro número");
		num2 = console.nextInt();
		
		int soma = num1 + num2;
		System.out.println("Soma: " + soma);
		
		System.out.println("Deseja reiniciar o programa? Digite 'S' para sim ou 'N' para não.");
		resp = console.next().charAt(0);
		
		System.out.println();
		
		}while(resp=='S' || resp == 's');
		
		console.close();
		
	}
}