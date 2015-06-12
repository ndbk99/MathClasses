package mathclasses;

import java.util.Scanner;

public class Harmonic {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Note location length (cm): ");
		int a = sc.nextInt();
		System.out.print("String length (cm): ");
		int b = sc.nextInt();
		
		int n = reducedDenom(a,b);
		
		System.out.println("INIT");
		System.out.println("String fraction = 1/" + n);
		System.out.println("Harmonic frequency = " + freq(n));
		System.out.println("DONE");
		
		sc.close();
	}
	
	public static int lcd(int a, int b) {		
		int lcd = 1;
		
		for (int x = 2; x <= a; x++) {
			if ((a % x == 0) && (b % x == 0)) {
				lcd = x;
				break;
			} else { }
		}
		
		return lcd;
	}
	
	public static int reducedDenom(int a, int b) {
		int m = a;
		int n = b;
		int gcd = 1;
		int lcd = lcd(m,n);
		
		while (lcd != 1) {
			gcd = gcd * lcd;
			m = m / lcd;
			n = n / lcd;
			lcd = lcd(m,n);
		}
		
		return n;
	}
	
	public static double freq(int n) {
		double f = 440.0 / n;
		return f;
	}
}