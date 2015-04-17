package mathclasses;

public class Fibonacci {
	public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            double fibo = fibonacci(i);
            System.out.print(fibo + ", ");
            if (prime(fibo)) { System.out.println("  PRIME"); }
            else { System.out.println(""); }
        }
    }
    
    public static double fibonacci(int n) {
        double f;
        if (n == 0) { f = 0; }
        else if (n == 1) { f = 1; }
        else { f = fibonacci(n - 1) + fibonacci(n - 2); }        
        return f;
    }
    
    public static boolean prime(double n) {
        boolean prime = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
