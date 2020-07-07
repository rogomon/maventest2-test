package Loops;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
		 * For example, if the input is 12345, the output should be 54321.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int num = scan.nextInt();
		
		scan.close();
		
		int temp = num; 
		int reverso = 0;
		
		while (temp > 0)
		{
			int resto = temp % 10;
			reverso = reverso * 10 + resto;
			temp /= 10;
		}
		
		System.out.println("Reverso de " + num + " = " + reverso);

	}

}
