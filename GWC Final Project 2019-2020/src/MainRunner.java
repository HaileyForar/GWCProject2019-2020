import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainRunner {

	//TODO make sure to get time delays working as to give a better
	//story like environment
	
	public static void main(String[] args) 
	{
	  theBeginning();
	}
	
	public static void theBeginning()
	{
//		StoryBoard.initialStory();
		StoryBoard.writingOfTheBook1();
		
		Scanner intInput = new Scanner(System.in);
		
		System.out.println("(1) Through the Cosmos");
		System.out.println("(2) Exploring the Unknown Depths");
		System.out.println("(3) Jungle Mania");
		System.out.println("(4) With the Fae");
		
		int choice1 = intInput.nextInt();
		
		if(choice1 == 1)
		{
			StoryBoard.introToTheAdventure();
			//Through the Cosmos
		}
		
		else if(choice1 == 2)
		{
			StoryBoard.introToTheAdventure();
			//Exploring the Unknown Depths
		}
		
		else if(choice1 == 3)
		{
			StoryBoard.introToTheAdventure();
			//Jungle Mania
		}
		
		else if(choice1 == 4)
		{
			StoryBoard.introToTheAdventure();
			//With the Fae
		}
		
		
		
	}

}
