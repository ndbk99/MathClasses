package mathclasses;

import java.util.Scanner;

// WORKS-- DO NOT ALTER, AS OF 4/18/15

public class EigenCalc {

	// Matrix array
    static double[][] matrix = new double[2][2];
    // Lambda array
    static double[] lambda = {0.0, 0.0};
    // a, b, c, d values for quadratic computations
    static double a, b, c, d;
    // i or not?
    
    public static void main(String args[]) {
        System.out.println("This program will find the eigenvalue(s) of a 2x2 matrix.");
        Scanner sc = new Scanner(System.in);
        
        // User input matrix elements
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print("(" + x + ", " + y + "): ");
                matrix[x][y] = sc.nextDouble();
            }
        }

        // Print eigenvalues
        System.out.println("Eigenvalues are " + eigenvalue(0) + " and " + eigenvalue(1));
        
        // Print eigenvectors
        System.out.println("Eigenvectors are (" + eigenvector(0,0) + ", " + eigenvector(0,1) + ") and (" + eigenvector(1,0) + ", " + eigenvector(1,1) + ")");
    
        sc.close();
    }
    
    // nth part of quadratic solution
    public static double formula(int n) {
        double t1 = -b / (2*a);
        double t2 = (Math.sqrt(Math.abs(Math.pow(b,2) - (4*a*c)))) / (2*a);
        double[] r = {t1,t2};
        return r[n];
    }
    
    // nth eigenvalue
    public static double eigenvalue(int n) {
        // find a, b, c of lambda quadratic
        a = 1;
        b = -(matrix[0][0] + matrix[1][1]);
        c = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        d = Math.pow(b,2) - (4*a*c);
        
        // find and return lambda
        lambda[0] = formula(0) - formula(1);
        lambda[1] = formula(0) + formula(1);
        return lambda[n];
    }
    
    // mth component of nth eigenvector
    public static double eigenvector(int n, int m) {
        double[] vector = {0.0, 0.0};

        double aComp = 1;
        double bComp = (lambda[n] - matrix[0][0]) / matrix[0][1];

        vector[0] = aComp;
        vector[1] = bComp;
        
        return vector[m];
    }
}