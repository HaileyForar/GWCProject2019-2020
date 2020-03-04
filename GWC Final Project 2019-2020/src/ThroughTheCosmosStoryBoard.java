public class ThroughTheCosmosStoryBoard {

	public static void delay()
	{
		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	
	public static void main(String[] args) 
	{
		//Main, text-heavy ThroughTheCosmos class
		
		intro();
		filler1();
		choice1Snoop();
		choice2Leave();
	}
	
	//Intro to this mini-story
	public static void intro() {
		System.out.println(
				"You slowly try to open your eyes, all the while holding your breath, scared to see whatever was behind the darkness of your eyelids.");
		System.out.println();
		System.out.println("You crack one eye open...");
		System.out.println();
		
		delay();

		System.out.println("Then the next");
		
		delay();

		System.out.println("You seem to be laying on some sort of cot...no you're laying...vertically against the wall, in a very tight small room.");
		System.out.println(
				"The walls are white, the sleeping bag you are in, dark blue. Not much color in this small room, besides your 'bed'.");
		System.out.println(
				"'Strange. Why would that need to be the case?' you think, taking another look around, finally noticing the small circular window that was invisible unless you moved to see it.");
		System.out.println();

		delay();

		System.out.println("Then it dawns on you...it's a porthole!");
		System.out
				.println("You stop, unzipping the bag, in order to have a look out of your newfound porthole.");
		System.out.println();

		delay();

		System.out.println("\" It was the book! \"");
		System.out.print("you exclaim outloud, excitedly jumping out of the bed...or trying to");
		System.out.println();

		delay();

		System.out.println("As you try to jump out of bed, you realize that it isn't so much as jumping out of bed...as it is floating out of bed.");
		System.out.println();

		delay();

		System.out.println(
				"As you float towards the porthole, you decide that you have to figure out what you have to do to get back to the dusty bookshop.");
		System.out.println(
				"You know why you are here, at least you are surmizing that you are on...well you really have no idea where you are, besides you think that you are not on earth anymore...because that was the adventure that you chose in the book...");
		System.out.println();

		delay();

		System.out.println("\"Through The Cosmos\"");
		System.out.print("you think outloud again, floating over the tiny space to look through the porthole.");
		System.out.println();
	}

	//Filler in between a choice and the intro (mainly pertinent in the runner class)
	public static void filler1() {
		System.out.println("In looking through the porthole, you find earth filling the entirety of your view, as your breath is knocked out of you, you realize you have two choices.");
		System.out.println();
		
		delay();

		System.out.println("You know that you must make the correct choice, for each one will alter your story...");
		System.out.println();
		
		delay();

		System.out.println("...and possibly alter your chances of getting home.");
		System.out.println();
	}
	
	//The first option of the first time the user has to make a decision in this story
	public static void choice1Snoop(){
		System.out.println("Pulling back from the porthole, you turn to face the bag hanging from the wall, and frown.");
		System.out.println("There really isn't anything in the room but that.");
		System.out.println();
		
		delay();
		
		System.out.println("Heaving a sigh, you float back to the sleeping bag anchored to the wall that you were just laying in...");
		System.out.println("You lean down as best you can with antigravity to study the sleeping bag, and anything around it...");
		System.out.println();
		
		delay();
		
		System.out.println("Just as you do this however, you hear the door burst open.");
		System.out.println();
		
		delay();
		
		System.out.println("\"Are you ready?! Your crew is waiting for orders Captain!!\"");
	}
	
	//The second option of the first time the user has to make a decision in this story
	public static void choice2Leave() {
		System.out.println("Pulling back from the porthole, you turn to face the door.");
		System.out.println("You touch the handle...cool metal meets your warm palm");
		System.out.println();
		
		delay();
		
		System.out.println("Heaving a nervous breath, you turn the handle, swinging the heavy sealed door swings partially open.");
		System.out.println("A wall faces you, the same color as in the cabin, but in looking down the 'hallway' you find an airlock on one side, and a curving tunnel on the other.");
		System.out.println();
		
		delay();
		
		System.out.println("You float out, half colliding with the wall, noticing that you are barefoot");
		System.out.println("Starting down the tunnel side, you float down, trying to find anything that could give you any hints.");
		System.out.println();
		
		delay();
		
		System.out.println("You hear someone talking down around the corner...");
		System.out.println();
		
		delay();
		
		System.out.println("\"Are you ready?! Captain, we are waiting for your orders!!\"");
	
	}

}