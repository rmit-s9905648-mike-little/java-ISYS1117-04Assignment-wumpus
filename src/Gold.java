/*
THIS IS THE UPDATED GOLD.JAVA CLASS FILE.

*/
public class Gold extends GameItem 
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
	 * About the Gold Class:
	 * a.
	 * 
	 * 
	 * 
	 * 
	 */
	
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Attributes[Variables] Here
	 //Define Class Attributes[Variables] Here
	 private String GoldWarning="Glitter";
     private String GoldOnLandResult="Gold Found!";
	
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	//=========================================================================
	// Define the constructor method
	/*
	*  Gold( )
	*/	
	 
		public Gold() 
		{
			// create an instance of the Pit class 
			// to be able to call the Game class methods


		}// close Pit()	
	
    //=========================================================================
	
	     
		    //=========================================================================    
			public String getWarning()
			// Define the  getWarning()  method
				/*
				This  get gameWarning and appends Gold Warnings to it
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

				//StringBuilder goldBuffer = new StringBuilder().append(tmp).append(" ").append(GoldWarning); 
				//str=goldBuffer.toString();
				//gme.setGameWarnings(str);
				return GoldWarning;
 
			}// close getWarning()					


		
			//========================================================================= 
		    public String getResult()     
			// Define the getResult() method
			
				/*This gets gameResults  and appends PitOnLandResult to it */	
				
			 //========================================================================      
			{
				return GoldOnLandResult;
			}// close getResult()
			//=========================================================================	
			
			
			
			
	    //public void action(int PlayerPosRow, int PlayerPosCol)
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
		
	       	
			//Game gme=new Game();
			//gme.setGameResults(GoldOnLandResult);
			//gme.setGoldAsClearGround( int PlayerPosRow, int PlayerPosCol); 
			//gme.setGoldAsClearGround(PlayerPosRow, PlayerPosCol);
			
			
			
			//pitGamItem.setGameResults(PitOnLandResult);
		//}//
		//=========================================================================		
	


} //close class Gold
