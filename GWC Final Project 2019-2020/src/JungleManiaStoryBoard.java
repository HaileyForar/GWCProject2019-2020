public class JungleManiaStoryBoard {

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
		//Main, text-heavy JungleMania class
		
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

		System.out.println("You seem to be laying on some sort of cot...no in a hammock.");
		System.out.println(
				"In looking up, you find a picturesque blue sky, not a cloud in sight...");
		System.out.println(
				"'Strange. Why would that need to be the case?' you think, taking another look around, noticing the trees that seemed to touch the beautiful blue sky all around you.");
		System.out.println();

		delay();

		System.out.println("Then it dawns on you...the Jungle!");
		System.out
				.println("You stop, sitting bolt upright in the hammock, nearly falling out.");
		System.out.println();

		delay();

		System.out.println("\" It was the book! \"");
		System.out.print("you exclaim outloud, excitedly jumping out of the hammock...or trying to");
		System.out.println();

		delay();

		System.out.println("A crash drowns out your thoughts as you fall out of your hammock.");
		System.out.println();

		delay();

		System.out.println(
				"As you stumble to a standing position, clutching your now throbbing head, you decide that you have to figure out what you have to do to get back to the dusty bookshop.");
		System.out.println(
				"You know why you are here, at least you are surmizing that you are in the midst of a jungle...because that was the adventure that you chose in the book...");
		System.out.println();

		delay();

		System.out.println("\"Jungle Mania\"");
		System.out.print("you think outloud again, walking around the hammock, strung up between two of the bohemouth trees.");
		System.out.println();
	}

	//Filler in between a choice and the intro (mainly pertinent in the runner class)
	public static void filler1() {
		System.out.println("In looking around, you are faced with a couple decisions.");
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
		System.out.println("Turning around, you stare back at the hammock, slightly swaying in the breeze.");
		System.out.println("There really isn't anything around but that.");
		System.out.println();
		
		delay();
		
		System.out.println("Heaving a sigh, you went back to the hammock that you had just been laying on...");
		System.out.println("You lean down to have a look at the ground around it, surveying the trees that it's tied to...");
		System.out.println();
		
		delay();
		
		System.out.println("Just as you do this however, you hear leaves crunching, boots through the leaves on the floor of the jungle.");
		System.out.println();
		
		delay();
		
		System.out.println("\"Why are you just standing there, we have to go! NOW!!\"");
	}
	
	//The second option of the first time the user has to make a decision in this story
	public static void choice2Leave() {
		System.out.println("Turning away from the hammock and the trees it's tied to, you start to walk through the dense trees and underbrush.");
		System.out.println("You touch the bark of a tree as you pass, rough and splintery wood caressing your hand");
		System.out.println();
		
		delay();
		
		System.out.println("Heaving a nervous breath, you continue walking, trying to see anything that you might recognize.");
		System.out.println("You stop for a second, hearing the rush of... ocean waves crashing into the beach");
		System.out.println();
		
		delay();
		
		System.out.println("You continue on, listening to the ocean sound grow louder and louder");
		System.out.println("You clear the line of trees, realizing that you are on the edge of a sea cliff.");
		System.out.println();
		
		delay();
		
		System.out.println("You hear footsteps pounding your way...");
		System.out.println();
		
		delay();
		
		System.out.println("\"JUMP!!\"");
	
	}

}
