/*
THIS IS THE UPDATED PIT.JAVA CLASS FILE.

*/

import java.util.* ;
public class Pit extends GameItem 
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
	 * About the Pit Class:
	 * a. If the player lands on the pit it is Game-over!
	 * 
	 */
	
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Attributes[Variables] Here
	 private String PitWarning="A Breeze";
     private String PitOnLandResult="Landed on Pit Game Over!";

	
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	 //=========================================================================
	 // Define the constructor method
	 /*
	 *  Pit( )
	 */	
	 
		public Pit() 
		{
			// create an instance of the Pit class 
			// to be able to call the Game class methods


		}// close Pit()	
	
    //=========================================================================
    
     
	    //=========================================================================    
		public String getWarning()
		// Define the  getWarning()  method
			/*
			This  get gameWarning and appends Pit Warnings to it
			and updates gameWarning
			 */	
			 
		 //========================================================================      
		{
			return PitWarning;
			
		}// close getWarning()	

	
		//========================================================================= 
	    public String getResult()     
		// Define the getResult() method
		
			/*This gets gameResults  and appends PitOnLandResult to it */	
			
		 //========================================================================      
		{
			return PitOnLandResult;
		}// close getResult()
		//=========================================================================	
		
		
		
		
    //public void action()
	//=========================================================================      
	// Define the action() method
		/*
		Game calls getGameResults() to return the string gameReslts. Then Game  
		calls  setGameResults(PitOnLandResult) to set the message “Landed on 
		Pit,Game Over!” on the GameItem parent class.Finally, gameResults in 
		GameItem 
		parent class shall have the value “Landed on Pit,Game Over!”
		 
		 */	
		 
	 //========================================================================      
	//{

		// This returns the string "gameReslts" value
	    //gameReslts=PitOnLandResult;
    	     //String str=PitOnLandResult;
    	    // Game gme=new Game();
    	    // gme.setGameResults(str);
    	     
    	     
		
		//pitGamItem.setGameResults(PitOnLandResult);
	//}//
	//=========================================================================	 

///////////////////////////////////////////////////////////////////////////
}//close class Pit