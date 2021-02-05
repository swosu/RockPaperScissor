package simpleRockPaperScissors;

import java.util.Scanner;

public class IfRockPaperScissor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your choice: 1: Rock,  2: Paper, or 3: Scissors");
		
		int user = input.nextInt();
		
		int computer = (int)(Math.random()*3+1);
		System.out.println("Computer selected: " + computer);
		
		if(user == computer) {
			System.out.println("We had a tie.");
		} else if (1 == user) {
			System.out.println("User: Rock");
			if(2 == computer) {
				System.out.println("Computer: Paper");
				System.out.println("Paper beats rock, computer wins.");
			} else {
				System.out.println("User wins!");
			}
		} else if (2 == user) {
			System.out.println("User: Paper");
			if(1 == computer) {
				System.out.println("Computer: Rock");
				System.out.println("Paper beats rock, user wins.");
			} else {
				System.out.println("User loses.");
			}
		} else if (3 == user) {
			System.out.println("User: Scissors");
			if(1 == computer) {
				System.out.println("Computer: Rock");
				System.out.println("Rock beats Scissors. Computer Wins.");
			} else {
				System.out.println("User Wins.");
			}
		} else {
			System.out.println("User: Potato");
			System.out.println("Potato Loses.");
		}
		
		System.out.println("Bye.");
		input.close();
	}

}
