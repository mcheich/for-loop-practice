package forLoopPractice;

import java.util.Scanner;

public class NameBackwards {

	public static void main(String[] args) {
		/*
		 * Name Backwards Ask the user for a name and display the name backwards.
		 * 
		 * Examples Enter a name: Atlanta
		 * 
		 * atnaltA
		 */
		System.out.println(reverseInput(getInput()));

	}

	public static String reverseInput(String str) {
		
		String reverseInput = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reverseInput += str.charAt(i);
		}
		return reverseInput;
	}

	public static String getInput() {
		
		System.out.println("Enter a name:");
		Scanner input = new Scanner(System.in);
		String userInput = input.next();
		return userInput;
	}

}
