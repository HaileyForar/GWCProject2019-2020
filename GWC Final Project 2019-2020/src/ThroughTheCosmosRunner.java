import java.util.Scanner;

public class ThroughTheCosmosRunner {

	public static void main(String[] args)
	{
		// Organizer for ThroughTheCosmosStoryBoard
		
		intro();
	}
	
	public static void intro(){
		ThroughTheCosmosStoryBoard.intro();
		ThroughTheCosmosStoryBoard.filler1();
		
		Scanner intInput = new Scanner(System.in);
		
		System.out.println("(1) Snoop around the tiny cabin to see if you are able to find anything worth while");
		System.out.println("(2) Try the door, if it's unlocked...go exploring. It's probably much better in terms of time to seach outside the room");
		
		int choice1 = intInput.nextInt();
		
		if(choice1 == 1) {
			ThroughTheCosmosStoryBoard.choice1Snoop();
			//Choosing to snoop through the room instead of leaving to search elsewhere
		}
		
		if(choice1 == 2) {
			ThroughTheCosmosStoryBoard.choice2Leave();
			//Choosing to leave, or at least attempt to leave the room, and not search it
		}
	}

}
