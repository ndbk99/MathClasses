package mathclasses;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
        System.out.print("Test primality of: ");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.print(n);
        
        if (prime(n)) { System.out.println(" is prime"); }
        else { System.out.println(" is composite."); }
        
        sc.close();
	}
    
    public static boolean prime(double n) {
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
}
