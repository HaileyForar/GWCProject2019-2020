import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainRunner {

	// TODO make sure to get time delays working as to give a better
	// story like environment

	public static void main(String[] args) {
		theBeginning();
//	  choiceOne();
	}

	public static void theBeginning() {
		StoryBoard.initialStory();
		StoryBoard.writingOfTheBook1();

		Scanner intInput = new Scanner(System.in);

		System.out.println("(1) Through the Cosmos");
		System.out.println("(2) Exploring the Unknown Depths");
		System.out.println("(3) Jungle Mania");
		System.out.println("(4) With the Fae");

		int choice1 = intInput.nextInt();

		// Through the Cosmos Story
		if (choice1 == 1) {
			// intro into the story overall
			StoryBoard.introToTheAdventure();

			// intro into the specific story the user chose
			ThroughTheCosmosRunner.intro();

			// running the first choice that the user faces within the story
			ThroughTheCosmosRunner.choiceOne();
		}

		// Exploring the Unknown Depths Story
		else if (choice1 == 2) {
			// intro to the story overall
			StoryBoard.introToTheAdventure();

			// intro into the specific story the user chose
			ExploringTheUnknownDepthsRunner.intro();

			// running the first choice that the user faces within the story
			ExploringTheUnknownDepthsRunner.choiceOne();
		}

		// Jungle Mania Story
		else if (choice1 == 3) {
			// intro to the story overall
			StoryBoard.introToTheAdventure();

			// intro into the specific story the user chose
			JungleManiaRunner.intro();

			// running the first choice that the user faces within the story
			JungleManiaRunner.choiceOne();
		}

		// With the Fae Story
		else if (choice1 == 4) {
			// intro to the story overall
			StoryBoard.introToTheAdventure();

			// intro into the specific story the user chose
			WithTheFaeRunner.intro();

			// running the first choice that the user faces within the story
			WithTheFaeRunner.choiceOne();
		}

	}

}
