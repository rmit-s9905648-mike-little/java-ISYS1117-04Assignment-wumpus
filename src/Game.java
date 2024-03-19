/*
THIS IS THE UPDATED GAME.java CLASS.
This was updated Saturday 7 Oct 2017, 21:19
Added:
a. getScoreGameResults()
b. getScoreGameResult().. under development
c. Warning()
d. tallyScore() 

*/



import java.util.* ;
import java.util.Scanner;

public class Game 
{
////////////////////////////////////////////////////////////////////////////////	
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
	 * About the GAME Class:
	 * a.
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
		
		private int numPitItem=3;
		// This is the number of pits in the game.

		private int numGoldtem=3;
		// This is the number of Gold in the game.
		
		private int score;
		// this holds the score
		
		// There is one Wumpus
	
		private  String[][] playerGrid = new String[4][4];
		// this is the array for the Player board		
		// this is hard coded [4][4]... how do I generise this??		
		
		private GameItem[][] gameitemGrid= new GameItem[4][4];
		// this is the array for the GameItem board	
		// this is hard coded [4][4]... how do I generise this??		
	
		private int PlayerStartPosRow;
		// player starting variable position Row Pos
		// This is the position that gets assigned 
		// once the position of the initial clear ground determined
		private int PlayerStartPosCol;
		// player starting variable position Col Pos	
		// This is the position that gets assigned 
		// once the position of the initial clear ground determined
		
		private String player ; 
		
		private int PlayerPosRow;
		// player variable position Row Pos
		private int PlayerPosCol;
		// player variable position Col Pos		
		
		private char input;
		//private String input;
		// this stores the selection from the keyboard
		
		private String gameEnd;
		//This will be set to "End" to stop execution.

		
		private char displayChar;
		// this is the variable for the display character
		// This is '.' for empty space
		// This is 'p' for a pit
		// This is 'g' for a gold
		// This is 'w' for a wumpus
		// this is 'c' for a clear ground
		// this is '*
		
		private String gameWarns; 
	    // this contains appended warnings
	    private String gameReslts; 
	    // this contains appended results such 
	    // as "Game Over"
	
		

	 
	 
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	//=========================================================================
		// Define the constructor method
		/*
		*  Game( )
		*/		 
		public Game() 
		{
			// create an instance of the Game class 
			// to be able to call the Game class methods


		}// close Game()	
		
	//=========================================================================
	// Define the constructor method
	/*
	*  Game( int numRows, int numCols)
	*/	
	 
		public Game(int numRows, int numCols) 
		{
			
			//This initialises the dimensions of the player and gameitem boards.
			numRws=numRows;
			numCls =numCols;
			
			// this is the array for the GameBoard Player board
			// this is hard coded [4][4]... how do I generise as:  
			// private  String[][] playerGrid = new String[4][4];
			
			
		}// close Game(int numRows, int numCols) 

	//=========================================================================
	// Define the method genRandom(int num)
	/*
	* /This method genRandom(int num)  that generate a //random integer 
	* number ...in the integer rang of 0...num. The method will 
	* produce an integer between 0.. and num.
	* 
	*/
		public int genRandom(int num)
		{
		   //declare a Private integer value 
		   Random randomGenerator = new Random();
		   int guess = randomGenerator.nextInt(num);
		   return guess;
		} //close genRandom(int num)
		
	
		
