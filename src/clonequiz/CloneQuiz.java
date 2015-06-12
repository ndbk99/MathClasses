package clonequiz;

import java.util.Scanner;

public class CloneQuiz {
	private static Scanner sc;
	
	static int[] counts = {0,0,0,0,0,0};
	static String[] clones = {"Sarah", "Cosima", "Alison", "Helena", "Rachel", "Beth"};
	// sarah = 0, cosima = 1, alison = 2, helena = 3, rachel = 4, beth = 5

	public static void main(String[] args) {
		System.out.println("Alright, it's the clone quiz-- which of the Big 6 are you most like? Type yes or no and then hit enter to answer each question");
		question("Do you prefer going out for the evening over hanging out at home?", 0, 1); // sarah cosima
		question("Do you like downtown more than the suburbs?", 0, 2); // sarah alison
		question("Are you clingy?", 3, 0); // sarah helena
		question("Are you driven more by thoughts than emotions?", 4, 0); // sarah rachel
		question("Are you able to be happy in harsh circumstances?", 0, 5); // sarah beth
		question("Are you more idealistic than practical?", 1, 2); // cosima alison
		question("Do you value knowledge more than people?", 1, 3); // cosima helena
		question("Are you generally open-minded?", 1, 4); // cosima rachel
		question("Do you have a good sense of humor?", 1, 5); // cosima beth
		question("Do you need stability in order to be happy?", 2, 3); // alison helena
		question("Are you motherly?", 2, 4); // alison rachel
		question("On a bad day, are you more likely to be depressed than anxious?", 5, 2); // alison beth
		question("Are you compassionate even under harsh circumstances?", 3, 4); // rachel helena
		question("Are you concerned with keeping up the appearance of always being okay?", 5, 3); // helena beth
		question("Are you in good control of yourself?", 4, 5); // rachel beth
		
		sort();
	}
	
	public static void question(String str, int i, int j) {
		System.out.println(str);
		sc = new Scanner(System.in);
		String answer = sc.next();
		if (answer.equals("yes")) {
			counts[i]++;
		}
		else if (answer.equals("no")) {
			counts[j]++;
		} else {
			System.out.println("ERROR: please enter yes or no");
			question(str, i, j);
		}
	}
	
	public static void sort() {
		int max = 0;
		
		for (int i = 0; i < 6; i++) {
			if (counts[i] > max) {
				max = counts[i];
			}
		}
		
		int x = 0;
		int length = 0;
		int[] array = {0,0,0,0,0,0};
		
		for (int j = 0; j < 6; j++) {
			if (counts[j] == max) {
				x++;
				array[length] = j;
				length++;
			}
		}
		
		if (x == 1) { System.out.println("You are most like " + clones[array[0]] + "!"); }
		else if (x == 2) { System.out.println("You are most like " + clones[array[0]] + " and " + clones[array[1]] + "!"); }
		else if (x == 3) { System.out.println("You are most like " + clones[array[0]] + ", " + clones[array[1]] + " and " + clones[array[2]] + "!"); }
		else if (x == 4) { System.out.println("You are most like " + clones[array[0]] + ", " + clones[array[1]] + ", " + clones[array[2]] + " and " + clones[array[3]]+ "!"); }
		

		for (int i = 0; i < 6; i++) {
			System.out.println(clones[i] + ": " + counts[i]);
		}
	}
}