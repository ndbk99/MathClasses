package mathclasses;

import java.util.Scanner;

public class StatsCalc {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();
        double p3 = sc.nextDouble();
        
        double mean = (p1 + p2 + p3)/3 / Math.sqrt(3);
        double variance = Math.pow(p1-mean,2) + Math.pow(p2-mean,2) + Math.pow(p2-mean,2);
        double sd = Math.sqrt(variance);
        
        double z1 = (p1 - mean) / sd;
        double z2 = (p2 - mean) / sd;
        double z3 = (p3 - mean) / sd;
        
        System.out.println(z1 + ", " + z2 + ", " + z3);
        
        sc.close();
    }
}