	//=========================================================================
	// Define the method setBoard()
	/*
	* This method shall set up the following boards:
	* a. playerGrid[][] which is used to display the position of the player
	* b. gameitemGrid[][] which shall be used to managing the game items
	* 
	*/
	 	public void setBoard()
	 	{
	 		//-----------------------------------------------------------------
	 		//Define the internal attributes of this method
	 		
	 		  int rw;
		 	  // row position game item.
		 	  int cl;
		 	  // col position of game item.


		 	  
		 	  int numtries=numRws*numCls;
		 	  // As there are numRws*numCls positions on the board
		 	  // make numRws*numCls tries to place all items.
		 	  
	 		//-----------------------------------------------------------------
	 		//First define the array for the Player board

			 	 displayChar='.';
			 	 //First populates the playerGrid with "."
			 	 
	 	      for (int row=0; row<numRws; row++)
	 	      {
	 	            for (int column=0; column<numCls;column++)
	 	            {
	 	            	//String.valueOf(char c)
	 	            	playerGrid[row][column]=String.valueOf(displayChar);

	 	            }// close column for loop

	 	      }// close row for loop
	 	      
	 	   //populate the playerGrid GameBoard.    

		  //-----------------------------------------------------------------
		  // Now define the array for the Game item grid 
	 	   
	 	  GameItem[][] gi= new GameItem[4][4];
	 	 // Declare a local object variable "gi" that will 
	 	 // used to test the array location for 
	 	 // what instanceof is at that location. 
	 	 // This object is local to this method 
    
		  //-----------------------------------------------------------------	 	 
		  // Now define the position of the pits in the array
	 	  // In this game there are three pits.
	 	  //numPitItem=3;
	 	  
	 	 displayChar='p';
	 	//Populates the playerGrid with the position of the pits
	 	   for (int index=1;index<=numPitItem; index++)
	 	  	{
	 	        rw=genRandom(numRws);
	 	        // debug statement
	 	       //System.out.println("rw:"+ rw);
	 	        
	 	        cl=genRandom(numCls);
	 	       // debug statement
	 	       //System.out.println("cl:"+ cl); 
	 	        
	 	  		Pit pt =new Pit(); 
	 	        gameitemGrid[rw] [cl]=pt;
	 	       //System.out.println("gameitemGrid "+gameitemGrid[rw] [cl]);
	 	        
	 	   	playerGrid[rw][cl]=String.valueOf(displayChar);
	 	  	} //close the for loop for positioning the pits

		  //-----------------------------------------------------------------	 	 
		  // Now define the position of the gold in the array
		  // In this game there are three gold.
		  // numGoldItem=3;
	 	  // They will be randomly positioned.
	 	   
		   displayChar='g';
		   //Populates the playerGrid with the position of the gold
	 	   for (int index=1; index <= numGoldtem; index++)
	 	   {
	 		   rw=genRandom(numRws);
	 		   cl=genRandom(numCls);

	 		   //now return what is the object type at gi[rw][ cl]
	 		   gi[rw][ cl]=gameitemGrid[rw][ cl];
	 		   
	 		   //debugging
	 		   //System.out.println("gi:"+ gi[rw][ cl]); 
	 		 
	 		   
	 		  for (int tries=0; tries<=numtries;tries++ )
	 		  {
	 			  if ( gi[rw][cl] instanceof Pit )
	 			  {  
	 				  // The object at [rw][cl] is an instance of a Pit
	 				  // Generate another random position
	 				  // to retrieve what is at
	 				  // that position.
	 				  rw=genRandom(numRws);
		 	 		 cl=genRandom(numCls);
		 	 		 gi[rw][cl]= gameitemGrid[rw][cl];	
	 			  }//close if
	 			  else 
	 			  { 
	 				// The object at [rw][cl] is  not an instance of a Pit
	 				// assign a Gold object at that position
	 				// Break out of the for loop 
	 				 Gold gl=new Gold(); 
		 	     	 gameitemGrid[rw][cl]=gl;
		 	     	 playerGrid[rw][cl]=String.valueOf(displayChar);
		 	     	 break;  
	 			  }// close the else statement
	 			  
	 			  
	 		  }// close the for (int tries=0; tries<=numtries;tries++ ) loop 	   
	 	 	

	 	 } //close the number of numGoldItem loop
	 	   
		
	 	
			//-----------------------------------------------------------------	 	 
			// Now define the position of the Wumpus in the array
			// In this game there are one Wumpus.
		 	// It will be randomly positioned.
		 	   

		 	rw=genRandom(numRws);
		 	cl=genRandom(numCls);

		 	//now return what is the object type at gi[rw][ cl]
		 	gi[rw][ cl]=gameitemGrid[rw][ cl];
		 	
			displayChar='w';
			//Populates the playerGrid with the position of the wumpus	 
		 		   
		 	for (int tries=0; tries<=numtries;tries++ )
		 	{
		 		if (( gi[rw][cl] instanceof Pit )|( gi[rw][cl] 
		 		       instanceof Gold) )
		 			{  
		 				// The object at [rw][cl] is an instance of a Pit or 
		 				// Gold
		 				// Generate another random position
		 				// to retrieve what is at
		 				// that position.
		 				rw=genRandom(numRws);
		 				cl=genRandom(numCls);
		 				gi[rw][cl]= gameitemGrid[rw][cl];	
		 			  }//close if
		 		else 
		 			  { 
		 				// The object at [rw][cl] is  not an instance of a Pit or      
		 				//  Gold, and assign a Wumpus object at that position
		 				// Break out of the for loop 
		 				// 
		 				 Wumpus wu=new Wumpus(); 
			 	     	 gameitemGrid[rw][cl]=wu;
			 	     	 playerGrid[rw][cl]=String.valueOf(displayChar);
			 	     	 break;  
		 			  }// close the else statement
		 			  
		 			  
		 		  }// close the for (int tries=0; tries<=numtries;tries++ ) loop  
	 	   
			  //-----------------------------------------------------------------	 	 
			  // Now define the position of the clear ground in the array
			  // In this game there are one clear ground.
		 	  // It will be randomly positioned.
		 	  // once found, the starting position of the player will
		 	  // assigned to it. 
		 	   

		 		   rw=genRandom(numRws);
		 		   cl=genRandom(numCls);

		 		   //now return what is the object type at gi[rw][ cl]
		 		   gi[rw][ cl]=gameitemGrid[rw][ cl];
		 		   

					displayChar='*';
					//Populates the playerGrid with the position of the player			 		 
		 		   
		 		  for (int tries=0; tries<=numtries;tries++ )
		 		  {
		 			  if (( gi[rw][cl] instanceof Pit )|( gi[rw][cl] instanceof 
		 			        Gold)|( gi[rw][cl] instanceof Wumpus) )
		 			  {  
		 				  // The object at [rw][cl] is an instance of a Pit or 
		 				  //  Gold
		 				  // or Wumpus
		 				  // Generate another random position
		 				  // to retrieve what is at
		 				  // that position.
		 				  rw=genRandom(numRws);
			 	 		 cl=genRandom(numCls);
			 	 		 gi[rw][cl]= gameitemGrid[rw][cl];	
		 			  }//close if
		 			  else 
		 			  { 
		 				// The object at [rw][cl] is  not an instance of a Pit 
		 				//  or      
		 				//  Gold, or Wumpus object at that position
		 				// assign clear ground
		 				// use the position of the clear ground
		 				// to place the payer  
		 				// Break out of the for loop 
		 				// 
		 				 ClearGround cg=new ClearGround(); 
			 	     	 gameitemGrid[rw][cl]=cg;
			 	     	 playerGrid[rw][cl]=String.valueOf(displayChar);
			 	     	 //System.out.println("Start player rw: " + rw + " cl " +cl);
			 	         // this assigns the "player" position on the playerGrid 
			 	         //   board.
			 	     	 
			 	     	 PlayerStartPosRow= rw ;
	                     // player position Row pos
			 	     	PlayerStartPosCol= cl ;
	                     // player position Col pos	
			 	     	 break;  
		 			  }// close the else statement
		 			  
		 			  
		 		  }// close the for (int tries=0; tries<=numtries;tries++ ) loop 


	 	}// close method setBoard()
	 	
	 	
		//=========================================================================
		// Define the display method
		/*
		*  display method
		*/
	 	public void display()
	 	{
	 		//char displayChar;
	 		// a temporary char variable
	 		
			//String[][] playerGrid = new String[4][4];
			//String playerPOS; 
			// Here we continually update the playerXXX to check for danger or 
			// gold
			
			
			for(int row=0; row < playerGrid.length; row++) 
			{
	            for(int col=0; col < playerGrid[row].length; col++) 
	            {
	            		if (playerGrid[row][col] == playerGrid[row][col]) 
	            		{
	            			System.out.print(playerGrid[row][col] + "\t");
	            		} // close if (playerGrid[row][col] == 
	            		//   playerGrid[row][col])
	            		else 
	            		{ 
	            		//playerGrid[row][col] = "."; 
	            		System.out.print(playerGrid[row][col] + "\t");
	               	} // close else statement
	              
	          }// close for(int col=0; col < playerGrid[row].length; col++) 
	          System.out.println();
	        }// close for(int row=0; row < playerGrid.length; row++) 
			
			//debug
			//System.out.println("PlayerStarting Position, Row:"+PlayerStartPosRow);
	        //System.out.println("PlayerStarting Position, Col:"+PlayerStartPosCol);

	 	}//close display
	
