package mathclasses;

public class NumberOfFactors {
	
	static int max = 100;
	
	public static void main(String args[]) {
		for (int n = 1; n < max; n++) {
			System.out.println(n + ": " + factors(n));
		}
	}
	
	public static int factors(int x) {
		int count = 0;
		if (x == 1) { return 1; }
		for (int i = 2; i <= (x/2); i++) {
			if (x % i == 0) {
				count++;
			}
		}
		return count;
	}

}
