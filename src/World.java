
public class World 
{
	/*--------------------------------------------------------------------------
	 * This is a project of Team Invicibles, 
	 * This team consisting of the following members:
	 * 
	 * Michael John Little:9905648@student.rmit.edu.au
	 * Project Team Lead
	 * Mob: +61 476 136 482
	 * 
	 * Andrew Moran:s3644396@student.rmit.edu.au 
	 * Project Team member
	 * 

	 * 
	 * ------------------------------------------------
	 * About this Game, Wumpus is a text-based game where a player:
	 * a. Moves through a cave system searching for gold [there are threee]
	 * b. Tries to avoid bottomless pits [there is one]
	 * c. Tries to avoid a feared Wumpus [this is one].
	 * 
	/*--------------------------------------------------------------------------
	 * 
	 */

	public static void main(String[] args) 
	 /*
	/*--------------------------------------------------------------------------
	 * About this Main() Method:
	 * 1. Makes a call to the Game-board constructor which will 
	 *      setup two boards:
	 * 		a. The Player Game-board over-lay
	 * 		b. The game item Game-board under-lay
	 *   
	 * 
	 * 
	 * 
	 * 
	 
	 /*--------------------------------------------------------------------------
	 */
	{
	   	//////////////////////////////////////////////////////////////////
		//Define Main() Attributes[Variables] Here
		final int numRows = 4; 
		//this is hard coded to be 4, but it is better to use the variable
		final int numCols = 4;   
		//this is hard coded to be 4, but it is better to use the variable
		
		
	  	//////////////////////////////////////////////////////////////////
	  	//Define Main() Programatic Flow from Here
		
		//this makes a call to the constructor that passes in
		//the board dimensions
		//Creates a new Game instance called "mygame"
		Game mygame=new Game(numRows,numCols);
		
		//now it will set up the Gameboards for:
		//a. The player over-lay game-board
		//b. The game-item under-lay game-boards;
		mygame.setBoard();
		do 
		{
			System.out.println("   ");
			System.out.println("   Welcome to Wumpus!");
			System.out.println("==========================");
			
			mygame.display();
			// Display the game board
			
			mygame.Warnings();
			// This method prints out to the screen 
			// Messages such as "Foul Smell", "Glitter"
			// "Breeze"
			// it will use a file to store the messages strings
			// System.out.println("getGameResults()"+mygame.getGameResults());;
			mygame.getScoreGameResult();
			// This method prints out to the screen
			// The score, "Game Won", or "Game Lost"
			
			System.out.println("   ");
			mygame.menu();
			
			mygame.runGame();
			// This method involves 
			// moving the player position
			// calling SenseAt() for the Player
			// calling SenseNearby() around the player position
		}
		while (mygame.getGameEnd()!="End");
		
		




		
		

	}//close main method

}
