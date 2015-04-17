package mathclasses;

public class GEB {
	public static void main(String[] args) {
        for (int i = 0; i <= 200; i++) {
            int f = f(i);
            int m = m(i);
            System.out.print(i + ": F=" + f + ", M=" + m);
            if (f == m) { System.out.println(""); }
            else { System.out.println(" FIBO "); }
        }
    }
    
    public static int m(int n) {
        int x;
        if (n == 0) { x = 0; }
        else { x = n - f(m(n-1)); }
        return x;
    }
    
    public static int f(int n) {
        int y;
        if (n == 0) { y = 1; }
        else { y = n - m(f(n-1)); }
        return y;
    }
}
