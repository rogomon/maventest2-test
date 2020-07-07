package Loops;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Write a program to find the factorial value of any number entered through the keyboard.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro e positivo:");
		
		int num = scan.nextInt();
		scan.close();
		
		int fatorial = 1;
		int i = 1;
		
		for (i = 1; i <= num; i++)
		{
			fatorial *= i;
		}
		
		System.out.println(num + "!" + " = " + fatorial);

	}

}
