package mathclasses;

import java.util.Scanner;

public class EigenCalc_Imaginary {
	// Matrix array
    static double[][] matrix = new double[2][2];
    // Lambda array
    static double[] lambda = {0.0, 0.0};
    
    static double a;
    static double b;
    static double c;
    
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
    
    // Find eigenvalues; return 0th or 1st depending on n
    public static double eigenvalue(int n) {
        // find a, b, c of lambda quadratic
        a = 1;
        b = -(matrix[0][0] + matrix[1][1]);
        c = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        // find and return lambda
        lambda[0] = quadMinus();
        lambda[1] = quadPlus();
        return lambda[n];
    }
    
    // + quadratic solution
    public static double quadPlus() {
        double p = (-b + Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        return p;
    }
    
    // - quadratic solution
    public static double quadMinus() {
        double m = (-b - Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        return m;
    }
    
    // Find 0th or 1st eigenvector, returns component array
    public static double eigenvector(int n, int m) {
        double[] vector = {0.0, 0.0};

        double aComp = 1;
        double bComp = (lambda[n] - matrix[0][0]) / matrix[0][1];

        vector[0] = aComp;
        vector[1] = bComp;
        
        return vector[m];
    }
}