	 	//=========================================================================
		// Define the menu method
			/*
			 *  menu()
			 *  About this method:
			 *  This method presents a menu and captures the input.
			 *  
			 */
	 	public void menu()
	 	{
	 		String keyop; 
	 		//this is the string that holds key press
	 		//this is a local variable
	 		
	 		if (gameEnd!="End")
	 		{
		 		System.out.println(" =====Menu====");
		 		System.out.println("Move player left   :   1");
		 		System.out.println("Move player right  :   2");
		 		System.out.println("Move player up     :   3");
		 		System.out.println("Move player down   :   4");
		 		System.out.println("Quit               :   q");
		 		System.out.print("Your choice        :"    );
	 		}// close if (gameEnd!="End")

	 		
	 		/* resource leak.. need a try.. finally block..
	 		 * Scanner scanner = null;
             try {
                    Scanner keyboard = new Scanner(System.in);	 		

                 }//close try
             finally {
                      if(scanner!=null)
                     scanner.close();
                      }//close finally
	 		 */
	 		
	 		Scanner keyboard = new Scanner(System.in);	 		
	 		keyop= keyboard.nextLine();
	 		input=keyop.charAt(0);
	 		
	 		if (input=='q')
	 		{
	 			gameEnd="End";
	 		} // to force game end.

	 		
	 	}// close the menu() method
	 	
	 	
	 	
	 	
	

	 	
	//=========================================================================
	// Define the method getGameEnd()
	/*
	* This method gets the gameEnd as "End"
	* Returns the input 
	*/
	 	public String getGameEnd()
	 	{
	 		return gameEnd;
	 	}//close getInput()
	 	
//=========================================================================
/* runGame()
	 	// this stores the selection from the keyboard

	 	a. Player choose a move:

	 	Move player left   : 	1
	 	Move player right  :   	2
	 	Move player up     :   	3
	 	Move player down 5 :   	4

	 	b. Game retrieves the keyboard "input"
	 	c. Game uses switch statement to determine the player move position
	 	  [except it will ignore the Quit] 
	 	d. Game will execute the  senseAt(String gameItemType, int playerPsRw, int PlayerPsCl  ) {} 
	 	at the player postion and this  method will call the polymorphic action() method 
	 	   to determine whether what is at that position,  and the actions to take.. 	 	   
	 	e. Game will  execute the Pubic Void SenseNearby(int PlayerPosRow, int PlayerPosCol) to sense 
	 	   what is around the player position
	 	*/
	 	public void runGame()
	 	{
	 		String gameItemType;
	 		 switch(input) 
	 		 {
 	         case '1' :
 	            // Move player left  1 pos by col
 	            // PlayerPosRow
 	           if ((PlayerStartPosCol)<=0)
 	           {
 	        	   		//System.out.println("numCls: " +numCls);
 	        	   		PlayerPosCol=numCls-1;
 	            }//close if statement
 	            else 
 	            {
 	            		PlayerPosCol=PlayerStartPosCol-1;
 	            }//close else statement
 	           
 	           //move player on player grid
 	           // displayChar='.'// old position
 	           displayChar = '.';
 	           playerGrid[PlayerStartPosRow][PlayerStartPosCol]=String.valueOf(displayChar);
 	           
 	           displayChar = '*';
 	           // displayChar='*'// new position
 	           PlayerPosRow=PlayerStartPosRow;
 	          // because her player moves by col, no change in row pos
 	          // make old and now row pos the same.
 	          // Without this row pos reset to zero.
 	           playerGrid[PlayerPosRow][PlayerPosCol]=String.valueOf(displayChar);
 	           // now store the new start position 
 	           PlayerStartPosRow=PlayerPosRow;
 	           PlayerStartPosCol=PlayerPosCol;

 	           gameItemType= "player";
 	           // Sense at the player position
 	            senseAt(gameItemType,PlayerPosRow, PlayerPosCol);
 	           gameItemType= "other";
 	           SenseNearby(gameItemType,PlayerPosRow, PlayerPosCol);
 	            break;
 	          
 	         case '2' :
 	         	// Move player right 1 pos
 	         	// PlayerPosRow
 	           if ((PlayerStartPosCol) == 3)
 	           {
 	        	   		PlayerPosCol=numCls-4;
 	            }//close if statement
 	            else 
 	            {
 	            		PlayerPosCol=PlayerStartPosCol+1;
 	            }//close else statement
 	           
 	           //move player on player grid
 	           // displayChar='.'// old position
 	           displayChar = '.';
 	           playerGrid[PlayerStartPosRow][PlayerStartPosCol]=String.valueOf(displayChar);
 	           
 	           displayChar = '*';
 	           // displayChar='*'// new position
  	           PlayerPosRow=PlayerStartPosRow;
  	          // because her player moves by col, no change in row pos
  	          // make old and now row pos the same.
  	          // Without this row pos reset to zero.
 	           playerGrid[PlayerPosRow][PlayerPosCol]=String.valueOf(displayChar);
 	           // now store the new start position 
 	           PlayerStartPosRow=PlayerPosRow;
 	           PlayerStartPosCol=PlayerPosCol;
               
 	           gameItemType= "player";
 	           // Sense at the player position
 	            senseAt(gameItemType,PlayerPosRow, PlayerPosCol);
  	           gameItemType= "other";
  	           SenseNearby(gameItemType,PlayerPosRow, PlayerPosCol);
 	            break;  	 	          
 	            
 	         case '3' :
 	            // Move player up 1 pos
  	            // PlayerPosRow
  	        	//debugging
  	           if ((PlayerStartPosRow)<=0)
  	           {
  	        	   		PlayerPosRow=numCls-1;
  	            }//close if statement
  	            else 
  	            {
  	            		PlayerPosRow=PlayerStartPosRow-1;
  	            }//close else statement
  	           
  	           //move player on player grid
  	           // displayChar='.'// old position
  	           displayChar = '.';
  	           playerGrid[PlayerStartPosRow][PlayerStartPosCol]=String.valueOf(displayChar);
  	          
  	           displayChar = '*';
  	           // displayChar='*'// new position
   	           PlayerPosCol=PlayerStartPosCol;
   	            // because her player moves by row, no change in col pos
   	            // make old and now col pos the same.
   	            // Without this col pos reset to zero.
  	           playerGrid[PlayerPosRow][PlayerPosCol]=String.valueOf(displayChar);
  	           // now store the new start position 
  	           PlayerStartPosRow=PlayerPosRow;
  	           PlayerStartPosCol=PlayerPosCol;
      
  	           gameItemType="player";
	           senseAt(gameItemType,PlayerPosRow, PlayerPosCol);
	           gameItemType= "other";
	           SenseNearby(gameItemType,PlayerPosRow, PlayerPosCol);
          	   break;
          			
         		case '4' :
 	            // Move player down 1 pos
  	            // PlayerPosRow
  	        	//debugging

  	           if ((PlayerStartPosRow) == 3)
  	           {
  	        	   		PlayerPosRow=numCls-4;
  	            }//close if statement
  	            else 
  	            {
  	            		PlayerPosRow=PlayerStartPosRow+1;
  	            }//close else statement
  	           
  	           //move player on player grid
  	           // displayChar='.'// old position
  	           displayChar = '.';
  	           playerGrid[PlayerStartPosRow][PlayerStartPosCol]=String.valueOf(displayChar);
  	          
  	           displayChar = '*';
  	           // displayChar='*'// new position
   	           PlayerPosCol=PlayerStartPosCol;
   	           // because her player moves by row, no change in col pos
   	           // make old and now col pos the same.
   	           // Without this col pos reset to zero.
  	           playerGrid[PlayerPosRow][PlayerPosCol]=String.valueOf(displayChar);
  	           // now store the new start position 
  	           PlayerStartPosRow=PlayerPosRow;
  	           PlayerStartPosCol=PlayerPosCol;
  	            
  	           gameItemType="player";
	           senseAt(gameItemType,PlayerPosRow, PlayerPosCol);
	           gameItemType= "other";
	           SenseNearby(gameItemType,PlayerPosRow, PlayerPosCol);
 	            break;
 	            
 	         default :
 	            // do nothing for other keyboard inputs
 	            // Except "q" which is handled in the 
 	            // Main method of World.java
 	      }// end the switch statement
 	      
	 		
 	}// end Public void runGame()

//========================================================================= 	
/*
	 	senseAt(String gameItemType, int playerPsRw, int  PlayerPsCl  )

	 	Developed by Mike Little and Andrew Moran...

	 	The Player Position is [PlayerPosRow][PlayerPosCol]
	 	Where the board is of dimensions [numRws][numCols].

	 	This method is called senseAt() and it is used in two ways:
	 	a. Sensing at the Player Position gameItemType=player
	 	b. Sensing at positions one space up, right, bottom, and left
	 	   called by senseNearby(), where gameItemType=other
	 	   
	 	String gameItemType;
	 	this variable has two values: player, other
	 	this method is passed into the senseAt() method

	 		
	 	   
	 	*/
	 	
