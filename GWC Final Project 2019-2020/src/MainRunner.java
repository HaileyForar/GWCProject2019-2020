import java.util.Scanner;

public class MainRunner {

	//TODO make sure to get time delays working as to give a better
	//story like environment
	
	public static void main(String[] args) 
	{
	  theBeginning();
	}
	
	public static void theBeginning()
	{
		StoryBoard.initialStory();
		StoryBoard.writingOfTheBook1();
		
		Scanner intInput = new Scanner(System.in);
		
		System.out.println("(1) Through the Cosmos");
		System.out.println("(2) Exploring the Unknown Depths");
		System.out.println("(3) Jungle Mania");
		System.out.println("(4) With the Fae");
		
		int choice1 = intInput.nextInt();
		
		
		
		
		
	}

}
