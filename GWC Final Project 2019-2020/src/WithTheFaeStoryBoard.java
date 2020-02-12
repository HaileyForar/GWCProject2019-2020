public class WithTheFaeStoryBoard {

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
		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println("Then the next");
		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println("You seem to be laying on some sort of cot...no bunk bed, in a very tight small room.");
		System.out.println(
				"The walls are white, the sheets white. Not much color in this small room, the bed bolted both to the wall and the floor.");
		System.out.println(
				"'Strange. Why would that need to be the case?' you think, taking another look around, finally noticing the small circular window that was invisible unless you moved to see it.");
		System.out.println();

		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println("Then it dawns on you...it's a porthole!");
		System.out
				.println("You stop, sitting up in the bed, narrowly missing bashing your head on the bed above yours.");
		System.out.println();

		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println("\" It was the book! \"");
		System.out.print("you exclaim outloud, excitedly jumping out of the bed...or trying to");
		System.out.println();

		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println("A clang rings out as you bash your skull squarely on the top bunk.");
		System.out.println();

		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println(
				"As you stumble out of bed, clutching your now throbbing head, you decide that you have to figure out what you have to do to get back to the dusty bookshop.");
		System.out.println(
				"You know why you are here, at least you are surmizing that you are on a ship...because that was the adventure that you chose in the book...");
		System.out.println();

		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println("\"Exploring The Unknown Depths\"");
		System.out.print("you think outloud again, walking over the tiny space to look through the porthole.");
		System.out.println();
	}

	//Filler in between a choice and the intro (mainly pertinent in the runner class)
	public static void filler1() {
		System.out.println("In looking through the porthole, you see nothing but vast blue sea as far as you can see. You realize you are faced with two choices.");
		System.out.println();
		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println("You know that you must make the correct choice, for each one will alter your story...");
		System.out.println();
		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println("...and possibly alter your chances of getting home.");
	}
	
	//The first option of the first time the user has to make a decision in this story
	public static void choice1Snoop(){
		System.out.println("Pulling back from the porthole, you turn to face the bunk bed, and frown.");
		System.out.println("There really isn't anything in the room but those.");
		System.out.println();
		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println("Heaving a sigh, you went back to the bottom bunk that you had just been laying on...");
		System.out.println("You lean down to have a look at the crumpled, thrown back sheets...");
		System.out.println();
		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println("Just as you do this however, you hear the door burst open.");
		System.out.println();
		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println("\"Are you ready?! The sub will leave without you if you don't get up on deck right now!!\"");
	}
	
	//The second option of the first time the user has to make a decision in this story
	public static void choice2Leave() {
		System.out.println("Pulling back from the porthole, you turn to face the door.");
		System.out.println("You touch the handle...cool metal meets your warm palm");
		System.out.println();
		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println("Heaving a nervous breath, you turn the handle, swinging the heavy door on squeaky hinges open.");
		System.out.println("A wall faces you, the same color as in the cabin, but in looking down the hallway you see that there are pictures every couple yards.");
		System.out.println();
		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println("You step out, realizing that you are wearing comfortable sandals as the rubber soles squeak on the metal threshold");
		System.out.println("Starting down the hall, you head a particular way, seeing if you can find something worth while.");
		System.out.println();
		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println("You hear footsteps pounding your way...");
		System.out.println();
		try {
			Thread.sleep(5000);
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println("\"Are you ready?! The sub will leave without you if you don't get up on deck right now!!\"");
	
	}

}
