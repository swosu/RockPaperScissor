package rockPaperScissorsLizardSpock;

public class RockPaperScissorsLizardSpock {

	public static void main(String[] args) {
		System.out.println("Hello and welcome to RPSLS");

		int user = 5;
		int computer = 6;

		if(user == computer) {
			System.out.println("it was a tie.");
		} 
		else 
		{
			switch(user) {
			case 1: userPicksRock(computer); break;
			case 2: userPicksPaper(computer); break;
			case 3: userPicksScissors(computer); break;
			case 4: userPicksLizard(computer); break;
			case 5: userPicksSpock(computer); break;
			default: 
				System.out.println("User: Potato");
				System.out.println("Potato loses.");
			}
		}
		System.out.println("So long and thanks for all the fish!");
	}

	private static void userPicksRock(int computer) {
		System.out.println("User: Rock");
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
		System.out.println("User: Paper");
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
	
	private static void userPicksScissors(int computer) {
		System.out.println("User: Scissors");
		switch(computer) {
		case 1: 
			System.out.println("Computer: Rock");
			System.out.println("Rock crushes scissors.");
			System.out.println("User loses.");
			break;
		case 2:
			System.out.println("Computer: Paper");
			System.out.println("Scissors cuts paper.");
			System.out.println("User wins.");
			break;
		case 4:
			System.out.println("Computer: Lizard");
			System.out.println("Scissors decapitates lizard.");
			System.out.println("User win.");
			break;
		case 5:
			System.out.println("Computer: Spock");
			System.out.println("Spock smashes scissors.");
			System.out.println("User loses.");
			break;
		default:
			System.out.println("Computer: Potato");
			System.out.println("Potato loses.");
		}
	}

	private static void userPicksLizard(int computer) {
		System.out.println("User: Lizard");
		switch(computer) {
		case 1: 
			System.out.println("Computer: Rock");
			System.out.println("Rock crushes lizard.");
			System.out.println("User loses.");
			break;
		case 2:
			System.out.println("Computer: Paper");
			System.out.println("Lizard eats paper.");
			System.out.println("User wins.");
			break;
		case 3:
			System.out.println("Computer: Scissors");
			System.out.println("Scissors decapitates lizard.");
			System.out.println("User loses.");
			break;
		case 5:
			System.out.println("Computer: Spock");
			System.out.println("Lizard poinsons Spock.");
			System.out.println("User wins.");
			break;
		default:
			System.out.println("Computer: Potato");
			System.out.println("Potato loses.");
		}	
	}
	
	private static void userPicksSpock(int computer) {
		System.out.println("User: Spock");
		switch(computer) {
		case 1: 
			System.out.println("Computer: Rock");
			System.out.println("Spock vaporizes rock.");
			System.out.println("User wins.");
			break;
		case 2:
			System.out.println("Computer: Paper");
			System.out.println("Paper disproves spock.");
			System.out.println("User loses.");
			break;
		case 3:
			System.out.println("Computer: Scissors");
			System.out.println("Spock smashes scissors.");
			System.out.println("User wins.");
			break;
		case 4:
			System.out.println("Computer: Lizard");
			System.out.println("Lizard poinsons Spock.");
			System.out.println("User loses.");
			break;
		default:
			System.out.println("Computer: Potato");
			System.out.println("Potato loses.");
		}	
		
	}
}
