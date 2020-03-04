public class WithTheFaeStoryBoard {

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
		//Main, text-heavy ExploringTheUnknownDepths class
		
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

		System.out.println("You seem to be laying on some sort of bed...made of moss?.");
		System.out.println("There is color everywhere in this small room, flowers blooming, vines creeping up the walls..");
		System.out.println("'Strange. Why would that need to be the case?' you think, taking another look around, then looking down at yourself. Tiny delicate hands, your legs shorter than you remember.");
		System.out.println();

		delay();

		System.out.println("You look around yet again, then you notice a looking glass, hanging suspended from some flowering vines. You look at your reflection, the first thing you notice is that your ears are now...");
		
		delay();
		
		System.out.println("You stop, sitting up in the bed, narrowly missing the low hanging canopy of wood and flowers over the bed.");
		System.out.println("Your ears are pointed!");
		System.out.println();

		delay();

		System.out.println("\" It was the book! \"");
		System.out.print("you exclaim outloud, excitedly jumping out of the bed...or trying to");
		System.out.println();

		delay();

		System.out.println("A deep thunk reverberates around the room as your skull comes into contact with one of the logs making up the canopy over your head..");
		System.out.println();

		delay();

		System.out.println(
				"As you stumble out of bed, clutching your now throbbing head, you decide that you have to figure out what you have to do to get back to the dusty bookshop.");
		System.out.println(
				"You know why you are here, at least you are surmizing that you are on a ship...because that was the adventure that you chose in the book...");
		System.out.println();

		delay();

		System.out.println("\"With the Fae\"");
		System.out.print("you think outloud again, walking over the tiny space to look through the porthole.");
		System.out.println();
	}

	//Filler in between a choice and the intro (mainly pertinent in the runner class)
	public static void filler1() {
		System.out.println("In looking at the looking glass more carefully, you see that your previous deduction was in fact correct. You realize you are faced with two choices.");
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
		System.out.println("Pulling back from the looking glass, you turn to face the moss bed, and frown.");
		System.out.println("There really isn't anything in the room but that, and a small chest of drawers next to the bed on the other side.");
		System.out.println();
		
		delay();
		
		System.out.println("Heaving a sigh, you go back to the bed that you had just been laying on...");
		System.out.println("You lean down to have a look, nothing out of order, except a slight indent where you had just been laying");
		System.out.println();
		
		delay();
		
		System.out.println("Just as you do this however, you hear someone burst in.");
		System.out.println();
		
		delay();
		
		System.out.println("\"What are you still doing in here?? We have to go assist Her Majesty!!\"");
	}
	
	//The second option of the first time the user has to make a decision in this story
	public static void choice2Leave() {
		System.out.println("Pulling back from the looking glass, you turn to face the door that seems to be simply a slab of wood.");
		System.out.println("You touch the handle...rough warm bark scratching your hand.");
		System.out.println();
		
		delay();
		
		System.out.println("Heaving a nervous breath, you push the door open, swinging the extremely light door open.");
		System.out.println("A wall faces you, the same vines and flowers covering everything, as you look from left to right.");
		System.out.println();
		
		delay();
		
		System.out.println("You step out, realizing that you are wearing comfortable satiny slippers as soft fabric whisperes along the moss covered floor");
		System.out.println("Starting down the hall, you head a particular way, seeing if you can find something worth while.");
		System.out.println();
		
		delay();
		
		System.out.println("You hear footsteps heading your way, but you couldn't tell exactly where they were coming from because they were so fine and quiet.");
		System.out.println();
		
		delay();
		
		System.out.println("\"Are you finally ready?? Her Majesty is waiting!!\"");
	
	}

}
