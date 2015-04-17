package mathclasses;

import java.util.Scanner;

public class QuadSolver {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a-value: ");
        double a = sc.nextDouble();
        System.out.print("b-value: ");
        double b = sc.nextDouble();
        System.out.print("c-value: ");
        double c = sc.nextDouble();
        
        double d = Math.pow(b,2) - (4*a*c);
        if (d < 0) { 
            // print 2 conjugate imaginary roots
            System.out.println(solutionPlus(a,b,c)[0] + " + " + solutionPlus(a,b,c)[1] + "i, " + solutionMinus(a,b,c)[0] + " + " + solutionMinus(a,b,c)[1] + "i, ");
        }
        else if (d == 0) { 
            // print 1 double real root
            System.out.println(solutionPlus(a,b,c)[0]);
        }
        else { 
            // print 2 real roots
            System.out.println(solutionPlus(a,b,c)[0] + solutionPlus(a,b,c)[1]);
        }
        
        sc.close();
    }
    
    public static double[] solutionPlus(double a, double b, double c) {
        double t1 = -b / (2*a);
        double t2 = (-b + Math.sqrt(Math.abs(Math.pow(b,2) - (4*a*c)))) / (2*a);
        double[] p = {t1, t2};
        return p;
    }
    
    public static double[] solutionMinus(double a, double b, double c) {
        double t1 = -b / (2*a);
        double t2 = (-b - Math.sqrt(Math.abs(Math.pow(b,2) - (4*a*c)))) / (2*a);
        double[] m = {t1, t2};
        return m;
    }
}
