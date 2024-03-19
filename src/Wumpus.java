/*
THIS IS THE UPDATED GOLD.JAVA CLASS FILE.

*/
public class Wumpus extends GameItem
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
	 * About the Wumpus Class:
	 * a.
	 * 
	 * 
	 * 
	 * 
	 */
	
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Attributes[Variables] Here
	 private String WumpusWarning="A Foul Smell";
     private String WumpusOnLandResult="Landed on Wumpus Game Over!";
	
	
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	
	//=========================================================================
	// Define the constructor method
	/*
	*  Wumpus( )
	*/	
	 
		public Wumpus() 
		{
			// create an instance of the Pit class 
			// to be able to call the Game class methods


		}// close Wumpus)	
	
    //=========================================================================
	
	    //=========================================================================    
		public String getWarning()
		// Define the  getWarning()  method
			/*
			This  get gameWarning and appends Wumpus Warnings to it
			and updates gameWarning
			 */	
			 
		 //========================================================================      
		{
			
			// implementation to go here... wait out..
			String tmp; 
			String str;
			// temporary local variable for holding the string.
			//tmp=gameWarns;
			
			//Game gme=new Game();
			//tmp= gme.getGameWarnings();

			//StringBuilder wumpusBuffer = new StringBuilder().append(tmp).append(" ").append(WumpusWarning); 
			//str=wumpusBuffer.toString();
			//gme.setGameWarnings(str);
			
			return WumpusWarning;

			
			
		}// close getWarning()	
		
		//========================================================================= 
	    public String getResult()     
		// Define the getResult() method
		
			/*This gets gameResults  and appends PitOnLandResult to it */	
			
		 //========================================================================      
		{
			return WumpusOnLandResult;
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
        
	     //String str=WumpusOnLandResult;;
	    // Game gme=new Game();
	    // gme.setGameResults(str);
		
		//pitGamItem.setGameResults(PitOnLandResult);
	//}//
	//=========================================================================	


}
