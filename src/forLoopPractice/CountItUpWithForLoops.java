package forLoopPractice;

import java.util.Scanner;

public class CountItUpWithForLoops {

	public static void main(String[] args) {
		/*
		 * Count it up (did’t we already do this??) Ask the user for a number. Display a
		 * count from 0 up to the number in your output.
		 * 
		 * Examples Enter a number: 8
		 * 
		 * 0 1 2 3 4 5 6 7 8 I just counted to 8!
		 */
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		input.close();
		
		for(int i = 0; i <= userInput; i++) {
			System.out.print(i + " ");
		}
		System.out.println("I just counter to " + userInput);
	}

}
