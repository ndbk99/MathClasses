package mathclasses;

import java.util.Scanner;

public class CellularAutomata {
	static int[] rule = {1,0,1,0,1,0,1,0};
	
	static int[] a = {0,0,0};
	static int[] b = {0,0,1};
	static int[] c = {0,1,0};
	static int[] d = {0,1,1};
	static int[] e = {1,0,0};
	static int[] f = {1,0,1};
	static int[] g = {1,1,0};
	static int[] h = {1,1,1};
	
	static int columns = 50;
	static int rows = 1;
	
	static int[] firstRow = new int[columns];
	
	static int[][] rowArray = new int[columns][rows];
	
	public static void main(String[] args) {
		System.out.print("Number of rows: ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		for (int i = 0; i < columns; i++) {
			if (i == Math.round(columns/2)) {
				System.out.print("X");
				firstRow[i] = 1;
			} else { 
				System.out.print("-");
				firstRow[i] = 0;				
			}
		}
		
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < columns; c++) {
				int[] neighborhood = {0,0,0};
			}
		}
		
		sc.close();
	}
	
}