	 	public void senseAt(String gameItemType, int playerPsRw, int PlayerPsCl)
	 	{  
	 		String gmeItmTpe=gameItemType; 
	 		//This has two values: Player, Other
	 		
	 		
	 		int rw=playerPsRw;
	 		int cl=PlayerPsCl;
	 		Gold gld=new Gold();
			Pit pt=new Pit();
			Wumpus wmps=new Wumpus();
	 		
	 		
	 		// Now define the array for the Game item grid 
	 		 	   
	 		GameItem[][] gi= new GameItem[4][4];
	 		// Declare a local object variable "gi" that will 
	 		// used to test the array location for 
	 		// what instanceof is at that location. 
	 		// This object is local to this method 
	 		 	 
	 	 	//now return what is the object type at gi[rw][ cl]
	 	 	gi[rw][ cl]=gameitemGrid[rw][cl];

	 		//String other;
	 		// debug 
	 		
			if (gmeItmTpe=="player")
	 			{
	 			 	if ( gi[rw][cl] instanceof  Gold) 
	 				{ 
	 					//gld.action(rw,cl );
	 			 		
	 			 		gameReslts="Gold Found!";
	 			 		//System.out.println("gameReslts"+gameReslts); 
	 			 		//gameReslts=gld.getResult();
	 					//gme.setGoldAsClearGround( int PlayerPosRow, int PlayerPosCol); 
	 					setGoldAsClearGround(PlayerPosRow, PlayerPosCol);
	 			 		
	 				} //close if ( gi[rw][cl] instanceof  Gold) 
	 				else if ( gi[rw][cl] instanceof Pit  )
	 				{
	 					gameReslts="Landed on Pit Game Over!";
	 					//System.out.println("gameReslts"+gameReslts);
	 					//gameReslts=pt.getResult();
	 				} // close if ( gi[rw][cl] instanceof Pit  )
	 				if ( gi[rw][cl] instanceof Wumpus)
	 				{
	 					gameReslts="Landed on Wumpus Game Over!";
	 					//System.out.println("gameReslts"+gameReslts);
	 					//gameReslts=wmps.getResult();
	 				}// close if ( gi[rw][cl] instanceof Wumpus)
	 			} // close if (gmeItmTpe==player)
	 		
	 		else if (gmeItmTpe=="other")
	 			{
	 				if ( gi[rw][cl] instanceof  Gold) 
	 				{ 
	 					//gld.getWarning();
	 					String str=gld.getWarning();
	 					// temporary local variable for holding the string.
                         StringBuilder gldBuffer = new StringBuilder().append(" ").append(str); 
                         gameWarns=gldBuffer.toString();
	 					
	 					
	 				} //close if ( gi[rw][cl] instanceof  Gold) 
	 				else if ( gi[rw][cl] instanceof Pit  )
	 				{
	 					String str=pt.getWarning();
	 					// temporary local variable for holding the string.
                         StringBuilder pitBuffer = new StringBuilder().append(" ").append(str); 
                         gameWarns=pitBuffer.toString();
	 					
	 				} // close if ( gi[rw][cl] instanceof Pit  )
	 				if ( gi[rw][cl] instanceof Wumpus)
	 				{
	 					//wmps.getWarning();
	 					String str=wmps.getWarning();
	 					// temporary local variable for holding the string.
                         StringBuilder wmpsBuffer = new StringBuilder().append(" ").append(str); 
                         gameWarns=wmpsBuffer.toString();
	 					
	 					
	 				}// close if ( gi[rw][cl] instanceof Wumpus)
	 			
	 			}// close 
	 	}//close senseAt(String gameItemType, int    playerPsRw, int    
	 	   // PlayerPsCl  )

