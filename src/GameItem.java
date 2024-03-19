/*
THIS IS THE UPDATED GAMEITEM CLASS
THIS HAS BEEN UPDATED BY MIKE LITTLE 7/OCT/2017
*/

public abstract class GameItem 
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
	 * Shuliang Xin:s3647666@student.rmit.edu.au 
	 * Project Team member
	 * 
	 * Yongqi Zhong:s3691039@student.rmit.edu.au
	 * Project Team member
	 * 
	 * ------------------------------------------------
	 * About this Game, Wumpus is a text-based game where a player:
	 * a. Moves through a cave system searching for gold [there are threee]
	 * b. Tries to avoid bottomless pits [there is one]
	 * c. Tries to avoid a feared Wumpus [this is one].
	 * 
	/*--------------------------------------------------------------------------
	 * 
	 * About the GameItem Class:
	 * a This is abstract so it cannot be instantiated
	 * b.This class has a number of child classes which are
	 *  Gold extends GameItem
	 *  Pit  extends GameItem
	 *  Wumpus extends GameItem
	 *  ClearGround extends GameItem
	 * 
	 * 
	 * 
	 * 
	 */

	///////////////////////////////////////////////////////////////////////////
	//Define Class Attributes[Variables] Here
 	private int numRws; 
 	//number of row
	private int numCls;   
	//number of cols
	private char gameItemName;
	
	// Follow class attributes added 6/10/2017
	//protected String gameWarns; 
    // this contains appended warnings
   // protected String gameReslts; 
    // this contains appended results such 
    // as "Game Over"


	//////////////////////////////////////////////////////////////////
	//Define class methods from Here
	
	//=========================================================================
	// Define the constructor method
	/*
	*  Game( )
	*/	
	 
		public GameItem() 
		{
			// create an instance of the Game class 
			// to be able to call the Game class methods


		}// close Game()	
	
//=========================================================================
// Define the constructor method
/*
*  Game( int numRows, int numCols)
*/	
 
	public GameItem(int numRows, int numCols) 
	{
		// TODO Auto-generated constructor stub
		
		//This initialises the dimensions of the player and gameitem boards.
		numRws=numRows;
		numCls =numCols;
		
		// this is the array for the GameBoard Player board
		// this is hard coded [4][4]... how do I generise as:  
		// private  String[][] playerGrid = new String[4][4];
		
		
	}// close Game(int numRows, int numCols) 

	//=========================================================================
	// Define the GameItem(char c) constructor method
		/*
		 *  Where for GameItem(char c) , char c can be:
		 *  g for Gold
		 *  p for Pit
		 *  w for Wumpus
		 *  c for Clear ground 
		 *  
		 *  
		 */	

	public void GameItem(char c)
	{
		gameItemName=c;
	}// close GameItem(char c) constructor
	
	//=========================================================================
	
	public void actions()  // this is abstract
    //=========================================================================
	// Define the actions() method
		/*
		This is an abstract class that will be implemented in the child classes.
		Implementation detail left out here. 
		 */	
	//========================================================================
	{
		//implemented in child class.
	}
	 //======================================================================== 
		 
	
	//public String getGameWarnings()
	//=========================================================================
	// Define the getGameWarnings() method
	/*
	This is an abstract class that will be implemented in the child classes.
	Implementation detail left out here. 
	 */	
//========================================================================
//{
	//implemented in child class.
//}
 //======================================================================== 



	
	//public void  setGameWarnings(String str)
	//=========================================================================
	// Define the  gameWarnings() method
	/*
	This is an abstract class that will be implemented in the child classes.
	Implementation detail left out here. 
	 */	
//========================================================================
//{
	//implemented in child class.
//}
 //======================================================================== 





	//public void getGameResults()
     //=========================================================================
	// Define the getGameResults() method
	/*
	This is an abstract class that will be implemented in the child classes.
	Implementation detail left out here. 
	 */	
//========================================================================
//{
	//implemented in child class.
//}
 //======================================================================== 



	
	
	//public void  setGameResults(String str)
     // gets string gameResults	
	//=========================================================================
	/*
	This is an abstract class that will be implemented in the child classes.
	Implementation detail left out here. 
	 */	
//========================================================================
//{
	//implemented in child class.
//}
 //======================================================================== 



	
	
////////////////////////////////////////////////////////////////////////////////		
}// close class Gameitem








