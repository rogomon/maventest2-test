package Loops;

public class Ex2 {

	public static void main(String[] args) {
		// Write a program to calculate the sum of the first 10 natural numbers.
		
		int sum = 0;
		int x = 1;
		
		for (x = 1; x <= 10; x++)
		{
			sum += x;
		}
		
		System.out.println("Sum: " + sum);

	}

}