	 	//========================================================================= 	
	 	/*
		/* 
		Pubic Void SenseNearby(int PlayerPosRow, int PlayerPosCol)
		Developed by Mike Little and Andrew Moran...
		
		This method is called SenseNearBy(int PlayerPosRow, int PlayerPosCol) 
		and it senses the positions according to... [PlayerPosRow][PlayerPosCol]
		Where the board is of dimensions [numRws][numCols].
		At each of these positions this method will call the method 
		senseAt(String gameItemType, int    playerPsRw, int    PlayerPsCl  ) {}
		
		For example, if PlayerPosRow=0 && PlayerPosCol 0;
		
			(TC02.1) (Player Pos)  		SenseAt (Player, 0, 0)
		    (TC02.2)  (Top)            	SenseAt (Other,  0, 3)
		    (TC02.3) (Right)          	SenseAt (Other,  1, 0)
		    (TC02.4) (Bottom)       	SenseAt (Other,  0, 1]
		    (TC02.5) (Left)            	SenseAt (Other,  3, 0)
		
		
		And... some of the variabled needed here 
		 int 	numRws;
		 int 	numCls
		 String gmeItmTpe; //This has two values: Player, Other
		 int    playerPsRw; // Internal variable for the player Position Row
		 int    PlayerPsCl; // Internal variable for the player Position Col
		 
		
		The gmeItmTpe {player, other} is a variable to pass into this method to 
		determine the response by the SenseAt() the senseAt() method will  
		senseAt() at the co-ord position passed in.
		To determine what object is at that position and call the Action() 
		  method The Action() method is an abstract method that will be 
		  implemented in the children classes.
		 
		*/
		
		
public void SenseNearby(String gameItemType,int PlayerPosRow, int PlayerPosCol)
{
			String gmeItmTpe; //This has two values: Player, Other
		 	int    playerPsRw; // Internal variable for the player Position Row
		 	int    PlayerPsCl; // Internal variable for the player Position Col
		 
//		 	//Sense Pos Top
		 	int    sensePsRwTop = 0; // sense Position Row top
		 	int    sensePsClTop= 0; // sense Position Col top
		 	
//		 	//Sense Pos Right
		 	int    sensePsRwRght= 0; // sense Position Row top
		 	int    sensePsClRght= 0; // sense Position Col top 	
		 
//		 	//Sense Pos Bottom
		 	int    sensePsRwBttm= 0; // sense Position Row Bottom
		 	int    sensePsClBttm= 0; // sense Position Col Bottom
//		 	
		 	//Sense Pos Left
		 	int    sensePsRwLeft= 0; // sense Position Row Left
		 	int    sensePsClLeft= 0; // sense Position Col Left 	 	
		 	
		 	playerPsRw=PlayerPosRow;
		 	PlayerPsCl=PlayerPosCol;
		 	numRws=4;
		 	numCls=4;
			
			// Characters on row 0
		 	// Determining SenseAt Positions Row
			if  (playerPsRw==0)
			{
				sensePsRwTop=	PlayerPosRow+3;
				sensePsRwRght=	PlayerPosCol+1;
				sensePsRwBttm=	PlayerPosRow+1;
				sensePsRwLeft=	PlayerPosCol-1;	
			}// close  if (playerPsRw==0)
			
			else if (playerPsRw==3)
			{
				sensePsRwTop=	PlayerPosRow+1;
				sensePsRwRght=	PlayerPosCol+1;
				sensePsRwBttm=	PlayerPosRow-3;
				sensePsRwLeft=	PlayerPosCol-1;		
			}
			
			// Characters on col 0
		 	// Determining SenseAt Positions Row
			
			// PlayerPsCl should be playerPsCl !!
			else if  (PlayerPsCl==0)
			{
				sensePsClTop=	PlayerPosRow+1;
				sensePsClRght=	PlayerPosCol+1;
				sensePsClBttm=	PlayerPosRow-1;
				sensePsClLeft=	PlayerPosCol+3;	
			}// close  if (playerPsRw==0)
			
			// Everybody else
			
			else if (PlayerPsCl==3)
			{
				sensePsClTop=	PlayerPosRow+1;
				sensePsClRght=	PlayerPosCol-3;
				sensePsClBttm=	PlayerPosRow-1;
				sensePsClLeft=	PlayerPosCol-1;
			}
			else
			{
				sensePsClTop=	PlayerPosRow+1;
				sensePsClRght=	PlayerPosCol+1;
				sensePsClBttm=	PlayerPosRow-1;
				sensePsClLeft=	PlayerPosCol-1;
				
				sensePsRwTop=	PlayerPosRow+1;
				sensePsRwRght=	PlayerPosCol+1;
				sensePsRwBttm=	PlayerPosRow-1;
				sensePsRwLeft=	PlayerPosCol-1;
			}
			 
			//String gmeItmTpee= "other";
			//String gameItemType= "other";
	         // Sense at the player position
			//senseAt(String gameItemType, int playerPsRw, int PlayerPsCl)
			senseAt( gameItemType,  		sensePsRwTop,	sensePsClTop); 		//Top
			senseAt( gameItemType, 		sensePsRwRght,	sensePsClRght); 	    //Right	
			senseAt( gameItemType,  		sensePsRwBttm,	sensePsClBttm); 	    //Bottom	
			senseAt( gameItemType,  		sensePsRwLeft,	sensePsClLeft);   	//Left	
	
}//// close SensenearBy()

