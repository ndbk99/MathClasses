package mathclasses;

import java.util.Scanner;

public class Sort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elements to sort? ");
		int n = sc.nextInt();
		int[] original = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("element" + i + ": ");
			original[i] = sc.nextInt();
		}		
		
		for (int j = 0; j < n; j++) {
			System.out.print(sorted(original, j) + "  ");
		}
		
		sc.close();
	}
	
	public static int sorted(int[] arr, int n) {
		int[] array = arr;
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (array[j] > array[i]) {
					int stored = array[i];
					array[i] = array[j];
					array[j] = stored;
				}
			}
		}
		return array[n];
	}

}