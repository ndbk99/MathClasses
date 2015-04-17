package mathclasses;

import java.util.Scanner;

public class EigenCalc {
    
    // Matrix array
    static double[][] matrix = new double[2][2];
    // Lambda array
    static double[] lambda = {0.0, 0.0};
    
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
        System.out.println("Eigenvalues are " + eigenvalue()[0] + " and " + eigenvalue()[1]);
        
        // Print eigenvectors
        System.out.println("Eigenvectors are (" + eigenvector(0)[0] + ", " + eigenvector(0)[1] + ") and (" + eigenvector(1)[0] + ", " + eigenvector(1)[1] + ")");
    
        sc.close();
    }
    
    // Find eigenvalues; return array of 2
    public static double[] eigenvalue() {
        // find a, b, c of lambda quadratic
        double a = 1;
        double b = -(matrix[0][0] + matrix[1][1]);
        double c = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        // find and return lambda
        lambda[0] = quadMinus(a,b,c);
        lambda[1] = quadPlus(a,b,c);
        return lambda;
    }
    
    // + quadratic solution
    public static double quadPlus(double a, double b, double c) {
        double p = (-b + Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        return p;
    }
    
    // - quadratic solution
    public static double quadMinus(double a, double b, double c) {
        double m = (-b - Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        return m;
    }
    
    // WRITE-- finds eigenvectors, returns array
    public static double[] eigenvector(int n) {
        double[] vector = {0.0, 0.0};

        double aComp = 1;
        double bComp = (lambda[n] - matrix[0][0]) / matrix[0][1];

        vector[0] = aComp;
        vector[1] = bComp;
        
        return vector;
    }
}

// Next steps:
// - include imaginary eigenvalues in solutions for eigenvalue()