	 	//=========================================================================	
	 	//=========================================================================	
	 	//=========================================================================	
		//=========================================================================
		// Define the method getScoreGameResult()
		/*
		* This method shall:
		* a.  Be used by the main method in the World.java class to return the
		*     Game school.
		*  b. Appends appends (int Score) to getGameResults() [from Gameitem]
		*  
		*  With this:
		*  a. Returns from the GameItem class the String gameResults by the 
		*     class method in GameItem by the method in this class 
		*     called [String] getGameResults() 
		*  b. This method using a  IF, ELSE decision branch…    
		*     
		*/
	 	// methods added by Mike little 2017-10-07	
	 	
		//=========================================================================
		// Define the method setGoldAsClearGround
		/*
		* This method shall:
		*  a.  This is used by the action(0 method in the Gold class.
		*  b. This uses the current gold position to be ClearGround
		*  
 
		*     
		*/
	 	// methods added by Mike little 2017-10-07	 	
	 	public void setGoldAsClearGround( int PlyPosRow, int PlyPosCol) 
	 	{
	 		ClearGround cgd=new ClearGround(); 
	     	 gameitemGrid[PlyPosRow][PlyPosCol]=cgd;
	 	}
		//=========================================================================
		// Define the method tallyScore() 
		/*
		* This method shall:
		*  a.  tallyScore() will check gameResults class variable in the gameIem class
		*  b.  and if gameResults=="Gold Found!" increment “score” by 1
		* 
		*  With this:
		*  Returns from the GameItem class the String gameResults by the class method in GameItem by 
		*  the method in this class called [String] getGameResults() 
		*  if gameResults=="Gold Found!" increment “score” by 1
		*  set the gameResults to null with setGameResults()=” “; 
		*  
		*     
		*/
	 	// methods 		 	

	 	
	 	
	 	
		//=========================================================================
		// Define the method setGoldAsClearGround
		/*
		* This method shall:
		*  a.  This is used by the action(0 method in the Gold class.
		*  b. This uses the current gold position to be ClearGround
		*  
 
		*     
		*/
	 	//  	 	
	 	public void Warnings()
	 	{
	 		if (gameWarns!=null)
	 		{
	 			System.out.println(gameWarns);
	 			
	 		}// cllose(gameWarns!=null)
	 		else
	 		{
	 			gameWarns=" ";
	 		}
	 	}// GameItemAccess.getGameWarnings();
	 	
