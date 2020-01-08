package forLoopPractice;

import java.util.Scanner;

public class TraverseString {

	public static void main(String[] args) {
		/*
		 * Traverse a string Ask the user for a name. Display a count of all the letter
		 * a’s in the name.
		 * 
		 * Examples Enter a name: Atlanta
		 * 
		 * There are 3 a's in Atlanta
		 */
		
		System.out.println("Enter a name:");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine().toLowerCase();
		input.close();
		
		int numAs = 0;

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == 'a') {
				numAs++;
			}
		}
		
		System.out.println("There are " + numAs + " a's in " + name);
	}

}
