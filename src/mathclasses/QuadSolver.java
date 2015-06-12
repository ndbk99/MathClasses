package mathclasses;

import java.util.Scanner;

public class QuadSolver {
	
	static double a, b, c, d;
	
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a-value: ");
        a = sc.nextDouble();
        System.out.print("b-value: ");
        b = sc.nextDouble();
        System.out.print("c-value: ");
        c = sc.nextDouble();
        
        d = Math.pow(b,2) - (4*a*c);
        
        if (d < 0) { 
            // print 2 conjugate imaginary roots
            System.out.println(formula(0) + " + " + formula(1) + "i, " + formula(0) + " - " + formula(1) + "i, " + d);
        }
        else if (d == 0) { 
            // print 1 double real root
            System.out.println(formula(0));
        }
        else { 
            // print 2 real roots
            System.out.println((formula(0) + formula(1)) + ", " + (formula(0) - formula(1)));
        }
        
        sc.close();
    }
    
    public static double formula(int n) {
        double t1 = -b / (2*a);
        double t2 = (Math.sqrt(Math.abs(Math.pow(b,2) - (4*a*c)))) / (2*a);
        double[] r = {t1,t2};
        return r[n];
    }
}