	 	//=========================================================================
	 			// Define the method tallyScore()
	 			/*
	 			* This method shall:
	 			* a.  Be used by the  getScoreGameResult() method in the game.java class 
	 			*     to tally the game score.
	 			*  b. if Gold is found it will increment the score by 1
	 			*  
	 			*  With this:
	 			*  a. tallyScore() will check gameResults class variable in the 
	 			*    gameIem class
	 			*  b. if gameResults=="Gold Found!" increment “score” by 1
	 			*  c. set the gameResults to null with setGameResults()=” “;    
	 			*     
	 			*/
	 		 	// methods added by Mike little and Andrew Moran 2017-10-08

	 	public void tallyScore() 
	 	{
	 		    
	 			// methods to access the Gameitem variables 
	 			// are in the Clear Ground Ground class.. it is a kuldge! 
	 			
	 			String str=getGameResults();
	 			String clearout=" "; //this is a null
	 			
	 			if (str=="Gold Found!")
	 			{
	 				score++;
	 				setGameResults(clearout);
	 			}// close (str=="Gold Found!")
	 			
	 	}//close tallyScore()	
	 	
		// Define the method getScoreGameResult()
		/*
		* This method shall:
		* a.  Be used by the main method in the World.java class to return the
		*     Game school.
		*  b. Appends appends (int Score) to getGameResults() [from Gameitem]
		*  
		*  With this:
		*  a. Returns from the GameItem class the String gameResults by the 
		*     class method in GameItem by the method in this class 
		*     called [String] getGameResults() 
		*  b. This method using a  IF, ELSE decision branch…    
		*     
		*/
	 	// methods added by Mike little and Andrew Moran 2017-10-08
	 	
