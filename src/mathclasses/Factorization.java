package mathclasses;

import java.util.Scanner;

public class Factorization {
	public static void main(String args[]) {
		System.out.print("Enter number to factor: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for (int x = 0; x < 50; x++) {
			if (factor(input)[x] == 0) { }
			else {
				System.out.println(factor(input)[x]);
			}
		}
		
		System.out.println("DONE");
		
		sc.close();
	}
	
	public static int[] factor(int n) {
		int[] factors = new int[50];
		int number = n;
		int index = 0;
		int i = 2;
		
		while (i < n) {
			if (number % i == 0) {
				factors[index] = i;
				number = number / i;
				index++;
			} else {
				i++;
			}
		}
		
		return factors;
	}
}