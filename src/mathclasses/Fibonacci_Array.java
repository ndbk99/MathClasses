package mathclasses;

public class Fibonacci_Array {
	static int g = 1476;
    public static void main(String args[]) {
        fiboArray[1] = 1;
        fiboArray[2] = 1;
        for (int n = 2; n < g; n++) {
            double x = fiboArray[n-1] + fiboArray[n-2];
            fiboArray[n] = x;
            System.out.print(n + ") " + x);
            if (prime(x)) { System.out.println(" PRIME "); }
            else { System.out.print("\n"); }
        }        
    }
    
    static double[] fiboArray = new double[g];

    public static boolean prime(double n) {
        boolean prime = true;
        for (double i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
