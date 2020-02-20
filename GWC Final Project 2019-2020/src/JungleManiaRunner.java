import java.util.Scanner;

public class JungleManiaRunner {

	public static void main(String[] args) {
		// Organizer for JungleManiaStoryBoard

		intro();
		choiceOne();
	}

	public static void intro() {
		JungleManiaStoryBoard.intro();
		JungleManiaStoryBoard.filler1();
	}

	public static void choiceOne() {
		Scanner intInput = new Scanner(System.in);

		System.out.println(
				"(1) Snoop around the area where the hammock is, to see if you can find any hints as to what to do next");
		System.out.println("(2) Walk around, to see if you can spot anything that might help");

		int choice1 = intInput.nextInt();

		if (choice1 == 1) {
			JungleManiaStoryBoard.choice1Snoop();
			// Choosing to snoop around the area of the hammock
		}

		if (choice1 == 2) {
			JungleManiaStoryBoard.choice2Leave();
			// Choosing to leave, not explore the area where you were 'dropped'
		}
	}

}
