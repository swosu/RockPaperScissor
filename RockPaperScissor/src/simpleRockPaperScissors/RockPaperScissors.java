package simpleRockPaperScissors;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.println("Please enter your choice: 1: Rock, 2: Paper, or 3: Scissors");
		Scanner input = new Scanner(System.in);
		int user = input.nextInt();
		int computer = 3;
		
		if(user == computer) {
			System.out.println("We had a tie.");
		} else if (1 == user) {
			System.out.println("User: Rock");
			if(2 == computer) {
				System.out.println("Computer: Paper.");
				System.out.println("Paper covers rock, computer wins.");
			} else {
				System.out.println("Computer: Scissors");
				System.out.println("Rock smashes scissor, user wins.");
			}
		} else if (2 == user) {
			System.out.println("User: Paper");
			if(1 == computer) {
				System.out.println("Computer: Rock");
				System.out.println("Paper covers rock, user wins.");
			} else {
				System.out.println("Computer: Scissors");
				System.out.println("Scissors cut paper, computer wins.");
			}
		} else if (3 == user) {
			System.out.println("User: Scissors");
			if(1 == computer) {
				System.out.println("Computer: Rock");
				System.out.println("Rock smashes scissor, computer wins.");
			} else {
				System.out.println("Computer: Paper");
				System.out.println("Scissors cut paper, user wins.");
			}
		} else {
			System.out.println("User: Potato");
			System.out.println("Potato loses.");
		}
	}

}
