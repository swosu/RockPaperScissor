package rockPaperScissorsLizardSpock;

public class RockPaperScissorsLizardSpock {

	public static void main(String[] args) {
		System.out.println("Hello and welcome to RPSLS");

		int user = 2;
		int computer = 1;

		if(user == computer) {
			System.out.println("it was a tie.");
		} 
		else 
		{
			switch(user) {
			case 1: userPicksRock(computer); break;
			case 2: userPicksPaper(computer); break;
			default: 
				System.out.println("User: Potato");
				System.out.println("Potato loses.");
			}
		}
		System.out.println("So long and thanks for all the fish!");
	}

	private static void userPicksRock(int computer) {
		System.out.println("User: rock");
		switch(computer) {
		case 2:
			System.out.println("Computer: Paper");
			System.out.println("Paper covers rock.");
			System.out.println("User loses.");
			break;
		case 3:
			System.out.println("Computer: Scissors");
			System.out.println("Rock crushes scissors.");
			System.out.println("User wins.");
			break;
		case 4:
			System.out.println("Computer: Lizard");
			System.out.println("Rock crushes lizard.");
			System.out.println("User wins.");
			break;
		case 5:
			System.out.println("Computer: Spock");
			System.out.println("Spock vaporizes rock.");
			System.out.println("User loses.");
			break;
		default:
			System.out.println("Computer: Potato");
			System.out.println("Potato loses.");
		}
	}
	
	private static void userPicksPaper(int computer) {
		System.out.println("User: paper");
		switch(computer) {
		case 1: 
			System.out.println("Computer: Rock");
			System.out.println("Paper covers rock.");
			System.out.println("User wins.");
			break;
		case 3:
			System.out.println("Computer: Scissors");
			System.out.println("Scissors cuts Paper.");
			System.out.println("User loses.");
			break;
		case 4:
			System.out.println("Computer: Lizard");
			System.out.println("Lizard eats paper.");
			System.out.println("User loses.");
			break;
		case 5:
			System.out.println("Computer: Spock");
			System.out.println("Paper disproves spock.");
			System.out.println("User wins.");
			break;
		default:
			System.out.println("Computer: Potato");
			System.out.println("Potato loses.");
		}
		
	}

}
