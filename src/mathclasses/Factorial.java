package mathclasses;

public class Factorial {
	public static void main(String[] args) {
        for (int i = 1; i < 13; i++) {
            System.out.println(factorial(i));
        }
    }
    
    public static int factorial(int n) {
        int f;
        if (n == 1) { f = 1; }
        else { f = factorial(n-1) * n; }
        return f;
    }
}
