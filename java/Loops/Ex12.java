package Loops;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
				
		Scanner console = new Scanner(System.in);
		
		int numero;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		char resp;
		
		do
		{
			System.out.println("Digite um número");
			numero = console.nextInt();
			
			if (numero > maior)
			{
				maior = numero;
			}
			
			if (numero < menor)
			{
				menor = numero;
			}
			
			System.out.println("Gostaria de digitar outro número?(S/N)");
			resp = console.next().charAt(0);
		
		}while (resp == 'S' || resp == 's');
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
		console.close();
	}
}