	 	//=========================================================================
	    // Define the method getScoreGameResult() 	
	public void getScoreGameResult()
	{

		//Game GameItemAccess=new Game();
		// methods to access the Gameitem variables 
		// are in the Clear Ground Ground class.. it is a kuldge! 
		String str=getGameResults();
		
		
		if (str=="Landed on Pit Game Over!")
		{
			//landed on pit
			System.out.println( str);
			gameEnd="End";
			// set gameEnd="End" to force the do loop in 
			// World main()  to quit
		}// close if statement
		
	else if (str=="Landed on Wumpus Game Over!")
		
		{
				//landed on wumpus
				System.out.println( str);
				gameEnd="End";
				// set gameEnd="End" to force the do loop in 
				// World main()  to quit
		} // close if statement

	else
		{
				// landed on gold
				// (getGameResults()==”Gold Found”)|
				//  calles tallScore() to update the [int] 
				//  score value in this method
				// tallyScore() will check gameResults class 
				// variable in the gameIem 
				//class
				// and if gameResults=="Gold Found!" increment “score” by 1
				tallyScore();

				if (score!=3) 
				{
					if (str!=null)
					{
						System.out.print(str);
						System.out.println("  your score:"+score);
					}
					
				}// if (score!=3)
				else // (score==3) 
				{
					 System.out.println("You Won, your score:"+score);
					 System.out.println("  Game Over!");
					 gameEnd="End";
				    // set input=”q” to force the do loop in World main()  
				    // to quit
				}//close  // (score==3) 

		}//close else statement
		
	}//	close getScoreGameResult()
	
	
	

 	//=========================================================================
    // Define the method setGameResult(String str) 	
	public String getGameWarnings()
	//=========================================================================
	// Define the getGameWarnings() method
		/*
		This method returns the concatenated game warnings such as 
		"Breeze", "Foul Smell", "Glitter"
		 */	
	 //========================================================================      
	{
		return gameWarns;
	}// close getGameWarnings()
	//=========================================================================



 	//=========================================================================
    // Define the method setGameResult(String str) 
	public void  setGameWarnings(String str)
	//=========================================================================
	// Define the  gameWarnings() method
		/*
		This sets gameWarnings to the incoming string
		 */
	 //========================================================================      
	{
		 gameWarns=str;
	}// close setGameWarnings(String str)
	//=========================================================================




 	//=========================================================================
    // Define the method setGameResult(String str) 
	public String getGameResults()
     //=========================================================================
	// Define the getGameResults() method
		/*
		This method returns the "gameResults"
		 */	
	 //========================================================================      
	{
		return gameReslts;
	}// close getGameResults()
	//=========================================================================



	
 	//=========================================================================
    // Define the method setGameResult(String str) 
	public void  setGameResults(String str)
     // gets string gameResults	
	//=========================================================================
	// Define the setGameResults() method
		/*
		This sets the internal class variable gameReslts to the incoming string
		 */	
		 
	 //========================================================================      
	{
		gameReslts=str;
	}// close setGameResults(String str)
	//=========================================================================



	 	
}//close class Game