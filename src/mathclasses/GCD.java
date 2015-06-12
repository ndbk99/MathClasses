package mathclasses;

import java.util.Scanner;

public class GCD {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number 1: ");
		int a = sc.nextInt();
		System.out.print("Number 2: ");
		int b = sc.nextInt();
		
		if (a > b) {
			int c = b;
			b = a;
			a = c;
		}

		System.out.println("GCD = " + gcd(a,b));
		
		sc.close();
	}
	
	public static int lcd(int a, int b) {		
		int lcd = 1;
		int n = a;
		int m = b;
		
		for (int x = 2; x <= a; x++) {
			if ((n % x == 0) && (m % x == 0)) {
				lcd = x;
				break;
			} else { }
		}
		
		return lcd;
	}
	
	public static int gcd(int a, int b) {
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
		
		return gcd;
	}
}
